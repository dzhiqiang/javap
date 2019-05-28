package com.dzq.constantpool;

import com.dzq.ConstantInfo;
import com.dzq.U8;

import java.io.IOException;
import java.io.InputStream;

public class ConstantDoubleInfo extends ConstantInfo {

    private double value;

    public ConstantDoubleInfo(int tag) {
        super(tag);
    }
    @Override
    public void analysis(InputStream in) throws IOException {
        this.value = U8.byteToDouble(in);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
