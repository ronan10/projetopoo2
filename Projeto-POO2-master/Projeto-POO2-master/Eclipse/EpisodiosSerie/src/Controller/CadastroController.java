package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Models.Serie;

public class CadastroController implements ActionListener {

	private JTextField textNomeEp;
	private JTextField textTemporadaEp;
	private JComboBox comboAno;
	private JCheckBox chckbxEpisodio;
	private JComboBox comboAvaliacao;
	private List<Serie> listSerie;

	public CadastroController(
			JTextField textNomeEp, 
			JTextField textTemporadaEp, 
			JComboBox comboAno,
			JCheckBox chckbxEpisodio, 
			JComboBox comboAvaliacao) {

		this.textNomeEp = textNomeEp;
		this.textTemporadaEp = textTemporadaEp;
		this.chckbxEpisodio = chckbxEpisodio;

		listSerie = new ArrayList<>();

		this.manipularComboAno(comboAno);
		this.manipularComboAvaliacao(comboAvaliacao);
	}

	private void manipularComboAno(JComboBox comboAno) {
		this.comboAno = comboAno;
		int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
		for (int anoLoop = anoAtual; anoLoop >= 2000; anoLoop--) {
			this.comboAno.addItem(anoLoop);
		}
	}

	private void manipularComboAvaliacao(JComboBox comboAvaliacao) {
		this.comboAvaliacao = comboAvaliacao;
		String[] avaliacao = new String[] 
				{ "Pessimo", "Regular", "Bom", "Muito Bom", "Excelente" };
		for (String avaliacaoLoop : avaliacao) {
			this.comboAvaliacao.addItem(avaliacaoLoop);
		}
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		System.out.println(event.getActionCommand());
		this.cadastrarEpisodios();
	}

	public void cadastrarEpisodios() {
		
		Serie serie = new Serie(
				this.textNomeEp.getText(), 
				this.textTemporadaEp.getText(), 
				Integer.parseInt(this.comboAno.getSelectedItem().toString()),
				this.chckbxEpisodio.isSelected(), 
				this.comboAvaliacao.getSelectedItem().toString());
				
		listSerie.add(serie);

		for (int i = 0; i < listSerie.size(); i++) {
			System.out.println(listSerie.get(i).toString());
		}
	}

}
