package servicio;
import java.util.ArrayList;
import java.util.List;

import usuarios.Administrativo;
import usuarios.Asesoria;
import usuarios.Cliente;
import usuarios.Profesional;
import usuarios.Usuario;
import informe.Capacitacion;

public class Contenedor {
    private List<Asesoria> asesorias;
    private List<Capacitacion> capacitaciones;

    public Contenedor() {
        asesorias = new ArrayList<>();
        capacitaciones = new ArrayList<>();
    }

    public void almacenarCliente(Cliente cliente) {
        asesorias.add(cliente);
    }

    public void almacenarProfesional(Profesional profesional) {
        asesorias.add(profesional);
    }

    public void almacenarAdministrativo(Administrativo administrativo) {
        asesorias.add(administrativo);
    }

    public void almacenarCapacitacion(Capacitacion capacitacion) {
        capacitaciones.add(capacitacion);
    }

    public void eliminarUsuario(String run) {
        asesorias.removeIf(asesoria -> asesoria instanceof Usuario && ((Usuario) asesoria).getRut().equals(run));
    }

    public void listarUsuarios() {
        if (asesorias.isEmpty()) {
            System.out.println("No hay usuarios para mostrar.");
        } else {
            for (Asesoria asesoria : asesorias) {
                if (asesoria instanceof Usuario) {
                    Usuario usuario = (Usuario) asesoria;
                    System.out.println(usuario);
                }
            }
        }
    }

    public void listarUsuariosPorTipo(String tipo) {
        for (Asesoria asesoria : asesorias) {
            if (asesoria.getClass().getSimpleName().equalsIgnoreCase(tipo)) {
                System.out.println(asesoria);
            }
        }
    }

    public void listarCapacitaciones() {
    	if (asesorias.isEmpty()) {
            System.out.println("No hay capacitaciones para mostrar.");
        } else {
        	for (Capacitacion capacitacion : capacitaciones) {
                System.out.println(capacitacion);
            }
        }
        
    }
}