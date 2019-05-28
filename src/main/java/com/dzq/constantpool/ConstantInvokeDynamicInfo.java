package com.dzq.constantpool;

import com.dzq.ConstantInfo;

public class ConstantInvokeDynamicInfo extends ConstantInfo {

    private int bootstrapMethodAttrIndex;

    private int nameAndTypeIndex;

    public ConstantInvokeDynamicInfo(int tag) {
        super(tag);
    }

    public int getBootstrapMethodAttrIndex() {
        return bootstrapMethodAttrIndex;
    }

    public void setBootstrapMethodAttrIndex(int bootstrapMethodAttrIndex) {
        this.bootstrapMethodAttrIndex = bootstrapMethodAttrIndex;
    }

    public int getNameAndTypeIndex() {
        return nameAndTypeIndex;
    }

    public void setNameAndTypeIndex(int nameAndTypeIndex) {
        this.nameAndTypeIndex = nameAndTypeIndex;
    }
}
