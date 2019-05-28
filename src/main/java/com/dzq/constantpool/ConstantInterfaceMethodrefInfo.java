package com.dzq.constantpool;

import com.dzq.ConstantInfo;

import java.io.IOException;
import java.io.InputStream;

public class ConstantInterfaceMethodrefInfo extends ConstantInfo {

    private int classInfoIndex;
    private int nameAndTypeIndex;

    public ConstantInterfaceMethodrefInfo(int tag) {
        super(tag);
    }
    @Override
    public void analysis(InputStream in) throws IOException {

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
