package com.dzq;

import com.dzq.attr.AttrInfo;

//方法表集合
public class MethodInfo {

    private boolean isPublic;
    private boolean isPrivate;

    private boolean isProtected;
    private boolean isStatic;

    private boolean isFinal;

    private boolean isSynchronized;

    private boolean isBridge;

    private boolean isVarargs;

    private boolean isNative;

    private boolean isAbstract;

    private boolean isStrictfp;

    private boolean isSynthetic;

    private int nameIndex;

    private int descIndex;

    private int attrCount;

    private AttrInfo[] attrInfoArray;


    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public boolean isProtected() {
        return isProtected;
    }

    public void setProtected(boolean aProtected) {
        isProtected = aProtected;
    }

    public boolean isStatic() {
        return isStatic;
    }

    public void setStatic(boolean aStatic) {
        isStatic = aStatic;
    }

    public boolean isFinal() {
        return isFinal;
    }

    public void setFinal(boolean aFinal) {
        isFinal = aFinal;
    }

    public boolean isSynchronized() {
        return isSynchronized;
    }

    public void setSynchronized(boolean aSynchronized) {
        isSynchronized = aSynchronized;
    }

    public boolean isBridge() {
        return isBridge;
    }

    public void setBridge(boolean bridge) {
        isBridge = bridge;
    }

    public boolean isVarargs() {
        return isVarargs;
    }

    public void setVarargs(boolean varargs) {
        isVarargs = varargs;
    }

    public boolean isNative() {
        return isNative;
    }

    public void setNative(boolean aNative) {
        isNative = aNative;
    }

    public boolean isAbstract() {
        return isAbstract;
    }

    public void setAbstract(boolean anAbstract) {
        isAbstract = anAbstract;
    }

    public boolean isStrictfp() {
        return isStrictfp;
    }

    public void setStrictfp(boolean aStrictfp) {
        isStrictfp = aStrictfp;
    }

    public boolean isSynthetic() {
        return isSynthetic;
    }

    public void setSynthetic(boolean synthetic) {
        isSynthetic = synthetic;
    }

    public int getNameIndex() {
        return nameIndex;
    }

    public void setNameIndex(int nameIndex) {
        this.nameIndex = nameIndex;
    }

    public int getDescIndex() {
        return descIndex;
    }

    public void setDescIndex(int descIndex) {
        this.descIndex = descIndex;
    }

    public int getAttrCount() {
        return attrCount;
    }

    public void setAttrCount(int attrCount) {
        this.attrCount = attrCount;
    }

    public AttrInfo[] getAttrInfoArray() {
        return attrInfoArray;
    }

    public void setAttrInfoArray(AttrInfo[] attrInfoArray) {
        this.attrInfoArray = attrInfoArray;
    }
}
