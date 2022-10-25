import  java.sql.*;

import controller.CtrlPersona;
import model.PersonaDAO;
import model.PersonaDTO;
import view.VistaPersona;  
public class App {
    // private static final String DB_DRIVER = 
	// 	           "oracle.jdbc.driver.OracleDriver";
	// private static final String DB_URL = 
	// 	        "jdbc:oracle:thin:@localhost:1521:XE";
	// private static final String DB_USERNAME = "system";
	// private static final String DB_PASSWORD = "oracle";
    public static void main(String[] args) throws Exception {
        // Connection conn = null;
		// try{
		// 	//Register the JDBC driver
		// 	Class.forName(DB_DRIVER);
 
		// 	//Open the connection
		// 	conn = DriverManager.
		// 	getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			
			

		// 	if(conn != null){
		// 	   System.out.println("Successfully connected.");
		// 	}else{
		// 	   System.out.println("Failed to connect.");
		// 	}
		// 	//create the statement object
        //     Statement stmt = conn.createStatement();
		// 	stmt.executeQuery("ALTER SESSION SET CURRENT_SCHEMA=test");
		// 	// stmt.executeQuery("INSERT INTO PERSONA (FIRST_NAME, LAST_NAME) VALUES ('primero', 'segundo')");
		// 	ResultSet rs=stmt.executeQuery("select * from persona");  
		// 	while(rs.next())
		// 		System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));

		// }catch(Exception e){
		// 	e.printStackTrace();
		// }
        
		PersonaDAO personaDAO = new PersonaDAO();
		PersonaDTO personaDTO = new PersonaDTO();
		VistaPersona vistaPersona = new VistaPersona();

		CtrlPersona ctrlPersona = new CtrlPersona(personaDTO, personaDAO, vistaPersona);
		ctrlPersona.iniciar();
    }
}
