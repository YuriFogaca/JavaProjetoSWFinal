package Model;

import java.sql.SQLException;

public interface Subject { //sujeito espera atualizacoes dos status
	public void incluir(Observer o); //incluir observer
	public void remover(Observer o); //remover observer
	public void notificar() throws SQLException; //notifica o observador das atualizacoes
}
