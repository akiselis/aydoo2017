package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class TestElecciones {
	
	
	 @Test
	    public void pruebaEmitirVoto(){
		 
		   Candidato macri = new Candidato (1,"macri","cambiemos");
	       Candidato scioli = new Candidato (2,"scioli","victoria");
	       Candidato massa = new Candidato (3,"massa","renovador");
	       
	       Provincia jujuy = new Provincia(1, "jujuy");
	       Provincia mendoza = new Provincia(2, "mendoza");
	       Provincia salta = new Provincia(3, "salta");
	       
		   Votante micaela = new Votante();
	       Votante manuel = new Votante();
	       Votante sandra = new Votante();
	       Votante gonzalo = new Votante();
	       Votante marta = new Votante();
	       Votante mario = new Votante();
	       
	       Voto votoUno= micaela.votar(macri,jujuy);
	       Voto votoDos= manuel.votar(massa,jujuy);
	       Voto votoTres= sandra.votar(massa, mendoza);
	       Voto votoCuatro= gonzalo.votar(scioli, mendoza);
	       Voto votoCinco= marta.votar(scioli, salta);
	       Voto votoSeis= mario.votar(massa, mendoza);
	       
	       Assert.assertEquals("macri", votoUno.getCandidato().getNombreCandidato());
	       Assert.assertEquals("jujuy", votoUno.getProvincia().getNombre());
	       Assert.assertEquals("massa", votoDos.getCandidato().getNombreCandidato());
	       Assert.assertEquals("jujuy", votoDos.getProvincia().getNombre());
	       Assert.assertEquals("massa", votoTres.getCandidato().getNombreCandidato());
	       Assert.assertEquals("mendoza", votoTres.getProvincia().getNombre());
	       Assert.assertEquals("scioli", votoCuatro.getCandidato().getNombreCandidato());
	       Assert.assertEquals("mendoza", votoCuatro.getProvincia().getNombre());
	       Assert.assertEquals("scioli", votoCinco.getCandidato().getNombreCandidato());
	       Assert.assertEquals("salta", votoCinco.getProvincia().getNombre());
	       Assert.assertEquals("massa", votoSeis.getCandidato().getNombreCandidato());
	       Assert.assertEquals("mendoza", votoSeis.getProvincia().getNombre());
	    }
	
	  @Test
	    public void pruebaGetCandidatoConMasVotosNacional(){
		  
	       Candidato macri = new Candidato (1,"macri","cambiemos");
	       Candidato scioli = new Candidato (2,"scioli","victoria");
	       Candidato massa = new Candidato (3,"massa","renovador");
	       
	       
	       Votante micaela = new Votante();
	       Votante manuel = new Votante();
	       Votante sandra = new Votante();
	       Votante gonzalo = new Votante();
	       Votante marta = new Votante();
	       Votante mario = new Votante();
	       
	       
	       Provincia jujuy = new Provincia(1, "jujuy");
	       Provincia mendoza = new Provincia(2, "mendoza");
	       Provincia salta = new Provincia(3, "salta");
	       
	       
	       Voto votoUno= micaela.votar(macri,jujuy);
	       Voto votoDos= manuel.votar(massa,jujuy);
	       Voto votoTres= sandra.votar(massa, mendoza);
	       Voto votoCuatro= gonzalo.votar(scioli, mendoza);
	       Voto votoCinco= marta.votar(scioli, salta);
	       Voto votoSeis= mario.votar(massa, mendoza);
	       
	       Elecciones elecciones2017= new Elecciones();
	       elecciones2017.setCandidatos(macri);
	       elecciones2017.setCandidatos(scioli);
	       elecciones2017.setCandidatos(massa);
	       elecciones2017.recibirVoto(votoUno);
	       elecciones2017.recibirVoto(votoDos);
	       elecciones2017.recibirVoto(votoTres);
	       elecciones2017.recibirVoto(votoCuatro);
	       elecciones2017.recibirVoto(votoCinco);
	       elecciones2017.recibirVoto(votoSeis);
	       
	       int idCandidatoGanador= elecciones2017.getCandidatoConMasVotosNacional();
	       Assert.assertEquals(3, idCandidatoGanador);
	       
	    }
	  
	  @Test
	    public void pruebaGetCandidatoConMasVotosEnProvincia(){
		  
	       Candidato scioli = new Candidato (2,"scioli","victoria");
	       Candidato massa = new Candidato (3,"massa","renovador");
	       
	       
	       Votante manuel = new Votante();
	       Votante sandra = new Votante();
	       Votante gonzalo = new Votante();
	       Votante marta = new Votante();
	       Votante mario = new Votante();
	       
	       
	       Provincia jujuy = new Provincia(1, "jujuy");
	       Provincia mendoza = new Provincia(2, "mendoza");
	       Provincia salta = new Provincia(3, "salta");
	       
	       
	       Voto votoUno= manuel.votar(scioli,jujuy);
	       Voto votoDos= sandra.votar(massa, mendoza);
	       Voto votoTres= gonzalo.votar(scioli, mendoza);
	       Voto votoCuatro= marta.votar(scioli, salta);
	       Voto votoCinco= mario.votar(massa, mendoza);
	       
	       Elecciones elecciones2017= new Elecciones();
	       elecciones2017.setCandidatos(scioli);
	       elecciones2017.setCandidatos(massa);
	       
	       elecciones2017.recibirVoto(votoUno);
	       elecciones2017.recibirVoto(votoDos);
	       elecciones2017.recibirVoto(votoTres);
	       elecciones2017.recibirVoto(votoCuatro);
	       elecciones2017.recibirVoto(votoCinco);
	    
	       
	       String idCandidatoGanadorEnProvincia= elecciones2017.getCandidatoConMasVotosEnProvincia(2);
	       Assert.assertEquals("renovador", idCandidatoGanadorEnProvincia);
	       
	    }

}
