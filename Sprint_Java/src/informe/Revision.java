package informe;

public class Revision {
	private int idRevision;
	private int idVisita;
	private String verificador;
	private String detalleRevision;
	private int estado;

	public Revision(int idRevision, int idVisita, String verificador, String detalleRevision, int estado) {
		super();
		this.idRevision = idRevision;
		this.idVisita = idVisita;
		this.verificador = verificador;
		this.detalleRevision = detalleRevision;
		this.estado = estado;
	}

	public int getIdRevision() {
		return idRevision;
	}

	public void setIdRevision(int idRevision) {
		this.idRevision = idRevision;
	}

	public int getIdVisita() {
		return idVisita;
	}

	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}

	public String getVerificador() {
		return verificador;
	}

	public void setVerificador(String verificador) {
		this.verificador = verificador;
	}

	public String getDetalleRevision() {
		return detalleRevision;
	}

	public void setDetalleRevision(String detalleRevision) {
		this.detalleRevision = detalleRevision;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String obtenerEstado() {
		String seleccion;
		switch (estado) {
		case 1:
			seleccion = "Sin problemas";
			break;
		case 2:
			seleccion = "Con observaciones";
			break;
		case 3:
			seleccion = "No aprueba";
			break;
		default:
			seleccion = "Sin datos";
			break;
		}
		return seleccion;
	}
}
