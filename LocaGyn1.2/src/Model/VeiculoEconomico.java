package Model;

public class VeiculoEconomico extends TipoVeiculoAbstractFactory {
	public VeiculoEconomico() {
		tipo= "economico";
	}

	@Override
	public Object[] getListaVeiculos() {
		Object[] lista= {"celta", "uno"};
		return lista;
	}

	@Override
	public Veiculo getVeiculo(String veiculo) {
		if (veiculo == null) {
			return null;
		}
		else if(veiculo.equals("celta")) {
			return new Celta();
		}
		else if(veiculo.equals("uno")) {
			return new Uno();
		}
		else return null;
	}

}
