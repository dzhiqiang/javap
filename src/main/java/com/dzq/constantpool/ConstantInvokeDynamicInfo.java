package com.dzq.constantpool;

import com.dzq.ConstantInfo;
import com.dzq.U2;

import java.io.IOException;
import java.io.InputStream;

public class ConstantInvokeDynamicInfo extends ConstantInfo {

    private int bootstrapMethodAttrIndex;

    private int nameAndTypeIndex;

    public ConstantInvokeDynamicInfo(int tag) {
        super(tag);
    }
    @Override
    public void analysis(InputStream in) throws IOException {
        this.bootstrapMethodAttrIndex = U2.byteToInt(in);
        this.nameAndTypeIndex = U2.byteToInt(in);
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
