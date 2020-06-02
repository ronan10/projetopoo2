package DAO;

import java.util.ArrayList;
import java.util.List;
import Models.Serie;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EpisodiosDAO {

	private static Connection myConnection;

	public EpisodiosDAO() throws SQLException{
		//conexao com o mysql
		String dburl = "jdbc:mysql://localhost:3306/episodiosdao?useTimezone=true&serverTimezone=America/Sao_Paulo";
		String user = "root";
		String password = "administrador";

		myConnection = DriverManager.getConnection(dburl, user, password);

		System.out.println("Conectado");

	}
	//pega todos os episodios da tabela do banco e retorna pra tabela da aplicacao
	
	public List<Serie> getAllEpisodios() throws SQLException{

		List<Serie> list = new ArrayList<>();

		Statement statement = myConnection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM episodio");
		
		System.out.println(resultSet.toString());
		// Trata o ultimo objeto da lista e finaliza a execucao
		while (resultSet.next()) {
			Serie tempSerie = new Serie(
					resultSet.getString("nome"), 
					resultSet.getString("temporada"),
					resultSet.getInt("ano"), 
					resultSet.getBoolean("episodioassistido"), 
					resultSet.getString("nota")
					);
			list.add(tempSerie);
		}
		statement.close();
		System.out.println(list);
		return list;
	}
	// realiza a insercao dos dados da aplicacao na tabela do banco
	public void insertEpisodios(Serie serie)throws SQLException {

		Statement statement = null;

		statement = myConnection.createStatement();
		String query = String.format("INSERT episodio SET "
				+ " nome = '%s' , temporada = '%s' , ano = '%d', episodio assistido = %b, nota = %s ",
				 serie.getNome(), serie.getTemporada(), serie.getAno(), serie.isEpisodioAssistido(), serie.getNota()
				);
		System.out.println(query);
		statement.executeUpdate(query);
		}
	
	// da um Update nos dados da tabela
	public void atualizarEpisodios(int id, Serie serie) throws SQLException {
		Statement statement = null;

		statement = myConnection.createStatement();
		String query = String.format("UPDATE episodio SET "
				+ " nome = '%s' , temporada = '%s' , ano = '%d', episodio assistido = %b, nota = %s ",
				 serie.getNome(), serie.getTemporada(), serie.getAno(), serie.isEpisodioAssistido(), serie.getNota()
				);
		System.out.println(query);
		statement.executeUpdate(query);

	}

}
