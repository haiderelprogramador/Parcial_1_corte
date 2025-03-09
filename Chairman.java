package Parcial;
import java.util.*;
public class Chairman extends Congresista {

    public Chairman(String nombre, String primerApellido, String institucionAfiliada, 
                    String correoElectronico, String telefonoOpcional, Date fechaRegistro) {
        super(nombre, primerApellido, institucionAfiliada, correoElectronico, telefonoOpcional, fechaRegistro);
    }

    public void moderarSesion(Sesion sesion) {
        System.out.println("Moderando sesión: " + sesion.getSala());
    }
}
