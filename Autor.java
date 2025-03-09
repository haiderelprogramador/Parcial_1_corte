package Parcial;

public class Autor {
    private String nombre;
    private String primerApellido;
    private String institucionAfiliada;
    private AreaInvestigacion areaInvestigacion;

    public Autor(String nombre, String primerApellido, String institucionAfiliada, AreaInvestigacion areaInvestigacion) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.institucionAfiliada = institucionAfiliada;
        this.areaInvestigacion = areaInvestigacion;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPrimerApellido() { return primerApellido; }
    public void setPrimerApellido(String primerApellido) { this.primerApellido = primerApellido; }

    public String getInstitucionAfiliada() { return institucionAfiliada; }
    public void setInstitucionAfiliada(String institucionAfiliada) { this.institucionAfiliada = institucionAfiliada; }

    public AreaInvestigacion getAreaInvestigacion() { return areaInvestigacion; }
    public void setAreaInvestigacion(AreaInvestigacion areaInvestigacion) { this.areaInvestigacion = areaInvestigacion; }
}
