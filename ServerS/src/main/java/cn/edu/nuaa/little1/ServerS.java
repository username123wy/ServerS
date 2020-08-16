package cn.edu.nuaa.little1;

import cn.edu.nuaa.little1.file.CSVFileHandler;
import cn.edu.nuaa.little1.gen.ss.SSLexer;
import cn.edu.nuaa.little1.gen.ss.SSParser;
import cn.edu.nuaa.little1.query.QueryManager;
import cn.edu.nuaa.little1.walker.SSActioner;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ServerS {
    public static String parse(String path,String cmd){
        List<String[]> csvData = (List<String[]>) CSVFileHandler.getCSVHandler().read(path);
        // write your code here
        CharStream input = CharStreams.fromString(cmd);

        SSLexer lexer =new SSLexer(input);
        CommonTokenStream tokens =new CommonTokenStream(lexer);
        SSParser parser = new SSParser(tokens);

        ParseTree tree=parser.ss();

        ParseTreeWalker walker=new ParseTreeWalker();

        walker.walk(new SSActioner(),tree);
        QueryManager qm=QueryManager.getManager();
        List<String> result=qm.executeAllCmds();

        String toClient=Arrays.toString(csvData.get(0))+"\n";
        System.out.println(Arrays.toString(csvData.get(0)));
        for(int i=0;i<csvData.size();i++){
            for(String index : result){
                if(index.equals(String.valueOf(i))){
                    toClient+=Arrays.toString(csvData.get(i))+"\n";
                    System.out.println(Arrays.toString(csvData.get(i)));
                }
            }
        }
        return toClient;
    }
}
