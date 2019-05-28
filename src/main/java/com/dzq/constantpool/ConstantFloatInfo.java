package com.dzq.constantpool;

import com.dzq.ConstantInfo;
import com.dzq.U4;

import java.io.IOException;
import java.io.InputStream;

public class ConstantFloatInfo extends ConstantInfo {

    private float value;

    public ConstantFloatInfo(int tag) {
        super(tag);
    }
    @Override
    public void analysis(InputStream in) throws IOException {
        this.value = U4.byteToFloat(in);
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
