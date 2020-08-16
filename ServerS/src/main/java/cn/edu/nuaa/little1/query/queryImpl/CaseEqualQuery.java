package cn.edu.nuaa.little1.query.queryImpl;

import cn.edu.nuaa.little1.query.Query;

import java.util.ArrayList;
import java.util.List;

public class CaseEqualQuery extends Query {
    @Override
    public List<String> operatorExecute(List<List<String>> columns) {
        List<String> result=new ArrayList<String>();

        for (List<String> column:columns) {
            List<String> tmp=new ArrayList<String>();
            tmp.add(column.get(0));
            for (int i=1;i<column.size();i++) {
                if ((!result.contains(String.valueOf(i)))&&content.execute(null).equalsIgnoreCase("\""+column.get(i)+"\"")) {
//                    tmp.add(column.get(i));
                    result.add(String.valueOf(i));
                }
//                else{
//                    tmp.add(Common.FALSE);
//                }
            }
        }
        return result;
    }
}
