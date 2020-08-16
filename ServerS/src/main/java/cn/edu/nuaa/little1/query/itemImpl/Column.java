package cn.edu.nuaa.little1.query.itemImpl;

import cn.edu.nuaa.little1.query.Item;

public class Column implements Item {
    private String ID;
    public String getID(){
        return ID;
    }
    public void setID(String id){
        this.ID=id;
    }

    @Override
    public String execute(Object input) {
     return null;
    }

}
