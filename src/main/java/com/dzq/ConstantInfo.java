package com.dzq;

import com.dzq.constantpool.*;

import java.io.IOException;
import java.io.InputStream;

public abstract class ConstantInfo {

    protected int tag;

    public ConstantInfo(int tag) {
        this.tag = tag;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }
    //创建子常量类
    public static ConstantInfo createSubInfo(int tag) {
        if (tag == 1) {
            return new ConstantUtf8Info(tag);
        }
        if (tag == 3) {
            return new ConstantIntegerInfo(tag);
        }
        if (tag == 4) {
            return new ConstantFloatInfo(tag);
        }
        if (tag == 5) {
            return new ConstantLongInfo(tag);
        }
        if (tag == 6) {
            return new ConstantDoubleInfo(tag);
        }
        if (tag == 7) {
            return new ConstantClassInfo(tag);
        }
        if (tag == 8) {
            return new ConstantStringInfo(tag);
        }
        if (tag == 9) {
            return new ConstantFieldrefInfo(tag);
        }
        if (tag == 10) {
            return new ConstantMethodrefInfo(tag);
        }
        if (tag == 11) {
            return new ConstantInterfaceMethodrefInfo(tag);
        }
        if (tag == 12) {
            return new ConstantNameAndTypeInfo(tag);
        }
        if (tag == 15) {
            return new ConstantMethodHandleInfo(tag);
        }
        if (tag == 16) {
            return new ConstantMethodTypeInfo(tag);
        }
        if (tag == 18) {
            return new ConstantInvokeDynamicInfo(tag);
        }
        throw new RuntimeException("tag=" + tag + " error");
    }

    public abstract void analysis(InputStream in) throws IOException;

}
