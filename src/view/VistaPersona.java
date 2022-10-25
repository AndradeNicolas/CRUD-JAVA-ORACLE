package view;

import java.util.*;
import model.PersonaDTO;

public class VistaPersona {

    public void imprimirPersonas(List<PersonaDTO> personas) {
        for (PersonaDTO persona : personas) {
            System.out.println(persona.getId() + "\t" + persona.getFirst_name() + "\t" + persona.getLast_name());
        }
    }

    public void imprimirMenu() {
        System.out.println("**** CRUD Persona ****");
        System.out.println("Crear 1");
        System.out.println("Listar 2");
        System.out.println("Actualizar 3");
        System.out.println("Eliminar 4");
        System.out.println("Salir 5");
    }
    
    public void first_namePersona(){
        System.out.println("First_name");
    } 
    
    public void last_namePersona(){
        System.out.println("Last_name");
    } 

}
