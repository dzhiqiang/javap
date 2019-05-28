package com.dzq.constantpool;

import com.dzq.ConstantInfo;

public class ConstantNameAndTypeInfo extends ConstantInfo {

    private int nameIndex;
    private int typeIndex;

    public ConstantNameAndTypeInfo(int tag) {
        super(tag);
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
