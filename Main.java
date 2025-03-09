package Parcial;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        AreaInvestigacion area1 = new AreaInvestigacion("Inteligencia Artificial");
        AreaInvestigacion area2 = new AreaInvestigacion("Ciencias de la Computación");

        Autor autor1 = new Autor("Juan", "Perez", "Universidad A", area1);
        Autor autor2 = new Autor("Ana", "Gomez", "Universidad B", area2);


        PalabraClave palabra1 = new PalabraClave("Metaverso");
        PalabraClave palabra2 = new PalabraClave("Machine Learning");


        List<Autor> autoresTrabajo1 = new ArrayList<>();
        autoresTrabajo1.add(autor1);
        List<PalabraClave> palabrasTrabajo1 = new ArrayList<>();
        palabrasTrabajo1.add(palabra1);
        Trabajo trabajo1 = new Trabajo("Avances en IA", "Resumen sobre el metaverso aplicado en la IA", autoresTrabajo1, palabrasTrabajo1, "En revisión");

        List<Autor> autoresTrabajo2 = new ArrayList<>();
        autoresTrabajo2.add(autor2);
        List<PalabraClave> palabrasTrabajo2 = new ArrayList<>();
        palabrasTrabajo2.add(palabra2);
        Trabajo trabajo2 = new Trabajo("Machine Learning en la medicina", "Resumen sobre ML", autoresTrabajo2, palabrasTrabajo2, "Seleccionado");

        Congresista congresista1 = new Congresista("Carlos", "López", "Universidad C", "carlos@example.com", "123456789", new Date());
        Congresista congresista2 = new Congresista("María", "Rodríguez", "Universidad D", "maria@example.com", "987654321", new Date());

        List<Trabajo> trabajosRecibidos = new ArrayList<>();
        trabajosRecibidos.add(trabajo1);
        trabajosRecibidos.add(trabajo2);
        List<Trabajo> trabajosSeleccionados = new ArrayList<>();
        trabajosSeleccionados.add(trabajo2);
        ComiteSeleccion comite = new ComiteSeleccion(trabajosRecibidos, trabajosSeleccionados);


        List<Trabajo> trabajosSesion1 = new ArrayList<>();
        trabajosSesion1.add(trabajo2);
        Chairman chairman1 = new Chairman("Pedro", "García", "Universidad E", "pedro@example.com", "555555555", new Date());
        Sesion sesion1 = new Sesion("Sala A", new Date(), new Date(), trabajosSesion1, chairman1);


        congresista1.registrarse();
        congresista2.enviarTrabajo(trabajo1);
        comite.revisarTrabajos();
        comite.seleccionarTrabajos();
        sesion1.asignarTrabajo(trabajo2);
        chairman1.moderarSesion(sesion1);


        NotificacionSMS notificacion = new NotificacionSMS("123456789", "Su trabajo ha sido seleccionado.");
        notificacion.enviarNotificacion();

        Busqueda busqueda = new Busqueda("IA");
        busqueda.realizarBusqueda();
    }
}
