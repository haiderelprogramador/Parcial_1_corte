package Parcial;

import java.util.List;

public class ComiteOrganizador {
    private List<Congresista> miembros;

    public ComiteOrganizador(List<Congresista> miembros) {
        this.miembros = miembros;
    }

    public List<Congresista> getMiembros() { return miembros; }
    public void setMiembros(List<Congresista> miembros) { this.miembros = miembros; }

    public void agregarMiembro(Congresista miembro) {
        miembros.add(miembro);
    }
}
