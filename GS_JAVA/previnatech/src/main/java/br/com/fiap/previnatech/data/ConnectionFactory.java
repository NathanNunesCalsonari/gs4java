package br.com.fiap.previnatech.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ConnectionFactory {

    final static String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    final static String USER = "rm552539";
    final static String PASS = "130701";

    public static Connection getConnection() throws Exception   {
        try {
			carregarDriverOracle();
			return DriverManager.getConnection(URL, USER, PASS);
		} catch (Exception e) {
			throw new Exception(e);
		}
    }

    private static void carregarDriverOracle() throws ClassNotFoundException {
            Class.forName("oracle.jdbc.driver.OracleDriver");
    }

    public void closeConnection(Connection conexao) throws Exception {
        if (conexao != null) {
            try {
                conexao.close();
            } catch (SQLException e) {
                throw new Exception(e);
            }
        }
    }


}
