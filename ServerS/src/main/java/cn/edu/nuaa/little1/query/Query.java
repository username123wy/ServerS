package cn.edu.nuaa.little1.query;

import cn.edu.nuaa.little1.file.FileHandler;
import cn.edu.nuaa.little1.query.Item;
import cn.edu.nuaa.little1.query.itemImpl.Column;
import cn.edu.nuaa.little1.query.itemImpl.Content;

import java.util.List;

public abstract class Query implements Item {
    protected Column column;
    protected Content content;

    public Query(){
        content=new Content();
        column=new Column();
    }
    @Override
    public List<String> execute(Object input) {
        FileHandler file = (FileHandler) input;
        return operatorExecute(file.getColumnByHeader(column.getID()));
    }

    public void setID(String id){
        column.setID(id);
    }

    public void setContent(String contin){
        content.setContent(contin);
    }
    public abstract List<String> operatorExecute(List<List<String>> columns);

}
