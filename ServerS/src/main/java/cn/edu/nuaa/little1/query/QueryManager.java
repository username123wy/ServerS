package cn.edu.nuaa.little1.query;
import cn.edu.nuaa.little1.file.CSVFileHandler;
import cn.edu.nuaa.little1.log.Log;
import cn.edu.nuaa.little1.log.impl.CmdLog;

import java.util.*;

public class QueryManager {
    private static QueryManager Query_Manager=null;
    private QueryManager(Log logIn){
        allInputCommands = new LinkedList<Item>();;
        allColumnID = new ArrayList<String>();
        resultsStk = new Stack<List<String>>();
        log=logIn;
    }

    public static QueryManager getManager(){
        if(Query_Manager==null){
            Query_Manager=new QueryManager(new CmdLog());
        }
        return Query_Manager;
    }
    protected List<String> allColumnID = null;
    protected Queue<Item> allInputCommands = null;
    protected Stack <List<String>> resultsStk = null;

    protected Log log=null;

    public void setLog(Log logIn){
        log=logIn;
    }

    public void addCmd(Item item){
        this.allInputCommands.offer(item);
    }

    public void addID(String ID){
        this.allColumnID.add(ID);
    }

    //使用栈处理序列，如果只要遇到or或者and就从栈中取一个再从队列中取一个，
    //直到队列为空，将栈中所有内容输出。by zong
    public List<String> executeAllCmds(){
        List<String> result=null;
        while(!allInputCommands.isEmpty()){
            Item i = allInputCommands.poll();
            result = (List<String>) i.execute(CSVFileHandler.getCSVHandler());
            if(result!=null){
                resultsStk.push(result);
            }else{
                List<String> p1 = resultsStk.pop();
                Item i1=allInputCommands.poll();
                List<String> p2 = (List<String>) i1.execute(CSVFileHandler.getCSVHandler());
                Operator tmpOp= (Operator) i;
                resultsStk.push(tmpOp.opExecute(p1,p2));
            }
        }

        result=new ArrayList<>();
        while(!resultsStk.empty()){
            List<String> tmps=resultsStk.pop();
            for (String tmp:tmps) {
                if(!result.contains(tmp)){
                    result.add(tmp);
                }
            }
        }
        return result;
    }
}
