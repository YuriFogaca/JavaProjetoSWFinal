package Model;

public abstract class TipoVeiculoAbstractFactory {
	protected String tipo;
	
	public String getTipo() {
		return tipo;
	}
	
	//métodos abstratos par os tipos dos veiculos
	public abstract Object[] getListaVeiculos();
	public abstract Veiculo getVeiculo(String veiculo);
	
	//métodos staticos para selecionar o tipo d veiculo
	public static Object[] getListaFabricas() {
		Object[] lista= {"economico", "completo", "camioneta"};
		
		return lista;
	}
	public static TipoVeiculoAbstractFactory getInstance(String tipo) {
		if(tipo == null) {
			return null;
		}
		else if(tipo.equals("economico")) {
			return new VeiculoEconomico();
		}
		else if(tipo.equals("completo")) {
			return new VeiculoCompleto();
		}
		else if(tipo.equals("camioneta")) {
			return new VeiculoCamioneta();
		}
		else return null;
	}

}
