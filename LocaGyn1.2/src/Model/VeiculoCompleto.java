package Model;

public class VeiculoCompleto extends TipoVeiculoAbstractFactory {
	public VeiculoCompleto() {
		tipo= "completo";
	}

	@Override
	public Object[] getListaVeiculos() {
		Object[] lista= {"gol", "palio"};
		return lista;
	}

	@Override
	public Veiculo getVeiculo(String veiculo) {
		if (veiculo == null) {
			return null;
		}
		else if(veiculo.equals("gol")) {
			return new Gol();
		}
		else if(veiculo.equals("palio")) {
			return new Palio();
		}
		else return null;
	}

}
