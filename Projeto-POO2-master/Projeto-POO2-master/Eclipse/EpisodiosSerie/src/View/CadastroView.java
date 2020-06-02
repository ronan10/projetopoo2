package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.CadastroController;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroView extends JFrame {

	private JPanel contentPane;
	private JTextField textNomeEp;
	private JTextField textTemporadaEp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroView frame = new CadastroView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroView() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewCadastro = new JLabel("Cadastro de Episodios");
		lblNewCadastro.setFont(new Font("Segoe UI Historic", Font.PLAIN, 16));
		lblNewCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewCadastro.setBounds(10, 26, 414, 22);
		contentPane.add(lblNewCadastro);

		JLabel lblNewNome = new JLabel("Nome");
		lblNewNome.setBounds(10, 83, 46, 14);
		contentPane.add(lblNewNome);

		JLabel lblNewTemporada = new JLabel("Temporada");
		lblNewTemporada.setBounds(10, 127, 66, 14);
		contentPane.add(lblNewTemporada);

		JLabel lblNewAno = new JLabel("Ano");
		lblNewAno.setBounds(10, 169, 29, 14);
		contentPane.add(lblNewAno);

		JLabel lblNewNota = new JLabel("Nota");
		lblNewNota.setBounds(10, 207, 46, 14);
		contentPane.add(lblNewNota);

		JCheckBox chckbxEpisodio = new JCheckBox("Episodio Assistido");
		chckbxEpisodio.setBounds(261, 123, 146, 23);
		contentPane.add(chckbxEpisodio);

		JComboBox comboAvaliacao = new JComboBox();
		comboAvaliacao.setBounds(73, 204, 131, 20);
		contentPane.add(comboAvaliacao);

		JComboBox comboAno = new JComboBox();
		comboAno.setBounds(73, 166, 131, 20);
		contentPane.add(comboAno);

		textNomeEp = new JTextField();
		textNomeEp.setBounds(73, 80, 258, 20);
		contentPane.add(textNomeEp);
		textNomeEp.setColumns(10);
		textTemporadaEp = new JTextField();
		textTemporadaEp.setBounds(73, 124, 131, 20);
		contentPane.add(textTemporadaEp);
		textTemporadaEp.setColumns(10);

		JButton btnNewEnviar = new JButton("Enviar");
		btnNewEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
			}
		});

		btnNewEnviar.setBounds(271, 203, 89, 23);
		contentPane.add(btnNewEnviar);

		CadastroController handle = new CadastroController(
				textNomeEp, 
				textTemporadaEp, 
				comboAno, 
				chckbxEpisodio,
				comboAvaliacao);

		btnNewEnviar.addActionListener(handle);
	}
}
