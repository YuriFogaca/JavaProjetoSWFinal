package Controller;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import DAO.ClienteDAO;
import Model.Cliente;

public class ClienteController {
	//cadastrar cliente ----------------------------------------------------------------------------
	public void cadastrarCliente(long cpf, String nome, 
			String endereco, String telefone, String email) throws SQLException {
		Cliente cliente= new Cliente();
		
		cliente.setCpf(cpf);
		cliente.setNome(nome);
		cliente.setEndereco(endereco);
		cliente.setTelefone(telefone);
		cliente.setEmail(email);
		
		new ClienteDAO().cadastrarCliente(cliente);
	}
	//FIM cadastrar cliente -------------------------------------------------------------------------
	//atualizar cliente ----------------------------------------------------------------------------
	public void atualizarCliente(long cpf, String nome, 
			String endereco, String telefone, String email) throws SQLException {
		Cliente cliente= new Cliente();
		
		cliente.setCpf(cpf);
		cliente.setNome(nome);
		cliente.setEndereco(endereco);
		cliente.setTelefone(telefone);
		cliente.setEmail(email);
		
		new ClienteDAO().atualizarCliente(cliente);
	}
	//FIM atualizar cliente -------------------------------------------------------------------------
	//consultar cliente ----------------------------------------------------------------------------
	public List<Cliente> consultarTodosCliente() {
		ClienteDAO dao= new ClienteDAO();
		
		try {
            return dao.consultarTodosCliente();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, 
				"Problemas ao localizar contato" + 
				e.getLocalizedMessage()
			);
        }
		
		return null;
	}
	//FIM consultar cliente -------------------------------------------------------------------------
	//consultar cliente ----------------------------------------------------------------------------
	public Cliente consultarCliente(String nome) throws SQLException {
		ClienteDAO dao= new ClienteDAO();
		
		return dao.consultarCliente(nome);
	}
	//FIM consultar cliente -------------------------------------------------------------------------
}
