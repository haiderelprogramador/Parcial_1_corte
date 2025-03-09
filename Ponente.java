package Parcial;

import java.util.Date;
public class Ponente extends Congresista {
    public Ponente(String nombre, String primerApellido, String institucionAfiliada, 
        String correoElectronico, String telefonoOpcional, Date fechaRegistro) {
        super(nombre, primerApellido, institucionAfiliada, correoElectronico, telefonoOpcional, fechaRegistro);
    }

    
    public void presentarTrabajo(Trabajo trabajo) {
        System.out.println("Presentando trabajo: " + trabajo.getTitulo());
    }
}
