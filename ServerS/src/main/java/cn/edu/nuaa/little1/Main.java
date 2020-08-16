package cn.edu.nuaa.little1;

import cn.edu.nuaa.little1.file.CSVFileHandler;
import cn.edu.nuaa.little1.gen.csv.CSVParser;
import cn.edu.nuaa.little1.gen.ss.SSLexer;
import cn.edu.nuaa.little1.gen.ss.SSParser;
import cn.edu.nuaa.little1.query.QueryManager;
import cn.edu.nuaa.little1.walker.CsvActioner;
import cn.edu.nuaa.little1.walker.SSActioner;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        CSVFileHandler.getCSVHandler().read("E:\\Users\\zongz\\Desktop\\little1\\ServerS\\src\\main\\resources\\test1.csv");

        Scanner sc = new Scanner(System.in);
        String cmd = sc.nextLine();
        // write your code here
        CharStream input = CharStreams.fromString(cmd);

        SSLexer lexer =new SSLexer(input);
        CommonTokenStream tokens =new CommonTokenStream(lexer);
        SSParser parser = new SSParser(tokens);

        ParseTree tree=parser.ss();
        System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker=new ParseTreeWalker();

        walker.walk(new SSActioner(),tree);
        System.out.println();
        QueryManager qm=QueryManager.getManager();
        List<String> result=qm.executeAllCmds();
        System.out.println(result.toString());
    }
}
