package usuarios;

import java.time.LocalDate;

public class Profesional extends Usuario {

	private String titulo;
	private String fechaIngreso;

	public Profesional(String nombres, LocalDate fechaNacimiento, String rut, String titulo, String fechaIngreso) {
		super(nombres, fechaNacimiento, rut);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public void analizarUsuario() {
		super.analizarUsuario();

		System.out.println("Nombre Profesional: " + nombres + "\nRut: " + rut + "\nTítulo: " + titulo
				+ "\nFecha de ingreso: " + fechaIngreso);

	}

	@Override
	public String toString() {
		return "Datos del Profesional:" + "\nNombre: " + nombres + "\nFecha de nacimiento: " + fechaNacimiento + "\n"
				+ "\nRUT: " + rut + "\nTitulo: " + titulo + "\n" + "\nFecha de ingreso: " + fechaIngreso;
	}

}
