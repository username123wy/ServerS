package cn.edu.nuaa.little1.walker;

import cn.edu.nuaa.little1.gen.csv.CSVBaseListener;
import cn.edu.nuaa.little1.gen.csv.CSVParser;

import java.util.*;

public class CsvActioner extends CSVBaseListener {
    public static final String EMPTY="";
    public List<Map<String,String>> rows = new ArrayList<>();
    public List<String> header =new ArrayList<>();
    public List<String> currentRowFieldValues = new ArrayList<>();

    @Override
    public void exitString(CSVParser.StringContext ctx) {
        super.exitString(ctx);
        currentRowFieldValues.add(ctx.STRING().getText());
    }

    @Override
    public void exitText(CSVParser.TextContext ctx) {
        super.exitText(ctx);
        currentRowFieldValues.add(ctx.TEXT().getText());
    }

    @Override
    public void exitEmpty(CSVParser.EmptyContext ctx) {
        super.exitEmpty(ctx);
        currentRowFieldValues.add(EMPTY);
    }

    @Override
    public void exitHdr(CSVParser.HdrContext ctx) {
        super.exitHdr(ctx);
        header.addAll(currentRowFieldValues);
    }

    @Override
    public void enterRow(CSVParser.RowContext ctx) {
        super.enterRow(ctx);
        currentRowFieldValues=new ArrayList<>();
    }

    @Override
    public void exitRow(CSVParser.RowContext ctx) {
        super.exitRow(ctx);
        if(ctx.getParent().getRuleIndex()==CSVParser.RULE_hdr) return;
        Map<String,String> m=new LinkedHashMap<String,String>();
        int i=0;
        for(String v : currentRowFieldValues){
            m.put(header.get(i),v);
            i++;
        }
        rows.add(m);
    }
}
