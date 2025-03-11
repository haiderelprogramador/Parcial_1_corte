package Parcial;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    private static List<Congresista> congresistasRegistrados = new ArrayList<>();
    private static List<Trabajo> trabajosEnviados = new ArrayList<>();
    private static List<Trabajo> trabajosSeleccionados = new ArrayList<>();
    private static List<Sesion> sesionesProgramadas = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            String[] opciones = {
                "Registrarse",
                "Enviar trabajo",
                "Revisar trabajos (Comité)",
                "Programar sesión",
                "Ver sesiones programadas",
                "Salir"
            };

            int eleccion = JOptionPane.showOptionDialog(
                null,
                "Seleccione una opción:",
                "Menú Principal",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                opciones[0]
            );

            switch (eleccion) {
                case 0: 
                    registrarCongresista();
                    break;
                case 1: 
                    if (congresistasRegistrados.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Primero debe registrarse.");
                    } else {
                        enviarTrabajo(congresistasRegistrados.get(0)); // Usar el primer congresista registrado
                    }
                    break;
                case 2: 
                    revisarTrabajos();
                    break;
                case 3: 
                    programarSesion();
                    break;
                case 4: 
                    verSesionesProgramadas();
                    break;
                case 5: 
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema. ¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            }
        }
    }

    private static void registrarCongresista() {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        String primerApellido = JOptionPane.showInputDialog("Ingrese su primer apellido:");
        String institucion = JOptionPane.showInputDialog("Ingrese su institución afiliada:");
        String correo = JOptionPane.showInputDialog("Ingrese su correo electrónico:");
        String telefono = JOptionPane.showInputDialog("Ingrese su número de teléfono (opcional):");

        
        if (!correo.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            JOptionPane.showMessageDialog(null, "Correo electrónico no válido.");
            return;
        }

        for (Congresista c : congresistasRegistrados) {
            if (c.getCorreoElectronico().equals(correo)) {
                JOptionPane.showMessageDialog(null, "Este correo ya está registrado.");
                return;
            }
        }

        // Crear y registrar el congresista
        Congresista congresista = new Congresista(nombre, primerApellido, institucion, correo, telefono, new Date());
        congresistasRegistrados.add(congresista);
        JOptionPane.showMessageDialog(null, "Registro exitoso. ¡Bienvenido, " + nombre + "!");
    }

    private static void enviarTrabajo(Congresista congresista) {
        String titulo = JOptionPane.showInputDialog("Ingrese el título del trabajo:");
        String resumen = JOptionPane.showInputDialog("Ingrese el resumen del trabajo:");

        
        List<Autor> autores = new ArrayList<>();
        autores.add(new Autor(congresista.getNombre(), congresista.getPrimerApellido(), congresista.getInstitucionAfiliada(), new AreaInvestigacion("General")));

        
        List<PalabraClave> palabrasClave = new ArrayList<>();
        palabrasClave.add(new PalabraClave("General"));

        
        Trabajo trabajo = new Trabajo(titulo, resumen, autores, palabrasClave, "En revisión");

        
        trabajosEnviados.add(trabajo);
        JOptionPane.showMessageDialog(null, "Trabajo enviado con éxito.");
    }

    private static void revisarTrabajos() {
        if (trabajosEnviados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay trabajos para revisar.");
            return;
        }

        StringBuilder mensaje = new StringBuilder("Trabajos enviados:\n");
        for (int i = 0; i < trabajosEnviados.size(); i++) {
            mensaje.append(i + 1).append(". ").append(trabajosEnviados.get(i).getTitulo()).append("\n");
        }

        String seleccion = JOptionPane.showInputDialog(mensaje.toString() + "Ingrese el número del trabajo a seleccionar:");
        try {
            int indice = Integer.parseInt(seleccion) - 1;
            Trabajo trabajo = trabajosEnviados.get(indice);
            trabajosSeleccionados.add(trabajo);
            JOptionPane.showMessageDialog(null, "Trabajo seleccionado: " + trabajo.getTitulo());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Selección no válida.");
        }
    }

    private static void programarSesion() {
        String sala = JOptionPane.showInputDialog("Ingrese la sala:");
        String fecha = JOptionPane.showInputDialog("Ingrese la fecha (dd/MM/yyyy):");
        String hora = JOptionPane.showInputDialog("Ingrese la hora (HH:mm):");

        
        Sesion sesion = new Sesion(sala, fecha, hora, new ArrayList<>(), null);
        sesionesProgramadas.add(sesion);
        JOptionPane.showMessageDialog(null, "Sesión programada en " + sala + " el " + fecha + " a las " + hora + ".");
    }

    private static void verSesionesProgramadas() {
        if (sesionesProgramadas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay sesiones programadas.");
            return;
        }

        StringBuilder mensaje = new StringBuilder("Sesiones programadas:\n");
        for (Sesion sesion : sesionesProgramadas) {
            mensaje.append("- Sala: ").append(sesion.getSala())
                .append(", Fecha: ").append(sesion.getFecha())
                .append(", Hora: ").append(sesion.getHora()).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString());
    }
}