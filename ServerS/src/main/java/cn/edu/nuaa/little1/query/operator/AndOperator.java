package cn.edu.nuaa.little1.query.operator;

import cn.edu.nuaa.little1.query.Operator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AndOperator extends Operator {
    @Override
    public List<String> opExecute(List<String> columns1, List<String> columns2) {
        List<String> result=new ArrayList<>();

        result=columns1.stream().filter(s -> columns2.contains(s)).collect(Collectors.toList());
        return result;
    }

    @Override
    public List<List<String>> operatorExecute(List<List<String>> columns) {
       return null;
    }
}
