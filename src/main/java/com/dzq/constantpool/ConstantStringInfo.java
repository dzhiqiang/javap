package com.dzq.constantpool;

import com.dzq.ConstantInfo;
import com.dzq.U2;

import java.io.IOException;
import java.io.InputStream;



public class ConstantStringInfo extends ConstantInfo {

    private int index;

    public ConstantStringInfo(int tag) {
        super(tag);
    }
    @Override
    public void analysis(InputStream in) throws IOException {
        this.index = U2.byteToInt(in);
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
