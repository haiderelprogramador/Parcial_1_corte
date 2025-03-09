package Parcial;

import java.util.List;

public class Busqueda {
    private String criterioBusqueda;

    public Busqueda(String criterioBusqueda) {
        this.criterioBusqueda = criterioBusqueda;
    }

    public String getCriterioBusqueda() { return criterioBusqueda; }
    public void setCriterioBusqueda(String criterioBusqueda) { this.criterioBusqueda = criterioBusqueda; }

    public void realizarBusqueda() {
        System.out.println("Realizando búsqueda con criterio: " + criterioBusqueda);
    }
}
