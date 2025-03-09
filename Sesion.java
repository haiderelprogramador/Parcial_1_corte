package Parcial;

import java.util.Date;
import java.util.List;

public class Sesion {
    private String sala;
    private Date fecha;
    private Date hora;
    private List<Trabajo> trabajosAsignados;
    private Chairman chairman;

    // Constructor
    public Sesion(String sala, Date fecha, Date hora, List<Trabajo> trabajosAsignados, Chairman chairman) {
        this.sala = sala;
        this.fecha = fecha;
        this.hora = hora;
        this.trabajosAsignados = trabajosAsignados;
        this.chairman = chairman;
    }

    public String getSala() { return sala; }
    public void setSala(String sala) { this.sala = sala; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public Date getHora() { return hora; }
    public void setHora(Date hora) { this.hora = hora; }

    public List<Trabajo> getTrabajosAsignados() { return trabajosAsignados; }
    public void setTrabajosAsignados(List<Trabajo> trabajosAsignados) { this.trabajosAsignados = trabajosAsignados; }

    public Chairman getChairman() { return chairman; }
    public void setChairman(Chairman chairman) { this.chairman = chairman; }


    public void asignarTrabajo(Trabajo trabajo) {
        trabajosAsignados.add(trabajo);
    }
}
