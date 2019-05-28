package com.dzq.constantpool;

import com.dzq.ConstantInfo;

public class ConstantStringInfo extends ConstantInfo {

    private String value;

    public ConstantStringInfo(int tag) {
        super(tag);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
