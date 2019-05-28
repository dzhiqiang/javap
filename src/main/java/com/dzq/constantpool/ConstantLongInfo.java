package com.dzq.constantpool;

import com.dzq.ConstantInfo;

public class ConstantLongInfo extends ConstantInfo {

    private long value;

    public ConstantLongInfo(int tag) {
        super(tag);
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }
}
