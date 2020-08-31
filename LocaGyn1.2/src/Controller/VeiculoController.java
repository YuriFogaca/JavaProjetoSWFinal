package Controller;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import DAO.VeiculoDAO;
import Model.Veiculo;

public class VeiculoController {
	//cadastrar --------------------------
	public void cadastrarVeiculo(Veiculo veiculo,
			String placa, String cor, 
			int numeroPortas, long quilometragem, int tipoCombustivel, long renavam, 
			String chassi, double valorLocacao, String status, int idmodeloVeiculo) throws SQLException {
		veiculo.setPlaca(placa);
		veiculo.setCor(cor);
		veiculo.setNumeroPortas(numeroPortas);
		veiculo.setTipoCombustivel(tipoCombustivel);
		veiculo.setQuilometragem(quilometragem);
		veiculo.setRenavam(renavam);
		veiculo.setChassi(chassi);
		veiculo.setValorLocacao(valorLocacao);
		veiculo.setStatus(status);
		
		new VeiculoDAO().cadastrarVeiculo(veiculo);
	}
	//FIMcadastrar --------------------------
	//atualizar-----------------------------
	public void atualizarVeiculo(Veiculo veiculo,
			String modelo, String marca, String placa, String cor, 
			int numeroPortas, long quilometragem, long renavam, 
			String chassi, double valorLocacao) throws SQLException {
		veiculo.setModelo(modelo);
		veiculo.setMarca(marca);
		veiculo.setPlaca(placa);
		veiculo.setCor(cor);
		veiculo.setNumeroPortas(numeroPortas);
		veiculo.setQuilometragem(quilometragem);
		veiculo.setRenavam(renavam);
		veiculo.setChassi(chassi);
		veiculo.setValorLocacao(valorLocacao);
		
		new VeiculoDAO().atualizarVeiculo(veiculo);
		
	}
	//FIMatualizar-----------------------------
	//Listar-------------------------------
	public ArrayList listarVeiculos(Veiculo veiculo) throws SQLException {
		VeiculoDAO dao= new VeiculoDAO();
		try {
			return dao.consultarTodosVeiculos(veiculo);
		} catch (SQLException e) {
			JOptionPane.showInputDialog("Erro ao listar os veiculos - " +
		e.getLocalizedMessage());
		}
		return dao.consultarTodosVeiculos(veiculo);
	}
	//FIMListar-------------------------------
	//Buscar---------------------------
	public Veiculo buscarVeiculo(String placa, Veiculo veiculo) throws SQLException {
		VeiculoDAO dao= new VeiculoDAO();
		return dao.consultarVeiculo(placa, veiculo);
	}
	//FIMBuscar---------------------------
	//Buscar---------------------------
	public Veiculo buscarIdVeiculo(int id, Veiculo veiculo) throws SQLException {
		VeiculoDAO dao= new VeiculoDAO();
		return dao.consultarVeiculoId(id, veiculo);
	}
	//FIMBuscar---------------------------
	

}
