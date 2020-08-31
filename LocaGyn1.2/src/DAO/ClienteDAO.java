package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.ArrayList;
import java.util.List;

import Model.Cliente;

public class ClienteDAO extends GenericDAO {
	//cadastrar cliente ----------------------------------------------------------------------------
	public void cadastrarCliente(Cliente cliente) throws SQLException {
		String insert= "insert into 'cliente' (cpf, nom_cli, end_cli, tel_cli, email_cli)"
				+ "		values(?, ?, ?, ?, ?)";
		save(insert, cliente.getCpf(), cliente.getNome(), cliente.getEndereco(),
				cliente.getTelefone(), cliente.getEmail());
	}
	//FIM cadastrar cliente -------------------------------------------------------------------------
	//atualizar cliente ----------------------------------------------------------------------------
	public void atualizarCliente(Cliente cliente) throws SQLException {
		String update= "update 'cliente' "
				+ "		set nom_cli= ?, end_cli= ?, tel_cli, email_cli= ?"
				+ "		where cpf= ?";
		update(update, cliente.getIdCliente(), cliente.getNome(), cliente.getEndereco(),
				cliente.getTelefone(), cliente.getEmail(),
				cliente.getCpf());
	}
	//FIM atualizar cliente -------------------------------------------------------------------------
	//consultar cliente ----------------------------------------------------------------------------
	public List<Cliente> consultarTodosCliente() throws SQLException {
		List clientes= new ArrayList();
		
		String select= "select * from 'cliente'";
		
		PreparedStatement stmt= getConnection().prepareStatement(select);
		ResultSet rs= stmt.executeQuery();
		
		while (rs.next()) {
			Cliente cliente= new Cliente();
			
			cliente.setIdCliente(rs.getInt("id_cliente"));
			cliente.setCpf(rs.getLong("cpf"));
			cliente.setNome(rs.getString("nom_cli"));
			cliente.setEndereco(rs.getString("end_cli"));
			cliente.setTelefone(rs.getString("tel_cli"));
			cliente.setEmail(rs.getString("email_cli"));
			
			clientes.add(cliente);
		}
		
		rs.close();
		stmt.close();
		getConnection().close();
		
		return clientes;
	}
	//FIM consultar cliente -------------------------------------------------------------------------
	//consultar cliente ----------------------------------------------------------------------------
	public Cliente consultarCliente(String nome) throws SQLException {
		Cliente cliente= null;
		
		String select= "select * from 'cliente' where nom_cli= ?";
		
		PreparedStatement stmt= getConnection().prepareStatement(select);
		stmt.setString(3, nome);
		ResultSet rs= stmt.executeQuery();
		
		while (rs.next()) {
			cliente= new Cliente();
			
			cliente.setIdCliente(rs.getInt("id_cliente"));
			cliente.setCpf(rs.getLong("cpf"));
			cliente.setNome(rs.getString("nom_cli"));
			cliente.setEndereco(rs.getString("end_cli"));
			cliente.setTelefone(rs.getString("tel_cli"));
			cliente.setEmail(rs.getString("email_cli"));
		}
		
		rs.close();
		stmt.close();
		getConnection().close();
		
		return cliente;
	}
	//FIM consultar cliente -------------------------------------------------------------------------
}
