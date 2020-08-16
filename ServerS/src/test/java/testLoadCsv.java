import cn.edu.nuaa.little1.gen.csv.CSVParser;
import cn.edu.nuaa.little1.gen.ss.SSLexer;
import cn.edu.nuaa.little1.gen.ss.SSParser;
import cn.edu.nuaa.little1.walker.CsvActioner;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import java.util.Scanner;

public class testLoadCsv {
    @Test
    public void run(){
        Scanner sc = new Scanner(System.in);
        String cmd = sc.nextLine();
        CharStream input = CharStreams.fromString(cmd);

        SSLexer lexer =new SSLexer(input);
        CommonTokenStream tokens =new CommonTokenStream(lexer);
        CSVParser parser = new CSVParser(tokens);

        ParseTree tree=parser.file();
        System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        CsvActioner ca=new CsvActioner();
        walker.walk(ca,tree);
        System.out.println(ca.rows);
    }
}
