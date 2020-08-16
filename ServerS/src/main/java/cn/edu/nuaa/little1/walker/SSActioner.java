package cn.edu.nuaa.little1.walker;

import cn.edu.nuaa.little1.gen.ss.SSBaseListener;
import cn.edu.nuaa.little1.gen.ss.SSParser;
import cn.edu.nuaa.little1.query.Operator;
import cn.edu.nuaa.little1.query.QueryManager;
import cn.edu.nuaa.little1.query.operator.AndOperator;
import cn.edu.nuaa.little1.query.operator.OrOperator;
import cn.edu.nuaa.little1.query.queryImpl.*;

public class SSActioner extends SSBaseListener {
    @Override
    public void enterSimple_query(SSParser.Simple_queryContext ctx) {
        super.exitSimple_query(ctx);
        String ID=null;
        String allID=null;
        if(ctx.COLUMN_ID()!=null) {
            ID = ctx.COLUMN_ID().getText();
        }
        if(ctx.ALL_COLUMNS()!=null) {
            allID = ctx.ALL_COLUMNS().getText();
        }
        if(ID!=null) QueryManager.getManager().addID(ID);
        if(allID!=null) QueryManager.getManager().addID(allID);
//        System.out.println(ID+":"+allID);
    }

    private String tmpID="";

    @Override
    public void enterEqual_query(SSParser.Equal_queryContext ctx) {
        super.enterEqual_query(ctx);
        EqualQuery eq =new EqualQuery();
        SSParser.Simple_queryContext sct= (SSParser.Simple_queryContext) ctx.parent;

        if(ctx.STRING()!=null) {
            int length=ctx.STRING().getText().length()-1;
            eq.setContent(ctx.STRING().getText().substring(1,length));
            eq.setID(getID(sct));
        }
        QueryManager.getManager().addCmd(eq);
    }
    private String getID(SSParser.Simple_queryContext sct){
        String ID=null;
        String allID=null;
        if(sct.COLUMN_ID()!=null) {
            ID = sct.COLUMN_ID().getText();
        }
        if(sct.ALL_COLUMNS()!=null) {
            allID = sct.ALL_COLUMNS().getText();
        }
        if(ID!=null) return ID;
        if(allID!=null) return allID;
        return null;
    }

    @Override
    public void enterNot_equal_query(SSParser.Not_equal_queryContext ctx) {
        super.enterNot_equal_query(ctx);
        NotEqualQuery neq =new NotEqualQuery();
        SSParser.Simple_queryContext sct= (SSParser.Simple_queryContext) ctx.parent;

        if(ctx.STRING()!=null) {
            int length=ctx.STRING().getText().length()-1;
            neq.setContent(ctx.STRING().getText().substring(1,length));
            neq.setID(getID(sct));
        }
        QueryManager.getManager().addCmd(neq);
    }

    @Override
    public void enterCase_insensitive_equal_query(SSParser.Case_insensitive_equal_queryContext ctx) {
        super.enterCase_insensitive_equal_query(ctx);
        CaseEqualQuery ceq =new CaseEqualQuery();
        SSParser.Simple_queryContext sct= (SSParser.Simple_queryContext) ctx.parent;

        if(ctx.STRING()!=null) {
            int length=ctx.STRING().getText().length()-1;
            ceq.setContent(ctx.STRING().getText().substring(1,length));
            ceq.setID(getID(sct));
        }
        QueryManager.getManager().addCmd(ceq);
    }

    @Override
    public void enterContain_query(SSParser.Contain_queryContext ctx) {
        super.enterContain_query(ctx);
        ContainQuery cq =new ContainQuery();
        SSParser.Simple_queryContext sct= (SSParser.Simple_queryContext) ctx.parent;

        if(ctx.STRING()!=null) {
            int length=ctx.STRING().getText().length()-1;

            cq.setContent(ctx.STRING().getText().substring(1,length));
            cq.setID(getID(sct));
        }
        QueryManager.getManager().addCmd(cq);
    }

    @Override
    public void enterOperator(SSParser.OperatorContext ctx) {
        super.enterOperator(ctx);
        Operator op=null;
        if(ctx.AND()!=null){
           op=new AndOperator();
           QueryManager.getManager().addCmd(op);
        }
        if(ctx.OR()!=null){
            op=new OrOperator();
            QueryManager.getManager().addCmd(op);
        }
    }
}
