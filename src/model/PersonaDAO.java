package model;

import java.sql.*;

public class PersonaDAO extends Conexion {

    public boolean registrar(PersonaDTO persona) {
        String sql = "INSERT INTO PERSONA (FIRST_NAME, LAST_NAME) VALUES (?, ?)";
        Connection conn = null;
        try {
            conn = getConexion();
            // create the statement object
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, persona.getFirst_name());
            stmt.setString(2, persona.getLast_name());
            stmt.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
