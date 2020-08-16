package cn.edu.nuaa.little1.utils;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SetUtils {
    public static boolean judgeContainsStr(String cardNum) {
        String regex=".*[a-zA-Z]+.*";
        Matcher m= Pattern.compile(regex).matcher(cardNum);
        return m.matches();
    }
    //集合的并
    public static List<List<String>> Union(List<List<String>> a, List<List<String>> b){
        List<List<String>> result = new ArrayList<List<String>>();

        for (List<String> columna:a) {
            for (List<String> columnb:b) {
                if(columna.get(0).equals(columnb.get(0))){
                    List<String> tmp=new ArrayList<>();
                    tmp.addAll(columna);
                    tmp.addAll(columnb);
                    result.add(tmp);
                }
            }
        }

        return result;
    }

    //集合的交
    //如果两列相同，就完了，zong
    public static List<List<String>> Intersection(List<List<String>> a,List<List<String>> b){
        List<List<String>> result = new ArrayList<List<String>>();

        for (List<String> columna:a) {
            for (List<String> columnb:b) {
                if(columna.get(0).equals(columnb.get(0))){
                    List<String> tmp=columna.stream().filter(s -> columnb.contains(s)).collect(Collectors.toList());
                    result.add(tmp);
                }
            }
        }

        return result;
    }

    //集合的差
    public static List<List<String>> Difference(List<List<String>> a,List<List<String>> b){
        List<List<String>> result = new ArrayList<List<String>>();

        for (List<String> columna:a) {
            for (List<String> columnb:b) {
                if(columna.get(0).equals(columnb.get(0))){
                    List<String> tmp=new ArrayList<>();
                    tmp.addAll(columna);
                    tmp.removeAll(columnb);
                    result.add(tmp);
                }
            }
        }

        return result;
    }

    public static List<List<String>> SymmetricalDifference(List<List<String>> a,List<List<String>> b){
       return Difference(Union(a,b),Intersection(a,b));

    }

}
