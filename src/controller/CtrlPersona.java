package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.PersonaDAO;
import model.PersonaDTO;
import view.VistaPersona;

public class CtrlPersona {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PersonaDTO personaDTO;
    PersonaDAO personaDAO;
    VistaPersona vistaPersona;

    public CtrlPersona(PersonaDTO personaDTO, PersonaDAO personaDAO, VistaPersona vistaPersona) {
        this.personaDTO = personaDTO;
        this.personaDAO = personaDAO;
        this.vistaPersona = vistaPersona;
    }

    public void iniciar() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; // Guardaremos la opcion del usuario
        PersonaDTO persona = new PersonaDTO();
        while (!salir) {

            vistaPersona.imprimirMenu();

            try {
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        vistaPersona.first_namePersona();
                        persona.setFirst_name(sn.next());
                        vistaPersona.last_namePersona();
                        persona.setLast_name(sn.next());
                        personaDAO.registrar(persona);
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        break;
                    case 4:
                        salir = true;
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }

}
