import  java.sql.*;  
public class App {
    private static final String DB_DRIVER = 
		           "oracle.jdbc.driver.OracleDriver";
	private static final String DB_URL = 
		        "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String DB_USERNAME = "system";
	private static final String DB_PASSWORD = "oracle";
    public static void main(String[] args) throws Exception {
        Connection conn = null;
		try{
			//Register the JDBC driver
			Class.forName(DB_DRIVER);
 
			//Open the connection
			conn = DriverManager.
			getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
 
			if(conn != null){
			   System.out.println("Successfully connected.");
			}else{
			   System.out.println("Failed to connect.");
			}
			//create the statement object
            Statement stmt = conn.createStatement();
			stmt.executeQuery("ALTER SESSION SET CURRENT_SCHEMA=Prueba");
			ResultSet rs = stmt.executeQuery("select * from person");
			while(rs.next())
				System.out.println(rs.getInt(0));

		}catch(Exception e){
			e.printStackTrace();
		}
        
    }
}
