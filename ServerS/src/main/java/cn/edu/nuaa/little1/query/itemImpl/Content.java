package cn.edu.nuaa.little1.query.itemImpl;

import cn.edu.nuaa.little1.query.Item;

public class Content implements Item {
    private String content;

    public void setContent(String conIn){
        this.content=conIn;
    }

    @Override
    public String execute(Object input) {
        return this.content;
    }

}
