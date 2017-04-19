package ar.edu.untref.aydoo;

public class Candidato {

	int idCandidato;
	String nombreCandidato;
	Partido partido;

	public Candidato(int idDeCandidato, String nombreDeCandidato, Partido partido) {
		this.idCandidato = idDeCandidato;
		this.nombreCandidato = nombreDeCandidato;
		this.partido = partido;
	}

	public int getIdCandidato() {
		return idCandidato;
	}

	public String getNombreCandidato() {
		return nombreCandidato;
	}

	public Partido getPartido() {
		return partido;
	}
}