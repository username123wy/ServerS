package cn.edu.nuaa.little1.query.operator;

import cn.edu.nuaa.little1.query.Operator;
import cn.edu.nuaa.little1.utils.SetUtils;

import java.util.ArrayList;
import java.util.List;

//这里可以按照 A + B = A ∪ B  - (A ∩ B)来处理
public class OrOperator extends Operator {
    @Override
    public List<String> opExecute(List<String> columns1, List<String> columns2) {
        List<String> result=new ArrayList<>();

        result.addAll(columns1);

        for (String column2:columns2) {
                if((!SetUtils.judgeContainsStr(column2))&&(!result.contains(column2))){
                    result.add(column2);
                }
        }

        return result;
    }

    @Override
    public List<List<String>> operatorExecute(List<List<String>> columns) {
       return null;
    }

}
