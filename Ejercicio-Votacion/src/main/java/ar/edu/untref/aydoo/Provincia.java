package ar.edu.untref.aydoo;

public class Provincia{
	
	int idProvincia;
	String nombre;
	
	public Provincia (int idProvincia, String nombre){
		this.idProvincia=idProvincia;
		this.nombre=nombre;
	}
	
	public int getIdProvincia (){
		return this.idProvincia;
	} 
	
	public String getNombre (){
		return this.nombre;
	}
}
