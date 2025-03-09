package Parcial;

import java.util.List;

public class ComiteSeleccion {
    private List<Trabajo> trabajosRecibidos;
    private List<Trabajo> trabajosSeleccionados;

    public ComiteSeleccion(List<Trabajo> trabajosRecibidos, List<Trabajo> trabajosSeleccionados) {
        this.trabajosRecibidos = trabajosRecibidos;
        this.trabajosSeleccionados = trabajosSeleccionados;
    }

    public List<Trabajo> getTrabajosRecibidos() { return trabajosRecibidos; }
    public void setTrabajosRecibidos(List<Trabajo> trabajosRecibidos) { this.trabajosRecibidos = trabajosRecibidos; }

    public List<Trabajo> getTrabajosSeleccionados() { return trabajosSeleccionados; }
    public void setTrabajosSeleccionados(List<Trabajo> trabajosSeleccionados) { this.trabajosSeleccionados = trabajosSeleccionados; }

    public void revisarTrabajos() {
        System.out.println("Revisando trabajos recibidos...");
    }

    public void seleccionarTrabajos() {
        System.out.println("Seleccionando trabajos para presentación...");
    }
}