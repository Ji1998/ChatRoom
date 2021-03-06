package my.chatroom.server.database_admin;


import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class CreateUSERSTable
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.ibm.db2j.jdbc.DB2jDriver");
		System.out.println("Driver loaded");
		Connection conn = DriverManager.getConnection("jdbc:db2j:" + new File("").getAbsolutePath().concat("/database/QuoteDB"));
		System.out.println("Connection made to Data Base");

		Statement statement = conn.createStatement();
		statement.execute("CREATE TABLE USERS "
				+ "(USER_ID     INTEGER     NOT NULL,"
				+ " TIME        BIGINT      NOT NULL,"
				+ " NICK_NAME   VARCHAR(50) NOT NULL,"
				+ " PASSWORD    VARCHAR(50) NOT NULL,"
				+ " PRIMARY KEY (USER_ID))");
		System.out.println("USERS table built");      
	}
}
