package com.geely.design.principle.compositionaggregation;

public class MysqlConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "Mysql连接";
    }
}
