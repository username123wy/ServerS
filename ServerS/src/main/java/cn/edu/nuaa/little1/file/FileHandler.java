package cn.edu.nuaa.little1.file;

import java.util.List;

public interface FileHandler {

    Object read(String s);

    List<List<String>> getColumnByHeader(String c);
}
