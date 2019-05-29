package com.dzq.constantpool;

import com.dzq.ConstantInfo;
import com.dzq.U2;

import java.io.IOException;
import java.io.InputStream;

public class ConstantNameAndTypeInfo extends ConstantInfo {

    private int nameIndex;
    private int typeIndex;

    public ConstantNameAndTypeInfo(int tag) {
        super(tag);
    }
    @Override
    public void analysis(InputStream in) throws IOException {
        this.nameIndex = U2.byteToInt(in);
        this.typeIndex = U2.byteToInt(in);
    }

    public int getNameIndex() {
        return nameIndex;
    }

    public void setNameIndex(int nameIndex) {
        this.nameIndex = nameIndex;
    }

    public int getTypeIndex() {
        return typeIndex;
    }

    public void setTypeIndex(int typeIndex) {
        this.typeIndex = typeIndex;
    }
}
