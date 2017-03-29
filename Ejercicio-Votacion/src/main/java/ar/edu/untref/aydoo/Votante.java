package ar.edu.untref.aydoo;

public class Votante {
	
	public Voto votar (Candidato unCandidato, Provincia unaProvincia) {
		Voto miVoto = new Voto(unCandidato,unaProvincia);
		return miVoto;
	}

}
