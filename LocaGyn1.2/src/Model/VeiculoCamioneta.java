package Model;

public class VeiculoCamioneta extends TipoVeiculoAbstractFactory {
	public VeiculoCamioneta() {
		tipo= "camioneta";
	}

	@Override
	public Object[] getListaVeiculos() {
		Object[] lista= {"s10", "toro"};
		return lista;
	}

	@Override
	public Veiculo getVeiculo(String veiculo) {
		if (veiculo == null) {
			return null;
		}
		else if(veiculo.equals("s10")) {
			return new S10();
		}
		else if(veiculo.equals("toro")) {
			return new Toro();
		}
		else return null;
	}

}
