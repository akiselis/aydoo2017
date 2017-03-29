package ar.edu.untref.aydoo;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class Elecciones {

	LinkedList<Candidato> listaDeCandidatos = new LinkedList();
	LinkedList<Voto> listaDeVotos = new LinkedList();

	Map<Integer, Integer> listaDeVotosPorCandidatos = new HashMap<Integer, Integer>();

	public void setCandidatos(Candidato unCandidato) {
		listaDeCandidatos.add(unCandidato);
		int idDeCandidato = unCandidato.getIdCandidato();
		listaDeVotosPorCandidatos.put(idDeCandidato, 0);
	}

	public void recibirVoto(Voto unVoto) {
		listaDeVotos.add(unVoto);
	}

	public int getCandidatoConMasVotosNacional() {

		Iterator<Voto> iteradorListaVoto = listaDeVotos.iterator();

		while (iteradorListaVoto.hasNext()) {
			int idCandidato = iteradorListaVoto.next().getCandidato().getIdCandidato();
			int valor = (listaDeVotosPorCandidatos.get(idCandidato)) + 1;
			listaDeVotosPorCandidatos.put(idCandidato, valor);
		}

		Map.Entry<Integer, Integer> maxEntry = null;

		for (Map.Entry<Integer, Integer> entry : listaDeVotosPorCandidatos.entrySet()) {
			if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
				maxEntry = entry;
			}
		}
		int idCandidato = maxEntry.getKey();

		return idCandidato;
	}

	public String getCandidatoConMasVotosEnProvincia(int idProvincia) {

		int idDeProvincia = idProvincia;
		Voto unVoto;
		Iterator<Voto> iterador2ListaVoto = listaDeVotos.iterator();
		Iterator<Candidato> iteradorDeCandidatos = listaDeCandidatos.iterator();

		while (iterador2ListaVoto.hasNext()) {

			unVoto = iterador2ListaVoto.next();

			if (unVoto.getProvincia().getIdProvincia() == idDeProvincia) {
				int idCandidato = unVoto.getCandidato().getIdCandidato();
				int valor = (listaDeVotosPorCandidatos.get(idCandidato)) + 1;
				listaDeVotosPorCandidatos.put(idCandidato, valor);
			}
		}

		Map.Entry<Integer, Integer> maxEntry = null;

		for (Map.Entry<Integer, Integer> entry : listaDeVotosPorCandidatos.entrySet()) {
			if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
				maxEntry = entry;
			}
		}

		int idDeCandidato = maxEntry.getKey();
		String partido = null;
		Candidato unCandidato;

		while (iteradorDeCandidatos.hasNext()) {

			unCandidato = iteradorDeCandidatos.next();

			if (unCandidato.getIdCandidato() == idDeCandidato) {
				partido = unCandidato.getPartido();
			}
		}

		return partido;

	}

}
