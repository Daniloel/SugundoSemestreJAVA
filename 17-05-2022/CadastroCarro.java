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
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class CadastroCarro extends JFrame {

	private JPanel contentPane;
	private JTextField txtPlaca;
	private JTextField txtAno;
	private JTextField txtCor;
	private JTextField txtMarca;
	ArrayList Lista;
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

		JLabel lbcadastra = new JLabel("Cadstro de Carro");
		lbcadastra.setBounds(44, 0, 105, 14);
		contentPane.add(lbcadastra);

		JButton btncadstroCarro = new JButton("CadastraCarro");
		btncadstroCarro.setBounds(288, 26, 183, 23);
		btncadstroCarro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// lista para armazenar várias Carro
				ArrayList cadastroCarro = new ArrayList<Carro>();

				//  Placa e no campo cor, ano e Marca
				if ((!txtPlaca.getText().equals("")) && (!txtAno.getText().equals("")) && (!txtCor.getText().equals(""))
						&& (!txtMarca.getText().equals(""))) {
					// um objeto pessoa é criado
					Carro c1 = new Carro(txtPlaca.getText(), Integer.parseInt(txtAno.getText()), txtCor.getText(),
							txtMarca.getText());
					// e adcionado à lista
					cadastroCarro.add(c1);

					// campos são limpos
					txtPlaca.setText("");
					txtAno.setText("");
					txtCor.setText("");
					txtMarca.setText("");

					// System.out.println("Numero do Cadastro "+cadastroCarro.size());
					for (int i = 0; i < cadastroCarro.size(); i++) {
						c1 = (Carro) cadastroCarro.get(i);
						System.out.println(
								c1.getPlaca() + "\r\n" + c1.getAno() + "\r\n" + c1.getCor() + "\r\n" + c1.getMarca());

					}

				}

			}
		});
		contentPane.add(btncadstroCarro);

		JButton btnFiltro = new JButton("Pesquisa");
		btnFiltro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				

			}
		});
		btnFiltro.setBounds(288, 93, 183, 23);
		contentPane.add(btnFiltro);

		txtpnPlaca = new JTextPane();
		txtpnPlaca.setBounds(172, 27, 89, 20);
		txtpnPlaca.setText("Placa");
		contentPane.add(txtpnPlaca);

		txtpnAno = new JTextPane();
		txtpnAno.setBounds(172, 94, 89, 20);
		txtpnAno.setText("Ano");
		contentPane.add(txtpnAno);

		txtpnCor = new JTextPane();
		txtpnCor.setBounds(172, 177, 89, 20);
		txtpnCor.setText("Cor");
		contentPane.add(txtpnCor);

		txtpnModelo = new JTextPane();
		txtpnModelo.setBounds(172, 242, 89, 20);
		txtpnModelo.setText("Modelo");
		contentPane.add(txtpnModelo);
	}
}
