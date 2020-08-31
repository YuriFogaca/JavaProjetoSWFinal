package Controller;

import Model.Observer;
import Model.Subject;
import Model.Veiculo;

public class ObservadorDeStatus implements Observer {
	private Veiculo dados;
	private Subject sujeitoStatus;
	//construtor e atribuicao aos sujeito ------------------------------------------------------
	public ObservadorDeStatus(Subject sujeitoStatus) {
		this.sujeitoStatus= sujeitoStatus;
		this.sujeitoStatus.incluir(this);
	}
	//construtor e atribuicao aos sujeito ------------------------------------------------------

	@Override
	public void atualizarDados(Veiculo veiculo) {
		if(veiculo.getStatus() == "disponivel") {
			this.dados= veiculo;
			mostrarDados(veiculo);
		}		
	}
	//imprimir dados na tela -------------------------------------------------------------------
	public void mostrarDados(Veiculo veiculo) {
		System.out.println();
		System.out.println("------------------------------------------------------------------");
		System.out.println("Modelo Veiculo: " + veiculo.getModelo());
		System.out.println("Placa: " + veiculo.getPlaca());
		System.out.println("------------------------------------------------------------------");
	}
	//imprimir dados na tela -------------------------------------------------------------------

}
