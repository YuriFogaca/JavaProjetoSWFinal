package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDBSingleton {
	
	private ConexaoDBSingleton() {
		
	}
	public static ConexaoDBSingleton instanciaConexao= null;
	public static ConexaoDBSingleton getConexaoDbSingleton() {
		if(instanciaConexao == null) {
			instanciaConexao= new ConexaoDBSingleton();
		}
		return instanciaConexao;
	}
	
	public static Connection getConeConnection() {
		System.out.println("Conectando ao Banco de Dados");
		try {
			return DriverManager.getConnection(url);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	public void Conectar() throws SQLException {
		conexao= DriverManager.getConnection(url);
		System.out.println("Connection to SQLite has been established.");
    	conexao.setAutoCommit(false);
	}
	
	public void Desconectar() throws SQLException {
		conexao.close();
		System.out.println("Connection to SQLite has been closed.");
	}
	
	//GETs de acesso --------------------------------------------------------------------------
	public String getMydatabase() {
		return mydatabase;
	}
	public String getUrl() {
		return url;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public Connection getConexao() {
		return conexao;
	}
	//FIM GETs de acesso ----------------------------------------------------------------------
	
	//variaveis de acesso ---------------------------------------------------------------	
	String mydatabase = "sqlite";	//nome do seu banco de dados
	private static String url = "jdbc:sqlite:D://Arquivos/SQLiteStudio/LocaGyn.db"; //endereço Conexão
	private static String username = "root";        //nome de um usuário de seu BD
	private static String password = "admin";      //sua senha de acesso
	private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver"; //org.sqlite.tmpdir ou java.io.tmpdir
	Connection conexao;	
	//FIM variaveis de acesso------------------------------------------------------------

}
