package com.dzq.constantpool;

import com.dzq.ConstantInfo;

public class ConstantMethodHandleInfo extends ConstantInfo {

    private int refKind;
    private int refIndex;

    public ConstantMethodHandleInfo(int tag) {
        super(tag);
    }

    public int getRefKind() {
        return refKind;
    }

    public void setRefKind(int refKind) {
        this.refKind = refKind;
    }

    public int getRefIndex() {
        return refIndex;
    }

    public void setRefIndex(int refIndex) {
        this.refIndex = refIndex;
    }
}
