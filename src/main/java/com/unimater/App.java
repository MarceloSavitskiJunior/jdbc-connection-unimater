package com.unimater;

import com.unimater.connection.DbConnection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "--------- criando tabela --------" );
        DbConnection.criarConexcaoMysql();
    }
}
