package it.polito.tdp.corsi.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
public static Connection getConnection() throws SQLException {
	
	String jdbcURL= "jdbc:mysql://localhost/iscritticorsi?user=root&password=alessandra";
	return DriverManager.getConnection(jdbcURL);
}
}
