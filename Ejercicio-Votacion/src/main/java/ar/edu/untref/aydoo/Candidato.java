package ar.edu.untref.aydoo;

public class Candidato {

	String nombreCandidato;
	Partido partido;

	public Candidato(String nombreDeCandidato, Partido partido) {
		this.nombreCandidato = nombreDeCandidato;
		this.partido = partido;
	}

	public String getNombreCandidato() {
		return nombreCandidato;
	}

	public Partido getPartido() {
		return partido;
	}
}