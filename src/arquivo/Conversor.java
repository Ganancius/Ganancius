/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nodot
 */
public class Conversor {
  private Participante linhaToParticipante(String linha) {
		Participante participante = new Participante();

		participante.setNome(getNome(linha));
		participante.setTamanhoCamisa(getTamanhoCamisa(linha));
		//participante.setIstituicao(getIstituicao(linha));
		participante.setTime(getTime(linha));
		

		return participante;
	}

	public List<Participante> linhasToParticipantes(List<String> listaDeLinhas) {
		List<Participante> participantes = new ArrayList<Participante>();
		for (String linha : listaDeLinhas) {
			participantes.add(linhaToParticipante(linha));
		}
		return participantes;
	}

	private String getNome(String linha) {
		return getCampoDaLinha(linha, 0);
	}

	private String getTamanhoCamisa(String linha) {
		return getCampoDaLinha(linha, 1);
	}

	private String getInstituicao(String linha) {
		return getCampoDaLinha(linha, 2);
	}

	private String getTime(String linha) {
		return getCampoDaLinha(linha, 3);
	}

	private String getCampoDaLinha(String linha, int index) {
		String removedor = linha.split(",")[index];
		String campoSemAspas = removedor.replace("\"", "");
		return campoSemAspas;
	}

    
}
