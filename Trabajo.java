package Parcial;
import java.util.List;

public class Trabajo {
    private String titulo;
    private String resumen;
    private List<Autor> autores;
    private List<PalabraClave> palabrasClave;
    private String estado;

    public Trabajo(String titulo, String resumen, List<Autor> autores, List<PalabraClave> palabrasClave, String estado) {
        this.titulo = titulo;
        this.resumen = resumen;
        this.autores = autores;
        this.palabrasClave = palabrasClave;
        this.estado = estado;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getResumen() { return resumen; }
    public void setResumen(String resumen) { this.resumen = resumen; }

    public List<Autor> getAutores() { return autores; }
    public void setAutores(List<Autor> autores) { this.autores = autores; }

    public List<PalabraClave> getPalabrasClave() { return palabrasClave; }
    public void setPalabrasClave(List<PalabraClave> palabrasClave) { this.palabrasClave = palabrasClave; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public void agregarAutor(Autor autor) {
        autores.add(autor);
    }

    public void agregarPalabraClave(PalabraClave palabra) {
        palabrasClave.add(palabra);
    }
}

