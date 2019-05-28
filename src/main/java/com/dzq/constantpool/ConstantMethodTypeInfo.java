package com.dzq.constantpool;

import com.dzq.ConstantInfo;

public class ConstantMethodTypeInfo extends ConstantInfo {

    private int descIndex;

    public ConstantMethodTypeInfo(int tag) {
        super(tag);
    }

    public int getDescIndex() {
        return descIndex;
    }

    public void setDescIndex(int descIndex) {
        this.descIndex = descIndex;
    }
}
