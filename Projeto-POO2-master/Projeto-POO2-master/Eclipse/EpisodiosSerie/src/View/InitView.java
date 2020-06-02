package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ExibirController;
import Controller.InitController;
import DAO.EpisodiosDAO;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;

public class InitView extends JFrame {

	
	private JPanel contentPane;
	private InitController handle;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InitView frame = new InitView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public InitView() throws SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLista = new JLabel("Lista de episodios da serie");
		lblNewLista.setFont(new Font("Segoe UI Historic", Font.PLAIN, 16));
		lblNewLista.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLista.setBounds(0, 22, 434, 22);
		contentPane.add(lblNewLista);

		JButton btnExibir = new JButton("Exibir lista");
		btnExibir.setBounds(97, 154, 114, 23);
		contentPane.add(btnExibir);
		
		JButton btnCadastro = new JButton("Cadastro");
		btnCadastro.setBounds(232, 154, 114, 22);
		contentPane.add(btnCadastro);
		
		handle = new InitController();
		
		btnExibir.addActionListener(handle);
		btnCadastro.addActionListener(handle);
	}
}
