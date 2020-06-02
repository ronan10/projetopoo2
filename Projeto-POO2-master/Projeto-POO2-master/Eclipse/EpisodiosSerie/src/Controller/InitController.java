package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JTable;

import DAO.EpisodiosDAO;
import Models.Serie;
import View.CadastroView;
import View.ExibirView;

public class InitController implements ActionListener {

	private CadastroView cadastroView;
	private ExibirView exibirView;
	
	public InitController() throws SQLException {
		
		exibirView = new ExibirView();
		cadastroView = new CadastroView();
		ExibirController exibirController = new ExibirController(exibirView.table);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub

		switch (event.getActionCommand()) {
		case "Cadastro":this.abrirCadastro();
			break;
		case "Exibir":this.abrirExibir();
			break;
		}
	}

	private void abrirCadastro() {
		cadastroView.setVisible(true);
	}

	private void abrirExibir(){	
		System.out.println("Exibir");
		exibirView.setVisible(true);
		
	}

}
