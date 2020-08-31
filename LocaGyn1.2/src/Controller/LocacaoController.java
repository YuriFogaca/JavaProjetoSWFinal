package Controller;

import java.sql.SQLException;

import DAO.LocacaoDAO;
import Model.Locacao;

public class LocacaoController {
	//cadastrar locacao -----------------------------------------------------------------------------
	public void cadastrarLocacao(String dataLocacao, String dataDevolucao,
				String horaLocacao, String horaDevolucao,
				double valorCaucao, int devolvido) throws SQLException {
		Locacao locacao= new Locacao();
		
		locacao.setDataLocacao(dataLocacao);
		locacao.setDataDevolucao(dataDevolucao);
		locacao.setHoraLocacao(horaLocacao);
		locacao.setHoraDevolucao(horaDevolucao);
		locacao.setValorCaucao(valorCaucao);
		locacao.setDevolvido(devolvido);
		
		new LocacaoDAO().cadastrarLocacao(locacao);
	}
	//FIM cadastrar locacao -------------------------------------------------------------------------
	//atualizar locacao -----------------------------------------------------------------------------
	public void atualizarLocacao(int idLocacao, String dataLocacao, String dataDevolucao,
				String horaLocacao, String horaDevolucao,
				double valorCaucao, int devolvido) throws SQLException {
		Locacao locacao= new Locacao();
		
		locacao.setIdLocacao(idLocacao);
		locacao.setDataLocacao(dataLocacao);
		locacao.setDataDevolucao(dataDevolucao);
		locacao.setHoraLocacao(horaLocacao);
		locacao.setHoraDevolucao(horaDevolucao);
		locacao.setValorCaucao(valorCaucao);
		locacao.setDevolvido(devolvido);
		
		new LocacaoDAO().atualizarLocacao(locacao);
	}
	//FIM atualizar locacao -------------------------------------------------------------------------
	//consultar locacao -----------------------------------------------------------------------------
	public Locacao consultarLocacao(int idLocacao) throws SQLException {
		LocacaoDAO dao= new LocacaoDAO();
		return dao.consultarLocacao(idLocacao);
	}
	//FIM consultar locacao -------------------------------------------------------------------------
}
