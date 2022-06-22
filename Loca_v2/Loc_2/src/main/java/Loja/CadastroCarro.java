package Loja;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import DAO.DaoCarro;
import Loja.Carro;


import lixao.Cadastra_Carro_2;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.SystemColor;

public class CadastroCarro extends JFrame {

	// Atributos da Classe CadastraCarro gerados automaticamente pelo window bild
	private JPanel contentPane;
	private JTextField txtPlaca;
	private JTextField txtAno;
	private JTextField txtCor;
	private JTextField txtMarca;
	private JTextPane txtpnPlaca;
	private JTextPane txtpnAno;
	private JTextPane txtpnCor;
	private JTextPane txtpnModelo;

	/**
	 * q Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroCarro frame = new CadastroCarro();
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
	public CadastroCarro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtPlaca = new JTextField();
		txtPlaca.setBounds(46, 27, 86, 20);
		contentPane.add(txtPlaca);
		txtPlaca.setColumns(10);

		txtAno = new JTextField();
		txtAno.setBounds(46, 94, 86, 20);
		contentPane.add(txtAno);
		txtAno.setColumns(10);

		txtCor = new JTextField();
		txtCor.setBounds(46, 177, 86, 20);
		contentPane.add(txtCor);
		txtCor.setColumns(10);

		txtMarca = new JTextField();
		txtMarca.setBounds(46, 242, 86, 20);
		contentPane.add(txtMarca);
		txtMarca.setColumns(10);

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Carro c1 = new Carro();

				c1.setPlaca(txtPlaca.getText());

				DaoCarro daoExibirCarro = new DaoCarro();
				daoExibirCarro.buscarCarros(c1);

				// CRIAR OS GET PARA MANDAR PRO BANCO OS CAMPOS
				c1.setPlaca(txtPlaca.getText());
				c1.setano(Integer.parseInt(txtAno.getText()));
				c1.setCor(txtCor.getText());
				c1.setmarca(txtMarca.getText());

				DaoCarro daoAlteraCarro = new DaoCarro();
				daoAlteraCarro.atualizarCl(c1);
				;

				// Reset de todas as variaveis na tela ou seja zera os dados da minha tela
				txtPlaca.setText("");
				txtAno.setText("");
				txtCor.setText("");
				txtMarca.setText("");

				JOptionPane.showMessageDialog(null, "Alterado com Sucesso");

			}
		});
		btnAlterar.setForeground(Color.MAGENTA);
		btnAlterar.setBounds(288, 176, 183, 23);
		contentPane.add(btnAlterar);

		JButton btnDdelete = new JButton("Delete");
		btnDdelete.setBackground(Color.WHITE);
		btnDdelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Delete dados do banco
				// Declaro objeto c1 para levar a os dados do cliente para Do.Carro através do c1.
				Carro c1 = new Carro();

				// Set a variavel que vai ser condição para eu chamar a tabela sem isso não
				// consigo fazer o visualizar e alterar
				c1.setPlaca(txtPlaca.getText());

				DaoCarro daoExibirCarro = new DaoCarro();
				daoExibirCarro.buscarCarros(c1);

				//Recebe as infrmaçoes do banco. A Dao.Carro que mandaparaeste objeto.
				DaoCarro daoDeleteCarro = new DaoCarro();
				daoDeleteCarro.deletarCl(c1);

				// Reset de todas as variaveis na tela ou seja zera os dados da minha tela
				txtPlaca.setText("");
				txtAno.setText("");
				txtCor.setText("");
				txtMarca.setText("");

				JOptionPane.showMessageDialog(null, "Deletado com Sucesso");

			}
		});

		btnDdelete.setForeground(Color.RED);
		btnDdelete.setBounds(288, 241, 183, 23);
		contentPane.add(btnDdelete);

		JLabel lbcadastra = new JLabel("Cadastro de Carro");
		lbcadastra.setBounds(44, 0, 105, 14);
		contentPane.add(lbcadastra);

		JButton btncadstroCarro = new JButton("CadastraCarro");
		btncadstroCarro.setForeground(Color.BLUE);
		btncadstroCarro.setBounds(288, 26, 183, 23);
		btncadstroCarro.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				final Carro c1 = new Carro();

				// lista para armazenar várias Carro
				ArrayList cadastroCarro = new ArrayList<Carro>();

				// Placa e no campo cor, ano e Marca
				if ((!txtPlaca.getText().equals("")) && (!txtAno.getText().equals("")) && (!txtCor.getText().equals(""))
						&& (!txtMarca.getText().equals(""))) {

					// Seta as informações para o daoCarro que será salva no banco
					c1.setPlaca(txtPlaca.getText());
					c1.setano(Integer.parseInt(txtAno.getText()));
					c1.setCor(txtCor.getText());
					c1.setmarca(txtMarca.getText());

					EventQueue.invokeLater(new Runnable() {
						public void run() {

							try {
								// Aqui estou inputando os dados do carro que vai para o banco

								DaoCarro daoCriaCarro = new DaoCarro();
								daoCriaCarro.criarC1(c1);

								txtPlaca.setText("");
								txtAno.setText("");
								txtCor.setText("");
								txtMarca.setText("");

								JOptionPane.showMessageDialog(null, "Cadastrado com sucesso com Sucesso");
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
					
				} else {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos");
				}

			}
		});
		contentPane.add(btncadstroCarro);// botão de cadastro

		

		JButton btnFiltro = new JButton("Pesquisa");
		btnFiltro.setForeground(Color.BLUE);
		btnFiltro.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				Carro c1 = new Carro();

				c1.setPlaca(txtPlaca.getText());

				DaoCarro daoExibirCarro = new DaoCarro();
				daoExibirCarro.buscarCarros(c1);

				txtPlaca.setText(c1.getPlaca());
				txtAno.setText(String.valueOf(c1.getAno()));
				txtCor.setText(c1.getCor());
				txtMarca.setText(c1.getMarca());

			}

		});
// <-----------------FINAL DE CONSULTA CLIENTE NO BANCO------------------------------>

		btnFiltro.setBounds(288, 93, 183, 23);
		contentPane.add(btnFiltro);

		txtpnPlaca = new JTextPane();
		txtpnPlaca.setBounds(172, 27, 41, 20);
		txtpnPlaca.setText("Placa");
		contentPane.add(txtpnPlaca);

		txtpnAno = new JTextPane();
		txtpnAno.setBounds(172, 94, 41, 20);
		txtpnAno.setText("Ano");
		contentPane.add(txtpnAno);

		txtpnCor = new JTextPane();
		txtpnCor.setBounds(172, 177, 41, 20);
		txtpnCor.setText("Cor");
		contentPane.add(txtpnCor);

		txtpnModelo = new JTextPane();
		txtpnModelo.setBounds(172, 242, 53, 20);
		txtpnModelo.setText("Modelo");
		contentPane.add(txtpnModelo);

	}
}
