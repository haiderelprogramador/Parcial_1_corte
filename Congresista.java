package Parcial;
import java.util.Date;

public class Congresista {
    private String nombre;
    private String primerApellido;
    private String institucionAfiliada;
    private String correoElectronico;
    private String telefonoOpcional;
    private Date fechaRegistro;

    public Congresista(String nombre, String primerApellido, String institucionAfiliada, 
                    String correoElectronico, String telefonoOpcional, Date fechaRegistro) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.institucionAfiliada = institucionAfiliada;
        this.correoElectronico = correoElectronico;
        this.telefonoOpcional = telefonoOpcional;
        this.fechaRegistro = fechaRegistro;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPrimerApellido() { return primerApellido; }
    public void setPrimerApellido(String primerApellido) { this.primerApellido = primerApellido; }

    public String getInstitucionAfiliada() { return institucionAfiliada; }
    public void setInstitucionAfiliada(String institucionAfiliada) { this.institucionAfiliada = institucionAfiliada; }

    public String getCorreoElectronico() { return correoElectronico; }
    public void setCorreoElectronico(String correoElectronico) { this.correoElectronico = correoElectronico; }

    public String getTelefonoOpcional() { return telefonoOpcional; }
    public void setTelefonoOpcional(String telefonoOpcional) { this.telefonoOpcional = telefonoOpcional; }

    public Date getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(Date fechaRegistro) { this.fechaRegistro = fechaRegistro; }

    public void registrarse() {
        System.out.println("Congresista registrado: " + nombre + " " + primerApellido);
    }

    public void enviarTrabajo(Trabajo trabajo) {
        System.out.println("Trabajo enviado por: " + nombre + " " + primerApellido);
    }
}