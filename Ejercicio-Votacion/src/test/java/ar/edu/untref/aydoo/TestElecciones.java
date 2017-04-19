package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class TestElecciones {

	@Test
	public void pruebaEmitirVoto() {

		Partido cambiemos = new Partido("cambiemos");
		Partido victoria = new Partido("victoria");
		Partido renovador = new Partido("renovador");

		Candidato macri = new Candidato("macri", cambiemos);
		Candidato scioli = new Candidato("scioli", victoria);
		Candidato massa = new Candidato("massa", renovador);

		Provincia jujuy = new Provincia("jujuy");
		Provincia mendoza = new Provincia("mendoza");
		Provincia salta = new Provincia("salta");

		Votante micaela = new Votante();
		Votante manuel = new Votante();
		Votante sandra = new Votante();
		Votante gonzalo = new Votante();
		Votante marta = new Votante();
		Votante mario = new Votante();

		Voto votoUno = micaela.votar(macri, jujuy);
		Voto votoDos = manuel.votar(massa, jujuy);
		Voto votoTres = sandra.votar(massa, mendoza);
		Voto votoCuatro = gonzalo.votar(scioli, mendoza);
		Voto votoCinco = marta.votar(scioli, salta);
		Voto votoSeis = mario.votar(massa, mendoza);

		Assert.assertEquals(macri, votoUno.getCandidato());
		Assert.assertEquals(jujuy, votoUno.getProvincia());
		Assert.assertEquals(massa, votoDos.getCandidato());
		Assert.assertEquals(jujuy, votoDos.getProvincia());
		Assert.assertEquals(massa, votoTres.getCandidato());
		Assert.assertEquals(mendoza, votoTres.getProvincia());
		Assert.assertEquals(scioli, votoCuatro.getCandidato());
		Assert.assertEquals(mendoza, votoCuatro.getProvincia());
		Assert.assertEquals(scioli, votoCinco.getCandidato());
		Assert.assertEquals(salta, votoCinco.getProvincia());
		Assert.assertEquals(massa, votoSeis.getCandidato());
		Assert.assertEquals(mendoza, votoSeis.getProvincia());
	}

	@Test
	public void pruebaGetCandidatoConMasVotosNacional() {

		Partido cambiemos = new Partido("cambiemos");
		Partido victoria = new Partido("victoria");
		Partido renovador = new Partido("renovador");

		Candidato macri = new Candidato("macri", cambiemos);
		Candidato scioli = new Candidato("scioli", victoria);
		Candidato massa = new Candidato("massa", renovador);

		Votante micaela = new Votante();
		Votante manuel = new Votante();
		Votante sandra = new Votante();
		Votante gonzalo = new Votante();
		Votante marta = new Votante();
		Votante mario = new Votante();

		Provincia jujuy = new Provincia("jujuy");
		Provincia mendoza = new Provincia("mendoza");
		Provincia salta = new Provincia("salta");

		Voto votoUno = micaela.votar(macri, jujuy);
		Voto votoDos = manuel.votar(massa, jujuy);
		Voto votoTres = sandra.votar(massa, mendoza);
		Voto votoCuatro = gonzalo.votar(scioli, mendoza);
		Voto votoCinco = marta.votar(scioli, salta);
		Voto votoSeis = mario.votar(massa, mendoza);

		JuntaElectoral elecciones2017 = new JuntaElectoral();
		elecciones2017.setCandidatos(macri);
		elecciones2017.setCandidatos(scioli);
		elecciones2017.setCandidatos(massa);
		elecciones2017.recibirVoto(votoUno);
		elecciones2017.recibirVoto(votoDos);
		elecciones2017.recibirVoto(votoTres);
		elecciones2017.recibirVoto(votoCuatro);
		elecciones2017.recibirVoto(votoCinco);
		elecciones2017.recibirVoto(votoSeis);

		Candidato candidatoGanador = elecciones2017.getCandidatoConMasVotosNacional();
		Assert.assertEquals(massa, candidatoGanador);

	}

	@Test
	public void pruebaGetPartidoConMasVotosEnProvincia() {

		Partido victoria = new Partido("victoria");
		Partido renovador = new Partido("renovador");

		Candidato scioli = new Candidato("scioli", victoria);
		Candidato massa = new Candidato("massa", renovador);

		Votante manuel = new Votante();
		Votante sandra = new Votante();
		Votante gonzalo = new Votante();
		Votante marta = new Votante();
		Votante mario = new Votante();

		Provincia jujuy = new Provincia("jujuy");
		Provincia mendoza = new Provincia("mendoza");
		Provincia salta = new Provincia("salta");

		Voto votoUno = manuel.votar(scioli, jujuy);
		Voto votoDos = sandra.votar(massa, mendoza);
		Voto votoTres = gonzalo.votar(scioli, mendoza);
		Voto votoCuatro = marta.votar(scioli, salta);
		Voto votoCinco = mario.votar(massa, mendoza);

		JuntaElectoral elecciones2017 = new JuntaElectoral();
		elecciones2017.setCandidatos(scioli);
		elecciones2017.setCandidatos(massa);

		elecciones2017.recibirVoto(votoUno);
		elecciones2017.recibirVoto(votoDos);
		elecciones2017.recibirVoto(votoTres);
		elecciones2017.recibirVoto(votoCuatro);
		elecciones2017.recibirVoto(votoCinco);

		Partido partidoGanadorEnProvincia = elecciones2017.getPartidoConMasVotosEnProvincia(mendoza);
		Assert.assertEquals(renovador, partidoGanadorEnProvincia);

	}

}
