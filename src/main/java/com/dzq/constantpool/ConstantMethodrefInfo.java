package com.dzq.constantpool;

import com.dzq.ConstantInfo;

public class ConstantMethodrefInfo extends ConstantInfo {

    private int classInfoIndex;
    private int nameAndTypeIndex;

    public ConstantMethodrefInfo(int tag) {
        super(tag);
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
