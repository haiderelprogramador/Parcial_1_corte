package Parcial;

public class NotificacionSMS {
    private String telefono;
    private String mensaje;

    public NotificacionSMS(String telefono, String mensaje) {
        this.telefono = telefono;
        this.mensaje = mensaje;
    }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }

    public void enviarNotificacion() {
        System.out.println("Enviando SMS a " + telefono + ": " + mensaje);
    }
}
