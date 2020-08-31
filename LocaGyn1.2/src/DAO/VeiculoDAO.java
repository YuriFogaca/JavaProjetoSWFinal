package DAO;

import java.awt.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.Veiculo;

public class VeiculoDAO extends GenericDAO {
	
	//cadastrar Veiculo -----------------------
	public void cadastrarVeiculo(Veiculo veiculo) throws SQLException {
		String insert= "insert into 'veiculo' (placa, cor, nportas, "
				+ 		"tipo_combustivel, quilometragem, "
				+ 		"renavam,chassi, valor_locacao, status, id_modelo_veiculo)" +
				"	    values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		save(insert, veiculo.getPlaca(), veiculo.getCor(),veiculo.getNumeroPortas(),
				veiculo.getTipoCombustivel(), veiculo.getQuilometragem(),
				veiculo.getRenavam(), veiculo.getChassi(), veiculo.getValorLocacao(),
				veiculo.getStatus()); //colocar idveiculo
	}
	
	//FIM cadastrar Veiculo -----------------------
	//atualizar Veiculo -----------------------
	public void atualizarVeiculo(Veiculo veiculo) throws SQLException {
		String update= "update 'veiculo' set id_veiculo= ?,"
				+ "cor= ?,"
				+ "quilometragem= ?,"
				+ "valor_locacao= ?"
				+ "where placa= ?";
		update(update, veiculo.getIdVeiculo(),veiculo.getCor(), veiculo.getQuilometragem(), 
				veiculo.getValorLocacao(), veiculo.getPlaca()); //colocar idveiculo primeiro
		
	}
	//FIM atualizar Veiculo -----------------------
	//consultar todos Veiculos ----------------
	public ArrayList consultarTodosVeiculos(Veiculo veiculo) throws SQLException {
		ArrayList veiculos= new ArrayList();
		
		String select = "select * from 'veiculo'";
		
		PreparedStatement stmt= getConnection().prepareStatement(select);
		
		ResultSet rs= stmt.executeQuery();
		while (rs.next()) {
			veiculo.setModelo("id_modelo_veiculo");
			veiculo.setMarca("id_marca_veiculo");
			veiculo.setPlaca("placa");
			
			veiculos.add(veiculo);			
		}
		rs.close();
		stmt.close();
		getConnection().close();
		
		return veiculos;		
	}
	//consultar todos Veiculos ----------------
	//consultr Veiculo ------------------------
	public Veiculo consultarVeiculo(String placa, Veiculo veiculo) throws SQLException {
		String select = "SELECT * FROM 'veiculo' where placa= ?";
		
		PreparedStatement stmt= getConnection().prepareStatement(select);
		
		stmt.setString(2, placa);
		
		ResultSet rs= stmt.executeQuery();
		while(rs.next()) {
			veiculo.setModelo("id_modelo_veiculo");
			veiculo.setMarca("id_marca_veiculo");
			veiculo.setPlaca("placa");
		}
		
		rs.close();
		stmt.close();
		getConnection().close();
		
		return veiculo;
		
	}
	//FIM consultr Veiculo ------------------------
	//consultr Veiculo id------------------------
	public Veiculo consultarVeiculoId(int id, Veiculo veiculo) throws SQLException {
		String select = "SELECT * FROM 'veiculo' where id_veiculo= ?";
		
		PreparedStatement stmt= getConnection().prepareStatement(select);
		
		stmt.setInt(1, id);
		
		ResultSet rs= stmt.executeQuery();
		while(rs.next()) {
			veiculo.setModelo("id_modelo_veiculo");
			veiculo.setMarca("id_marca_veiculo");
			veiculo.setPlaca("placa");
		}
		
		rs.close();
		stmt.close();
		getConnection().close();
		
		return veiculo;
		
	}
	//FIM consultr Veiculo ------------------------
}
