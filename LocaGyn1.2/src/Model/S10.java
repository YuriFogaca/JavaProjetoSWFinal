package Model;

public class S10 implements Veiculo {
	String modelo;
	String marca;
	String placa;
	String cor;
	String chassi;
	String status;
	int tipoCombustivel;
	int nPortas;
	int idVeiculo;
	int idModeloVeiculo;
	int idMarcaVeiculo;
	long quilometragem;
	long renavam;
	double valorLocacao;
	

	@Override
	public String getModelo() {
		// TODO Auto-generated method stub
		return modelo;
	}

	@Override
	public String getMarca() {
		// TODO Auto-generated method stub
		return marca;
	}

	@Override
	public String getPlaca() {
		// TODO Auto-generated method stub
		return placa;
	}

	@Override
	public String getCor() {
		// TODO Auto-generated method stub
		return cor;
	}

	@Override
	public int getNumeroPortas() {
		// TODO Auto-generated method stub
		return nPortas;
	}

	@Override
	public long getQuilometragem() {
		// TODO Auto-generated method stub
		return quilometragem;
	}

	@Override
	public long getRenavam() {
		// TODO Auto-generated method stub
		return renavam;
	}

	@Override
	public String getChassi() {
		// TODO Auto-generated method stub
		return chassi;
	}

	@Override
	public double getValorLocacao() {
		// TODO Auto-generated method stub
		return valorLocacao;
	}

	@Override
	public void setModelo(String modelo) {
		this.modelo= modelo;
		
	}

	@Override
	public void setMarca(String marca) {
		this.marca= marca;
		
	}

	@Override
	public void setPlaca(String placa) {
		this.placa= placa;
		
	}

	@Override
	public void setCor(String cor) {
		this.cor= cor;
		
	}

	@Override
	public void setNumeroPortas(int nPortas) {
		this.nPortas= nPortas;
		
	}

	@Override
	public void setQuilometragem(long quilometragem) {
		this.quilometragem= quilometragem;
		
	}

	@Override
	public void setRenavam(long renavam) {
		this.renavam= renavam;
		
	}

	@Override
	public void setChassi(String chassi) {
		this.chassi= chassi;
		
	}

	@Override
	public void setValorLocacao(double valorLocacao) {
		this.valorLocacao= valorLocacao;
		
	}

	@Override
	public void setTipoCombustivel(int tipoCombustivel) {
		this.tipoCombustivel= tipoCombustivel;
		
	}

	@Override
	public int getTipoCombustivel() {
		// TODO Auto-generated method stub
		return tipoCombustivel;
	}

	@Override
	public void setStatus(String status) {
		this.status= status;
		
	}

	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return status;
	}

	@Override
	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo= idVeiculo;
		
	}

	@Override
	public int getIdVeiculo() {
		// TODO Auto-generated method stub
		return idVeiculo;
	}

	@Override
	public void setIdModeloVeiculo(int idModeloVeiculo) {
		this.idModeloVeiculo= idModeloVeiculo;
		
	}

	@Override
	public int getIdModeloVeiculo() {
		// TODO Auto-generated method stub
		return idModeloVeiculo;
	}

	@Override
	public void setIdMarcaVeiculo(int idMarcaVeiculo) {
		this.idMarcaVeiculo= idMarcaVeiculo;
		
	}

	@Override
	public int getIdMarcaVeiculo() {
		// TODO Auto-generated method stub
		return idMarcaVeiculo;
	}

}
