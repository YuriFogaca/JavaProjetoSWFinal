package View;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.VeiculoController;
import DAO.ConexaoDBSingleton;
import Model.TipoVeiculoAbstractFactory;
import Model.Veiculo;

public class testeSaida {
	
	public static void imprimir(Veiculo objt, String tipo) {
		String saida= "Tipo= " + tipo+ "\n"
				+ "Modelo= " + objt.getModelo() + "\n"
				+ "Marca= " + objt.getMarca() + "\n"
				+ "Valor Locacao= R$" + objt.getValorLocacao() + "\n"
				+ "Cor= " + objt.getCor() + "\n"
				+ "Número de portas= " + objt.getNumeroPortas() + "\n"
				+ "Placa: " + objt.getPlaca() + "\n"
				+ "Chassi: " + objt.getChassi() + "\n"
				+ "Renavan: " + objt.getRenavam() + "\n";
		JOptionPane.showMessageDialog(null, saida);
	}

	public static void main(String[] args) throws SQLException {
		/*
		ConexaoDBSingleton c;
		c= ConexaoDBSingleton.getConexaoDbSingleton();
		c.Conectar();
		c.Desconectar();
		
		boolean controle1= true;
		Object tipoVeiculo;
		Object[] opcoesDeVeiculos= TipoVeiculoAbstractFactory.getListaFabricas();
		
		do {
			tipoVeiculo= JOptionPane.showInputDialog(null, 
					"Deseja finazilar o programa?", 
					"finalização", 
					JOptionPane.PLAIN_MESSAGE, 
					null, opcoesDeVeiculos, 
					opcoesDeVeiculos[2]);
			
			TipoVeiculoAbstractFactory objtTipoVeiculoAbstractFactory= TipoVeiculoAbstractFactory.getInstance(tipoVeiculo.toString());
			
			String veiculo= objtTipoVeiculoAbstractFactory.getTipo();
			boolean controle2= true;
			Object modeloDoVeiculo;
			Object[] opcoesModeloVeiculo= objtTipoVeiculoAbstractFactory.getListaVeiculos();
			do {
				modeloDoVeiculo= JOptionPane.showInputDialog(null, 
						"Deseja finazilar o programa?", 
						"finalização", 
						JOptionPane.PLAIN_MESSAGE, 
						null, opcoesModeloVeiculo, 
						opcoesModeloVeiculo[0]);
				if(modeloDoVeiculo == null) controle2= false;
				else{
					Veiculo modeloVeiculo= objtTipoVeiculoAbstractFactory.getVeiculo(modeloDoVeiculo.toString());
					imprimir(modeloVeiculo, veiculo);
				}
			} while (controle2);
			
		} while (controle1);*/
		
		//testar cadastrar veiculo------------------------------------------------------------------
		//variavei a atribuir
		String placa= "NGY4633";
		String cor= "amarelo";
		int numeroPortas= 4;
		long quilometragem= 120000;
		int tipoCombustivel= 1;
		long renavam= 9008891;
		String chassi= "00oqmkweo1123";
		double valorLocacao= 120.00;
		String status= "locado";
		int idModeloVeiculo= 1;
		//objeto Controller para atribuição
		VeiculoController vc= new VeiculoController();
		try {
			//escolher o tipo do objeto veiculo
			TipoVeiculoAbstractFactory objTipoVeiculoAbstractFactory= TipoVeiculoAbstractFactory.getInstance("economico");
			//escolher o modelo do objeto veiculo
			Veiculo veiculo= objTipoVeiculoAbstractFactory.getVeiculo("uno");
			
			vc.cadastrarVeiculo(veiculo, placa, cor, numeroPortas, quilometragem, tipoCombustivel, renavam, chassi, valorLocacao, status, idModeloVeiculo);
			JOptionPane.showMessageDialog(null, "Veiculo cadastrado");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Não foi posspível cadastrar o Veiculo no DB"
					+ e.getLocalizedMessage());
		}
		
		//FIM testar cadastrar veiculo---------------------------------------------------------------
		

	}

}
