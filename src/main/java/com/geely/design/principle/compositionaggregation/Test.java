package com.geely.design.principle.compositionaggregation;

public class Test {

    public static void main(String[] args) {
        ProductDAO dao = new ProductDAO();
        dao.setDbConnection(new MysqlConnection());
        dao.addProduct();
    }
}
