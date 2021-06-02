package com.geely.design.pattern.creational.singleton.enumsingleton;

public enum  EnumInstance {
    INSTANCEOF;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return INSTANCEOF;
    }
}
