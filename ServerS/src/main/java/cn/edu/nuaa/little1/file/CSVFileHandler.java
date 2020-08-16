package cn.edu.nuaa.little1.file;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Iterator;

public class CSVFileHandler implements FileHandler{

    private static FileHandler csvFileHandler = null;
    private CSVFileHandler(){ }
    public static FileHandler getCSVHandler(){
        if(csvFileHandler==null){
            csvFileHandler=new CSVFileHandler();
        }
        return csvFileHandler;
    }

    private List<String[]> csvContent = new ArrayList<String[]>();
    public List<String[]> read(String srcPath) {

        String charset = "utf-8";
        Iterator<String[]> iterator=null;
        try (CSVReader csvReader = new CSVReaderBuilder(new BufferedReader(new InputStreamReader(new FileInputStream(new File(srcPath)), charset))).build()) {
            iterator = csvReader.iterator();
            while (iterator.hasNext()) {
                csvContent.add(iterator.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return csvContent;
    }

    public List<List<String>> getColumnByHeader(String header){
        List<List<String>> result =new ArrayList<List<String>>();

        for (int i=0;i<csvContent.get(0).length;i++){
            List<String> temp =new ArrayList<String>();
            if(csvContent.get(0)[i].equals(header)){
                for (String[] column : csvContent) {
                    temp.add(column[i]);
                }
                result.add(temp);
            }
        }
        return result;
    }

}
