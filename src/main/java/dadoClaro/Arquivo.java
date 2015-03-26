package dadoClaro;
public class Arquivo {
	private String telefone;
	private String secao;
	private String data;
	private String hora;
	private String origemDestino;
	private String numero;
	private String duracaoQuantidade;
	private String tarifa;
	private Double valor;
	private Double valorCobrado;
	private String nome;
	private String cc;
	private String matricula;
	private String subSecao;
	private String tipoImposto;
	private String descricao;
	private String cargo;

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSecao() {
		return secao;
	}

	public void setSecao(String secao) {
		this.secao = secao;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getOrigemDestino() {
		return origemDestino;
	}

	public void setOrigemDestino(String origemDestino) {
		this.origemDestino = origemDestino;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDuracaoQuantidade() {
		return duracaoQuantidade;
	}

	public void setDuracaoQuantidade(String duracaoQuantidade) {
		this.duracaoQuantidade = duracaoQuantidade;
	}

	public String getTarifa() {
		return tarifa;
	}

	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getValorCobrado() {
		return valorCobrado;
	}

	public void setValorCobrado(Double valorCobrado) {
		this.valorCobrado = valorCobrado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getSubSecao() {
		return subSecao;
	}

	public void setSubSecao(String subSecao) {
		this.subSecao = subSecao;
	}

	public String getTipoImposto() {
		return tipoImposto;
	}

	public void setTipoImposto(String tipoImposto) {
		this.tipoImposto = tipoImposto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "ArquivoClaro [telefone=" + telefone + ", secao=" + secao
				+ ", data=" + data + ", hora=" + hora + ", origemDestino="
				+ origemDestino + ", numero=" + numero + ", duracaoQuantidade="
				+ duracaoQuantidade + ", tarifa=" + tarifa + ", valor=" + valor
				+ ", valorCobrado=" + valorCobrado + ", nome=" + nome + ", cc="
				+ cc + ", matricula=" + matricula + ", subSecao=" + subSecao
				+ ", tipoImposto=" + tipoImposto + ", descricao=" + descricao
				+ ", cargo=" + cargo + "]";
	}

}
