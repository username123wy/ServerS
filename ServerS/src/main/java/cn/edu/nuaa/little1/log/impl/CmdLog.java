package cn.edu.nuaa.little1.log.impl;

import cn.edu.nuaa.little1.log.Log;

public class CmdLog implements Log {
    @Override
    public void output(String result) {
        System.out.println(result);
    }
}
