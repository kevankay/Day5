package com.capgemini.day5;

public class ConnectionClient {
		public static void main(String[] args) {
			connectToDatabase(new MySQLConnection());
			connectToDatabase(new OracleConnection());
			connectToDatabase(new DB2Connection());
		}
		
		public static void connectToDatabase(Connection connection) {
			connection.connect();
			connection.displayDatabaseInfo();
		}
	}


