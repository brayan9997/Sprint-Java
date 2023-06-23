package usuarios;

import java.time.LocalDate;

public class Administrativo extends Usuario {

	private String area;
	private String experienciaPrevia;

	public Administrativo(String nombres, LocalDate fechaNacimiento, String rut, String area,
			String experienciaPrevia) {
		super(nombres, fechaNacimiento, rut);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}

	@Override
	public void analizarUsuario() {
		super.analizarUsuario();

		System.out.println("Nombre Usuario: " + nombres + "\nRut: " + rut + "\nárea: " + area + "\nExperiencia previa: " + experienciaPrevia);
	}

	@Override
	public String toString() {
		return "Datos del Administrativo:" + "\nNombre: " + nombres + "\nFecha de nacimiento: " + fechaNacimiento
				+ "\nRUT: " + rut + "\nÁrea: " + area + "\nExperiencia previa: " + experienciaPrevia;
	}

}