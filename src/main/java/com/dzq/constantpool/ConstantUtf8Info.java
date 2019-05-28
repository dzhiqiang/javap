package com.dzq.constantpool;

import com.dzq.ConstantInfo;

public class ConstantUtf8Info extends ConstantInfo {

    private int length;
    private String value;

    public ConstantUtf8Info(int tag) {
        super(tag);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
