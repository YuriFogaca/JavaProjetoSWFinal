package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Locacao;

public class LocacaoDAO extends GenericDAO {
	//cadastrar locacao ---------------------------------------------------------------------------
	public void cadastrarLocacao(Locacao locacao) throws SQLException {
		String insert= "insert into 'locacao' (dt_locacao, dt_devolucao,"
				+ "		hora_locacao, hora_devolucao,"
				+ "		valor_caucao, devolvido)"
				+ "		values(?, ?, ?, ?, ?, ?)";
		save(insert, locacao.getDataLocacao(), locacao.getDataDevolucao(),
				locacao.getHoraLocacao(), locacao.getHoraDevolucao(),
				locacao.getValorCaucao(), locacao.getDevolvido());
		
	}
	//FIM cadastrar locacao -----------------------------------------------------------------------
	//atualizar locacacao ---------------------------------------------------------------------------
	public void atualizarLocacao(Locacao locacao) throws SQLException {
		String update= "update 'locacao' set dt_locacao= ?, dt_devolucao= ?,"
				+ "		hora_locacao= ?, hora_devolucao= ?,"
				+ "		valor_caucao= ?, devolvido= ?"
				+ "		where id_locacao= ?";
		update(update, locacao.getIdLocacao(), locacao.getDataLocacao(), locacao.getDataDevolucao(),
				locacao.getHoraLocacao(), locacao.getHoraDevolucao(),
				locacao.getValorCaucao(), locacao.getDevolvido());
	}
	//FIM atualizar locacao -----------------------------------------------------------------------
	//consultar locacao ---------------------------------------------------------------------------
	public Locacao consultarLocacao(int idLocacao) throws SQLException {
		String select= "select * from 'locacao' where id_locacao= ?";
		Locacao locacao= null;
		PreparedStatement stmt= getConnection().prepareStatement(select);
		stmt.setInt(1, idLocacao);
		ResultSet rs= stmt.executeQuery();
		
		while (rs.next()) {
			locacao= new Locacao();
			
			locacao.setIdLocacao(idLocacao);
			locacao.setDataLocacao(rs.getString("dt_locacao"));
			locacao.setDataDevolucao(rs.getString("dt_devolucao"));
			locacao.setHoraLocacao(rs.getString("hora_locacao"));
			locacao.setHoraDevolucao(rs.getString("hora_devolucao"));
			locacao.setValorCaucao(rs.getDouble("valor_caucao"));
			locacao.setDevolvido(rs.getInt("devolvido"));
			
			
		}
		
		rs.close();
		stmt.close();
		getConnection().close();
		
		return locacao;
	}
	//FIM consultar locacao -----------------------------------------------------------------------

}
