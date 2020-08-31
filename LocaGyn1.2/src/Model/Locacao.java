package Model;

public class Locacao{
	
	//GETTERS AND SETTERS LOCAÇÃO ----------------------------------------------------------------
	public String getDataLocacao() {
		return dataLocacao;
	}
	public void setDataLocacao(String dataLocacao) {
		this.dataLocacao = dataLocacao;
	}
	public String getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public String getHoraLocacao() {
		return horaLocacao;
	}
	public void setHoraLocacao(String horaLocacao) {
		this.horaLocacao = horaLocacao;
	}
	public String getHoraDevolucao() {
		return horaDevolucao;
	}
	public void setHoraDevolucao(String horaDevolucao) {
		this.horaDevolucao = horaDevolucao;
	}
	public double getValorCaucao() {
		return valorCaucao;
	}
	public void setValorCaucao(double valorCaucao) {
		this.valorCaucao = valorCaucao;
	}
	public int getDevolvido() {
		return devolvido;
	}
	public void setDevolvido(int devolvido) {
		this.devolvido = devolvido;
	}
	public int getIdLocacao() {
		return idLocacao;
	}
	public void setIdLocacao(int idLocacao) {
		this.idLocacao = idLocacao;
	}
	//FIM GETTERS AND SETTERS LOCAÇÃO --------------------------------------------------------------

	
	//variaveis locacao----------------------------------------------------------------------------
	private String dataLocacao;
	private String dataDevolucao;
	private String horaLocacao;
	private String horaDevolucao;
	private double valorCaucao;
	private int devolvido;
	private int idLocacao;
	//FIM variaveis locacao-------------------------------------------------------------------------

}
