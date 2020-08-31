package Controller;

import java.sql.SQLException;
import java.util.ArrayList;

import Model.Observer;
import Model.Subject;
import Model.Veiculo;

public class StatusVeiculoSujeito implements Subject {
	private ArrayList observers;
	private Veiculo dados;
	
	//construtor para acesso ao sujeito-------------------------------------------------------
	public StatusVeiculoSujeito() {
		observers= new ArrayList();
	}
	//FIM construtor para acesso ao sujeito-------------------------------------------------------
	//METODOS SUJEITO-----------------------------------------------------------------------------
	@Override
	public void incluir(Observer o) {
		observers.add(o); //inclui o objeto observer na lista de observers
		
	}

	@Override
	public void remover(Observer o) {
		int i= observers.indexOf(o); //indice o objeto observer
		if(i >= 0) {
			observers.remove(i);
		}
		
	}

	@Override
	public void notificar() throws SQLException {
		VeiculoController vc= new VeiculoController();
		for (int i = 0; i < observers.size(); i++) {
			if (dados.getStatus() == "disponivel") {
				Observer observer= (Observer)observers.get(i);
				this.dados= vc.buscarIdVeiculo(i, dados);
				observer.atualizarDados(dados);
			}
		}
		
	}
	//FIM METODOS SUJEITO----------------------------------------------------------------------------
	//setar valores dos dados------------------------------------------------------------------------
	public void setarDados(Veiculo dados) throws SQLException {
		if(dados.getStatus() == "disponivel") {
			this.dados= dados;
			notificar();
		}
	}
	//setar valores dos dados------------------------------------------------------------------------

}
