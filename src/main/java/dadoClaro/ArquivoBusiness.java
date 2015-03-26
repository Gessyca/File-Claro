package dadoClaro;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.primefaces.model.UploadedFile;

public class ArquivoBusiness {
	public List<Arquivo> coletarDados(UploadedFile arquivo) throws IOException {
		StringBuffer sb = lerArquivo(arquivo);
		List<String> dadosSeparadosLinha = separarDadosPorLinha(sb);
		List<Arquivo> lista = adicionarDadosLista(dadosSeparadosLinha);
		return lista;
	}

	private StringBuffer lerArquivo(UploadedFile arquivo) throws IOException {
		InputStream is = arquivo.getInputstream();
		StringBuffer sb = new StringBuffer("");
		int i;
		while ((i = is.read()) != -1) {
			sb.append((char) i);
		}
		is.close();
		return sb;
	}

	private List<String> separarDadosPorLinha(StringBuffer sb)
			throws IOException {
		// Dados ir�o ser armazenados quando a tabela iniciar
		int index = sb.indexOf("Tel;");
		String x = sb.substring(index);
		// Separar por linha
		String[] dadosPorLinha = x.split(System.getProperty("line.separator"));
		List<String> listaDadosPorLinha = Arrays.asList(dadosPorLinha);
		// Retirando cabe�alho da tabela
		listaDadosPorLinha = listaDadosPorLinha.subList(1,
				listaDadosPorLinha.size());
		return listaDadosPorLinha;
	}

	private List<Arquivo> adicionarDadosLista(List<String> listaDados) {
		List<Arquivo> lista = new ArrayList<Arquivo>();
		for (String dado : listaDados) {
			String[] dados = dado.split(";", -1);
			Arquivo ac = popularObjeto(Arrays.asList(dados));
			lista.add(ac);
		}
		return lista;
	}

	private Arquivo popularObjeto(List<String> dados) {
		Arquivo ac = new Arquivo();
		ac.setTelefone(dados.get(0));
		ac.setSecao(dados.get(1));
		ac.setData(dados.get(2));
		ac.setHora(dados.get(3));
		ac.setOrigemDestino(dados.get(4));
		ac.setNumero(dados.get(5));
		ac.setDuracaoQuantidade(dados.get(6));
		ac.setTarifa(dados.get(7));
		ac.setValor(validarDado(dados.get(8)));
		ac.setValorCobrado(validarDado(dados.get(9)));
		ac.setNome(dados.get(10));
		ac.setCc(dados.get(11));
		ac.setMatricula(dados.get(12));
		ac.setSubSecao(dados.get(13));
		ac.setTipoImposto(dados.get(14));
		ac.setDescricao(dados.get(15));
		ac.setCargo(dados.get(16));
		return ac;
	}

	private double validarDado(String valor) {
		valor = valor.replace(",", ".");
		if (valor != null && !valor.isEmpty()) {
			return Double.parseDouble(valor);
		} else {
			return 0.0;
		}
	}

}
