package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public abstract class GenericDAO {
	private Connection connection; //variavel para conexao

    protected GenericDAO() {
        this.connection = ConexaoDBSingleton.getConeConnection(); //conexao DB
    }

    protected Connection getConnection() {
        return connection;
    }
    
    //salvar---------------------------------------------------------------------------
    protected void save(String insertSql, Object... parametros) throws SQLException {
        PreparedStatement pstmt = 
			getConnection().prepareStatement(insertSql);

        for (int i = 0; i < parametros.length; i++) {
            pstmt.setObject(i+1, parametros[i]);
        }

        pstmt.execute();
        pstmt.close();
        connection.close();
    }
    //FIM salvar---------------------------------------------------------------------------
    //atualizar-----------------------------------------------------------------------------------
    protected void update(String updateSql, Object id, Object... parametros) throws SQLException {
        PreparedStatement pstmt = 
			getConnection().prepareStatement(updateSql);
			
        for (int i = 0; i < parametros.length; i++) {
            pstmt.setObject(i+1, parametros[i]);
        }
        pstmt.setObject(parametros.length + 1, id);
        pstmt.execute();
        pstmt.close();
        connection.close();
    }
    //FIM atualizar-----------------------------------------------------------------------------------
    //deletar---------------------------------------------------------------------------
    protected void delete(String deleteSql, Object... parametros) throws SQLException {
        PreparedStatement pstmt = 
			getConnection().prepareStatement(deleteSql);
			
        for (int i = 0; i < parametros.length; i++) {
            pstmt.setObject(i+1, parametros[i]);
        }

        pstmt.execute();
        pstmt.close();
        connection.close();
    }
    //FIM deletar---------------------------------------------------------------------------

}
