package com.dzq.constantpool;

import com.dzq.ConstantInfo;
import com.dzq.U2;

import java.io.IOException;
import java.io.InputStream;

public class ConstantMethodTypeInfo extends ConstantInfo {

    private int descIndex;

    public ConstantMethodTypeInfo(int tag) {
        super(tag);
    }
    @Override
    public void analysis(InputStream in) throws IOException {
        this.descIndex = U2.byteToInt(in);
    }

    public int getDescIndex() {
        return descIndex;
    }

    public void setDescIndex(int descIndex) {
        this.descIndex = descIndex;
    }
}
