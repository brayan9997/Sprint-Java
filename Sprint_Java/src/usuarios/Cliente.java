package usuarios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente extends Usuario {
	private String apellidos;
	private String telefono;
	private String afp;
	private int sistemaSalud;
	private String direccion;
	private String comuna;
	private int edad;

	public Cliente(String nombres, LocalDate fechaNacimiento, String rut, String apellidos, String telefono, String afp,
			int sistemaSalud, String direccion, String comuna) {
		super(nombres, fechaNacimiento, rut);
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
	}

	public Cliente(String nombres, LocalDate fechaNacimiento, String rut, String apellidos, String telefono, String afp,
			int sistemaSalud, String direccion, String comuna, int edad) {
		super(nombres, fechaNacimiento, rut);
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public int getSistemaSalud() {
		return sistemaSalud;
	}

	public void setSistemaSalud(int sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Datos del Cliente: " + "\nRUT: " + getRut() + "\nNombre: " + obtenerNombre() + "\nFecha de Nacimiento: "
				+ formatearFechaNacimiento() + "\nEdad: " + super.mostrarEdad() + "\nTelefono: " + telefono
				+ "\nDireccion: " + direccion + "\nComuna: " + comuna + "\nAFP: " + afp + "\nSistema de Salud:"
				+ obtenerSistemaSalud();
	}

	public String obtenerNombre() {
		return getNombres() + " " + apellidos;
	}

	public String obtenerSistemaSalud() {
		String salud;
		switch (sistemaSalud) {
		case 1:
			salud = "Fonasa";
			break;
		case 2:
			salud = "Isapre";
			break;
		default:
			salud = "otro";
			break;

		}
		return salud;
	}

	public String formatearFechaNacimiento() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String fechaNacimientoFormateada = fechaNacimiento.format(formatter);
		return fechaNacimientoFormateada;
	}

	@Override
	public void analizarUsuario() {
		System.out.println("Nombre Cliente: " + obtenerNombre() + ", Rut: " + getRut() + ", direccion: " + direccion
				+ ", " + comuna);

	}

}
