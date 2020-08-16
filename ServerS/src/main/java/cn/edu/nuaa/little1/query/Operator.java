package cn.edu.nuaa.little1.query;

import cn.edu.nuaa.little1.query.Item;

import java.util.List;

public abstract class Operator implements Item {
    @Override
    public List<List<String>> execute(Object input) {
//        List<List<String>> columns = (List<List<String>>) input;
        return operatorExecute(null);
    }

    public abstract List<String> opExecute(List<String> columns1,List<String> columns2);

    public abstract List<List<String>> operatorExecute(List<List<String>> columns);

}
