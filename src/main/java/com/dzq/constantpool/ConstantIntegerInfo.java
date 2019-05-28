package com.dzq.constantpool;

import com.dzq.ConstantInfo;
import com.dzq.U4;

import java.io.IOException;
import java.io.InputStream;

public class ConstantIntegerInfo extends ConstantInfo {

    private int value;

    public ConstantIntegerInfo(int tag) {
        super(tag);
    }
    @Override
    public void analysis(InputStream in) throws IOException {
        this.value = U4.byteToInt(in);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
