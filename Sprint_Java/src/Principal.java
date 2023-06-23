import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;
import usuarios.*;
import servicio.Contenedor;
import informe.Capacitacion;
import java.time.format.DateTimeFormatter;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Contenedor funciones = new Contenedor();
		boolean salir = false;
		int opcion;

		do {
			try {
				System.out.println("MENU");
				System.out.println("Por favor, ingrese alguna de las siguientes opciones: ");
				System.out.println("1. Almacenar Cliente");
				System.out.println("2. Almacenar Profesional");
				System.out.println("3. Almacenar Administrativo");
				System.out.println("4. Almacenar Capacitación");
				System.out.println("5. Eliminar Usuario");
				System.out.println("6. Listar Usuarios");
				System.out.println("7. Listar Usuarios por tipos");
				System.out.println("8. Listar Capacitaciones");
				System.out.println("9. Salir");
				opcion = scanner.nextInt();

				switch (opcion) {
				case 1:
					System.out.println("Ingrese los datos del Cliente a almacenar: ");
					Cliente cliente = obtenerDatosCliente(scanner);
					funciones.almacenarCliente(cliente);
					break;
				case 2:
					System.out.println("Ingrese los datos del Profesional a almacenar: ");
					Profesional profesional = obtenerDatosProfesional(scanner);
					funciones.almacenarProfesional(profesional);
					break;
				case 3:
					System.out.println("Ingrese los datos del Administrativo a almacenar: ");
					Administrativo administrativo = obtenerDatosAdministrativo(scanner);
					funciones.almacenarAdministrativo(administrativo);
					break;
				case 4:
					System.out.println("Ingrese los datos de la Capacitación a almacenar: ");
					Capacitacion capacitacion = obtenerDatosCapacitacion(scanner);
					funciones.almacenarCapacitacion(capacitacion);
					break;
				case 5:
					System.out.println("Ingrese el rut del usuario a eliminar: ");
					String rutEliminar = scanner.nextLine();
					funciones.eliminarUsuario(rutEliminar);
					break;
				case 6:
					System.out.println("Se listaran todos los usuarios: ");
					funciones.listarUsuarios();
					break;
				case 7:
					System.out.println("Ingrese el tipo de usuario a listar: ");
					scanner.nextLine();
					String tipoUsuario = scanner.nextLine();
					funciones.listarUsuariosPorTipo(tipoUsuario);
					break;
				case 8:
					System.out.println("Se listaran las capacitaciones: ");
					funciones.listarCapacitaciones();
					break;
				case 9:
					System.out.println("Saliendo del menú... ¡Hasta pronto!");
					salir = true;
					break;
				default:
					System.out.println("Por favor, seleccione un número del 1 al 9.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Debe ingresar un número.");
				scanner.nextLine();
			}
		} while (!salir);
	}

	private static Cliente obtenerDatosCliente(Scanner scanner) {
		LocalDate fechaNacimientoCliente = null;
		System.out.println("Ingrese el nombre del cliente: ");
		String nombre = scanner.next();
		System.out.println("Ingrese el apellido del cliente: ");
		String apellido = scanner.next();
		System.out.println("Ingrese la fecha de nacimiento del cliente: ");
		try {
			String fechaNacimiento = scanner.next();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			fechaNacimientoCliente = LocalDate.parse(fechaNacimiento, formatter);
		} catch (DateTimeParseException e) {
			System.out.println("Error al analizar la fecha");
		}
		System.out.println("Ingrese el RUN del cliente: ");
		String rut = scanner.next();
		System.out.println("Ingrese el telefono del cliente: ");
		String telefono = scanner.next();
		System.out.println("Ingrese la afp del cliente: ");
		String afp = scanner.next();
		System.out.println("Ingrese el sistema de salud del cliente (1. Fonasa - 2. Isapre): ");
		int sistemaSalud = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ingrese la direccion del cliente: ");
		String direccion = scanner.nextLine();
		System.out.println("Ingrese la comuna del cliente: ");
		String comuna = scanner.nextLine();

		return new Cliente(nombre, fechaNacimientoCliente, rut, apellido, telefono, afp, sistemaSalud, direccion,
				comuna);
	}

	private static Profesional obtenerDatosProfesional(Scanner scanner) {
		LocalDate fechaNacimientoProfesional = null;
		System.out.println("Ingrese el nombre del profesional: ");
		String nombre = scanner.next();
		System.out.println("Ingrese el apellido del profesional: ");
		String apellido = scanner.next();
		System.out.println("Ingrese la fecha de nacimiento del profesional: ");
		try {
			String fechaNacimiento = scanner.next();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			fechaNacimientoProfesional = LocalDate.parse(fechaNacimiento, formatter);
		} catch (DateTimeParseException e) {
			System.out.println("Error al analizar la fecha");
		}
		System.out.println("Ingrese el RUN del profesional: ");
		String rut = scanner.next();
		System.out.println("Ingrese el título del profesional: ");
		String titulo = scanner.next();
		System.out.println("Ingrese la fecha de ingreso del profesional: ");
		String fechaIngreso = scanner.next();

		return new Profesional(nombre, fechaNacimientoProfesional, rut, titulo, fechaIngreso);
	}

	private static Administrativo obtenerDatosAdministrativo(Scanner scanner) {
		LocalDate fechaNacimientoAdministrativo = null;
		System.out.println("Ingrese el nombre del administrativo: ");
		String nombres = scanner.next();
		System.out.println("Ingrese el apellido del administrativo: ");
		String apellidos = scanner.next();
		System.out.println("Ingrese la fecha de nacimiento del administrativo: ");
		try {
			String fechaNacimiento = scanner.next();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			fechaNacimientoAdministrativo = LocalDate.parse(fechaNacimiento, formatter);
		} catch (DateTimeParseException e) {
			System.out.println("Error al analizar la fecha");
		}
		System.out.println("Ingrese el RUN del administrativo: ");
		String rut = scanner.next();
		System.out.println("Ingrese el area del administrativo: ");
		String area = scanner.next();
		System.out.println("Ingrese la experiencia previa del administrativo: ");
		String experienciaPrevia = scanner.next();

		return new Administrativo(nombres, fechaNacimientoAdministrativo, rut, area, experienciaPrevia);
	}

	private static Capacitacion obtenerDatosCapacitacion(Scanner scanner) {
		System.out.println("Ingrese el identificador de la capacitación: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ingrese el rut del cliente: ");
		String rut = scanner.nextLine();
		System.out.println("Ingrese el dia de la capacitación ");
		String dia = scanner.nextLine();
		System.out.println("Ingrese la hora de la capacitación: ");
		String hora = scanner.nextLine();
		System.out.println("Ingrese el lugar de la capacitación: ");
		String lugar = scanner.nextLine();
		System.out.println("Ingrese la duración de la capacitacion: ");
		String duracion = scanner.nextLine();
		System.out.println("Ingrese la cantidad de asistentes a la capacitación: ");
		int cantidadAsistentes = scanner.nextInt();
		scanner.nextLine();

		return new Capacitacion(id, rut, dia, hora, lugar, duracion, cantidadAsistentes);
	}
}