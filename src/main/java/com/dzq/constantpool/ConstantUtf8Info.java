package com.dzq.constantpool;

import com.dzq.ConstantInfo;
import com.dzq.U2;

import java.io.IOException;
import java.io.InputStream;

public class ConstantUtf8Info extends ConstantInfo {

    private int length;
    private String value;

    public ConstantUtf8Info(int tag) {
        super(tag);
    }
    @Override
    public void analysis(InputStream in) throws IOException {
        this.length = U2.byteToInt(in);
        byte[] bytes = new byte[length];
        in.read(bytes, 0, length);
        this.value = new String(bytes, 0, length);
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
