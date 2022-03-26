package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.util.Properties;

public class Conexao {

	private static Connection connection = null;
	
	public static Connection Conectar() {
		if (connection != null) {
			return connection;
		} else {
			try {
//				Properties prop = new Properties();
				
				String user = "root";
				String password = "root";
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gubeedb", user, password);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return connection;
		}
	}
}
