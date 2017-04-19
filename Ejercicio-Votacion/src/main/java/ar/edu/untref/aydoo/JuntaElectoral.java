package ar.edu.untref.aydoo;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

public class JuntaElectoral {

	LinkedList<Candidato> listaDeCandidatos = new LinkedList();
	LinkedList<Voto> listaDeVotos = new LinkedList();

	Map<Candidato, Integer> listaDeVotosPorCandidatos = new HashMap<Candidato, Integer>();

	public void setCandidatos(Candidato unCandidato) {
		listaDeCandidatos.add(unCandidato);
		Candidato candidato = unCandidato;
		listaDeVotosPorCandidatos.put(candidato, 0);
	}

	public void recibirVoto(Voto unVoto) {
		listaDeVotos.add(unVoto);
	}

	public Candidato getCandidatoConMasVotosNacional() {

		Iterator<Voto> iteradorListaVoto = listaDeVotos.iterator();

		while (iteradorListaVoto.hasNext()) {
			Candidato candidato = iteradorListaVoto.next().getCandidato();
			int valor = (listaDeVotosPorCandidatos.get(candidato)) + 1;
			listaDeVotosPorCandidatos.put(candidato, valor);
		}

		Map.Entry<Candidato, Integer> maxEntry = null;

		for (Map.Entry<Candidato, Integer> entry : listaDeVotosPorCandidatos.entrySet()) {
			if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
				maxEntry = entry;
			}
		}
		Candidato candidato = maxEntry.getKey();

		return candidato;
	}

	public Partido getPartidoConMasVotosEnProvincia(Provincia unaProvincia) {

		Provincia provincia = unaProvincia;
		Voto unVoto;
		Iterator<Voto> iterador2ListaVoto = listaDeVotos.iterator();
		Iterator<Candidato> iteradorDeCandidatos = listaDeCandidatos.iterator();

		while (iterador2ListaVoto.hasNext()) {

			unVoto = iterador2ListaVoto.next();

			if (unVoto.getProvincia() == provincia) {
				Candidato candidato = unVoto.getCandidato();
				int valor = (listaDeVotosPorCandidatos.get(candidato)) + 1;
				listaDeVotosPorCandidatos.put(candidato, valor);
			}
		}

		Map.Entry<Candidato, Integer> maxEntry = null;

		for (Map.Entry<Candidato, Integer> entry : listaDeVotosPorCandidatos.entrySet()) {
			if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
				maxEntry = entry;
			}
		}

		Candidato candidato = maxEntry.getKey();
		Partido partido = null;
		Candidato unCandidato;

		while (iteradorDeCandidatos.hasNext()) {

			unCandidato = iteradorDeCandidatos.next();

			if (unCandidato == candidato) {
				partido = unCandidato.getPartido();
			}
		}

		return partido;

	}

}
