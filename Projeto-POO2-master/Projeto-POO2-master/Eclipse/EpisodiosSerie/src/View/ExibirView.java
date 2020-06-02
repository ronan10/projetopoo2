package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ExibirController;
import Models.Serie;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Window.Type;

public class ExibirView extends JFrame {

	private JPanel contentPane;
	public JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExibirView frame = new ExibirView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ExibirView() throws SQLException {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 652, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewRefresh = new JButton("Atualizar Lista");
		btnNewRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);
		table = new JTable();
		
		
		ExibirController handle = new ExibirController(table);
		scrollPane.setViewportView(table);
		contentPane.add(btnNewRefresh);
		btnNewRefresh.addActionListener(handle);
	
	}
	
	public JTable getTable() {
		return this.table;
	}
	
	
	
	
	
}
