package com.dzq.constantpool;

import com.dzq.ConstantInfo;
import com.dzq.U2;

import java.io.IOException;
import java.io.InputStream;

public class ConstantMethodrefInfo extends ConstantInfo {

    private int classInfoIndex;
    private int nameAndTypeIndex;

    public ConstantMethodrefInfo(int tag) {
        super(tag);
    }
    @Override
    public void analysis(InputStream in) throws IOException {
        this.classInfoIndex = U2.byteToInt(in);
        this.nameAndTypeIndex = U2.byteToInt(in);
    }

    public int getClassInfoIndex() {
        return classInfoIndex;
    }

    public void setClassInfoIndex(int classInfoIndex) {
        this.classInfoIndex = classInfoIndex;
    }

    public int getNameAndTypeIndex() {
        return nameAndTypeIndex;
    }

    public void setNameAndTypeIndex(int nameAndTypeIndex) {
        this.nameAndTypeIndex = nameAndTypeIndex;
    }
}
