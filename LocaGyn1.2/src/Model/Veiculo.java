package Model;

public interface Veiculo {
	public void setModelo(String modelo);
	public String getModelo();
	public void setMarca(String marca);
	public String getMarca();
	public void setPlaca(String placa);
	public String getPlaca();
	public void setCor(String cor);
	public String getCor();
	public void setNumeroPortas(int nPortas);
	public int getNumeroPortas();
	public void setQuilometragem(long quilometragem);
	public long getQuilometragem();
	public void setRenavam(long renavam);
	public long getRenavam();
	public void setChassi(String chassi);
	public String getChassi();
	public void setValorLocacao(double valorLocacao);
	public double getValorLocacao();
	public void setTipoCombustivel(int tipoCombustivel);
	public int getTipoCombustivel();
	public void setStatus(String status);
	public String getStatus();
	public void setIdVeiculo(int idVeiculo);
	public int getIdVeiculo();
	public void setIdModeloVeiculo(int idModeloVeiculo);
	public int getIdModeloVeiculo();
	public void setIdMarcaVeiculo(int idMarcaVeiculo);
	public int getIdMarcaVeiculo();
}
