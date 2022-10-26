package CRUD;

import controller.CtrlPersona;
import model.PersonaDAO;
import model.PersonaDTO;
import view.VistaPersona;  
public class App {
    public static void main(String[] args) throws Exception {
       
        
		PersonaDAO personaDAO = new PersonaDAO();
		PersonaDTO personaDTO = new PersonaDTO();
		VistaPersona vistaPersona = new VistaPersona();

		CtrlPersona ctrlPersona = new CtrlPersona(personaDTO, personaDAO, vistaPersona);
		ctrlPersona.iniciar();
    }
}
