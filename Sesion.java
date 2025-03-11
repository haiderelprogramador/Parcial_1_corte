package Parcial;

import java.util.List;

public class Sesion {
    private String sala;
    private String fecha;
    private String hora;
    private List<Trabajo> trabajosAsignados;
    private Chairman chairman;

    
    public Sesion(String sala, String fecha, String hora, List<Trabajo> trabajosAsignados, Chairman chairman) {
        this.sala = sala;
        this.fecha = fecha;
        this.hora = hora;
        this.trabajosAsignados = trabajosAsignados;
        this.chairman = chairman;
    }

    // Getters y Setters
    public String getSala() { return sala; }
    public void setSala(String sala) { this.sala = sala; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    public List<Trabajo> getTrabajosAsignados() { return trabajosAsignados; }
    public void setTrabajosAsignados(List<Trabajo> trabajosAsignados) { this.trabajosAsignados = trabajosAsignados; }

    public Chairman getChairman() { return chairman; }
    public void setChairman(Chairman chairman) { this.chairman = chairman; }
}