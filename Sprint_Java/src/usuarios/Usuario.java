package usuarios;

import java.time.LocalDate;
import java.time.Period;

public class Usuario implements Asesoria {
	protected String nombres;
	protected LocalDate fechaNacimiento;
	protected String rut;

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public Usuario(String nombres, LocalDate fechaNacimiento, String rut) {
		this.nombres = nombres;
		this.fechaNacimiento = fechaNacimiento;
		this.rut = rut;
	}

	@Override
	public String toString() {
		return "Usuario : nombres=" + nombres + ", fechaNacimiento=" + fechaNacimiento + ", rut=" + rut;
	}

	public String mostrarEdad() {
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(fechaNacimiento, fechaActual);
		int edad = periodo.getYears();
		return "el usuario tiene: " + edad + " años";
	}

	@Override
	public void analizarUsuario() {
		System.out.println("Nombre Usuario: " + nombres + ", Rut: " + rut);

	}
}
