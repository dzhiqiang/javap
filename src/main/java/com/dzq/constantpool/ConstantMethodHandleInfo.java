package com.dzq.constantpool;

import com.dzq.ConstantInfo;
import com.dzq.U1;
import com.dzq.U2;

import java.io.IOException;
import java.io.InputStream;

public class ConstantMethodHandleInfo extends ConstantInfo {

    private int refKind;
    private int refIndex;

    public ConstantMethodHandleInfo(int tag) {
        super(tag);
    }
    @Override
    public void analysis(InputStream in) throws IOException {
        this.refKind = U1.byteToInt(in);
        this.refIndex = U2.byteToInt(in);
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
