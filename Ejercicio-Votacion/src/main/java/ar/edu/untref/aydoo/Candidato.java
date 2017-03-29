package ar.edu.untref.aydoo;

public class Candidato {

	int idCandidato;
	//int idPartido;
	String nombreCandidato;
	String nombrePartido;
	
	
	public Candidato (int idDeCandidato, String nombreDeCandidato, String nombreDePartido){
		idCandidato=idDeCandidato;
		//idPartido=idDePartido;
		nombreCandidato=nombreDeCandidato;
		nombrePartido=nombreDePartido;
	}
	
	public int getIdCandidato(){
		return idCandidato;
	}
	
	/*public int getIdPartido(){
		return idPartido;
	}*/
	
	public String getNombreCandidato(){
		return nombreCandidato;
	}
	
	public String getPartido(){
		return nombrePartido;
	}
}