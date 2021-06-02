package com.geely.design.principle.compositionaggregation;

public class SQLServerConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "SQLServer连接";
    }
}
