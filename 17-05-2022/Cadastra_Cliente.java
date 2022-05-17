package Loja;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastra_Cliente extends JFrame {

	private JPanel contentPane;
	private JTextField textNomeCliente;
	private JTextField textCidade;
	private JTextField textCPF;
	private JTextField textIdade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastra_Cliente frame = new Cadastra_Cliente();
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
	public Cadastra_Cliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNomeCliente = new JTextField();
		textNomeCliente.setBounds(10, 43, 86, 20);
		contentPane.add(textNomeCliente);
		textNomeCliente.setColumns(10);
		
		JLabel lblCadastraCliente = new JLabel("Cadastra de Cliente");
		lblCadastraCliente.setBounds(10, 11, 139, 20);
		contentPane.add(lblCadastraCliente);
		
		textCidade = new JTextField();
		textCidade.setBounds(10, 96, 86, 20);
		contentPane.add(textCidade);
		textCidade.setColumns(10);
		
		textCPF = new JTextField();
		textCPF.setBounds(10, 149, 86, 20);
		contentPane.add(textCPF);
		textCPF.setColumns(10);
		
		textIdade = new JTextField();
		textIdade.setBounds(10, 198, 86, 20);
		contentPane.add(textIdade);
		textIdade.setColumns(10);
		
		JButton btncadastraCliente = new JButton("CadastraCliente");
		btncadastraCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente cliente = new Cliente(textNomeCliente.getText(),textCidade.getText(),Integer.parseInt(textCPF.getText()), Float.valueOf(textIdade.getText()).floatValue());
				
				System.out.println(cliente.nome_Cliente);
				System.out.println(cliente.cidade_Cliente);
				System.out.println(cliente.cpf_Cliente);
				System.out.println(cliente.idade_Cliente);
			}
		});
		btncadastraCliente.setBounds(163, 42, 158, 23);
		contentPane.add(btncadastraCliente);
		
		JButton btnPesquisaCliente = new JButton("Pesquisa");
		btnPesquisaCliente.setBounds(163, 95, 158, 23);
		contentPane.add(btnPesquisaCliente);
	}
}
