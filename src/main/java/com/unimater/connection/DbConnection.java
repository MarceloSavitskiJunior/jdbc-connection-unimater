package com.unimater.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbConnection {

    public static void criarConexaoBanco() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/minhabase",
                    "postgres", "admin");
            Statement statement =  connection.createStatement();
            statement.executeUpdate("CREATE TABLE PESSOA(nome VARCHAR(50))");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static void criarConexcaoMysql() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/people",
                    "root", "123456");
            Statement statement =  connection.createStatement();
            statement.executeUpdate("CREATE TABLE PESSOA(nome VARCHAR(50))");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
