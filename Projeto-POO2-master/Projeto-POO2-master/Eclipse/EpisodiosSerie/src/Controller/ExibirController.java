package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import DAO.EpisodiosDAO;
import Models.Serie;
import View.CadastroView;
import View.ExibirView;

public class ExibirController implements ActionListener {

	private JTable table;

	public String column[] = { "Nome", "Temporada", "Ano", "Episodio Assistido", "Nota" };

	private DefaultTableModel model;

	public ExibirController(JTable table) throws SQLException {
		this.table = table;
		this.model = (DefaultTableModel) table.getModel();
		this.getSerie();
		System.out.println(table);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public String getSerie() {
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		
		for (String columnName : this.column) {
			model.addColumn(columnName); 
		}

		try {
			EpisodiosDAO episodioDAO = new EpisodiosDAO();
			List<Serie> list = episodioDAO.getAllEpisodios();

			for (Serie serie : list) {
				model.addRow(new Object[] { 
						serie.getNome(), 
						serie.getTemporada(), 
						serie.getAno(),
						serie.isEpisodioAssistido(), 
						serie.getNota() });
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

}
