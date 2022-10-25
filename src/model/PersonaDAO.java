package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    public boolean Eliminar(PersonaDTO persona) {
        String sql = "DELETE FROM PERSONA WHERE PERSON_ID = ?";
        Connection conn = null;
        try {
            conn = getConexion();
            // create the statement object
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, persona.getId());
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

    public List<PersonaDTO> listar() {
        String sql = "SELECT * FROM PERSONA";
        Connection conn = null;
        ResultSet rs = null;
        List <PersonaDTO> personas = new ArrayList<PersonaDTO>();
        try {
            conn = getConexion();
            // create the statement object
            PreparedStatement stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                PersonaDTO actual = new PersonaDTO();
                actual.setId(rs.getInt("PERSON_ID")); 
                actual.setFirst_name(rs.getString("FIRST_NAME"));
                actual.setLast_name(rs.getString("LAST_NAME"));
                personas.add(actual);
            }
            return personas;
        } catch (Exception e) {
            e.printStackTrace();
            return personas;
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        
    }

    public boolean actulizar(PersonaDTO persona) {
        String sql = "UPDATE PERSONA SET FIRST_NAME = ?, LAST_NAME = ? WHERE PERSON_ID = ?";
        Connection conn = null;
        try {
            conn = getConexion();
            // create the statement object
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, persona.getFirst_name());
            stmt.setString(2, persona.getLast_name());
            stmt.setInt(3, persona.getId());
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
