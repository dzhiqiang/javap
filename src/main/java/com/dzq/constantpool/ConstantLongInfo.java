package com.dzq.constantpool;

import com.dzq.ConstantInfo;
import com.dzq.U8;

import java.io.IOException;
import java.io.InputStream;

public class ConstantLongInfo extends ConstantInfo {

    private long value;

    public ConstantLongInfo(int tag) {
        super(tag);
    }
    @Override
    public void analysis(InputStream in) throws IOException {
        this.value = U8.byteToLong(in);
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }
}
