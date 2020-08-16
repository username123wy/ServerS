import cn.edu.nuaa.little1.file.CSVFileHandler;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.*;
import java.util.Iterator;

public class testCSVHandler {
    @Test
    public void runTest(){
        Object result=CSVFileHandler.getCSVHandler().read("E:\\Users\\zongz\\Desktop\\little1\\ServerS\\src\\main\\resources\\test.csv");
        List<String[]> strsFromCse = (List<String[]>)result;
        List<List<String>> re=CSVFileHandler.getCSVHandler().getColumnByHeader("C");
        System.out.println(re.toArray());
    }
    @Test
    public void readOne() throws IOException {
        Reader reader = new FileReader("E:\\Users\\zongz\\Desktop\\little1\\ServerS\\src\\main\\resources\\test1.csv");
        Iterable<CSVRecord> records = CSVFormat.RFC4180.parse(reader);
        for (CSVRecord csvRecord : records) {
            System.out.println(
                    csvRecord.get(0) + "---" + csvRecord.get(1) + "---" + csvRecord.get(2) + "---" + csvRecord.get(3));
        }
        reader.close();
    }
}
