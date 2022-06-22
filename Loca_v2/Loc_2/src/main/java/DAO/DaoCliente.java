package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.awt.EventQueue;
import Loja.Carro;
import Loja.Cliente;



public class DaoCliente {
    
	// private PreparedStatement pst;

		// Atributos privados, detalhe c1além de atributo ele é objeto da classe carro
		// através dele chamo o c1 que está em cadatra carro.
		private String select_sql;
		private Cliente c1;
		String sql;

		// Metodo de Criar a Tabela(Create)
		public void criarC1(Cliente c1) {
			this.c1 = c1;
			Connection con = null;
			try {
				con = ConnectionManager.getConnection();
				String insert_sql = "insert into Cliente (cpf, idade, nome, cidade ) values (?, ?, ?, ?)";
				PreparedStatement pst;
				pst = con.prepareStatement(insert_sql);
				pst.setObject(1, c1.getcpf_C());
				pst.setObject(2, c1.getidade_C());
				pst.setObject(3, c1.getnome_c());
				pst.setObject(4, c1.getcidade_c());
				pst.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException("Erro ao inserir os dados!", e);
			} finally {
				try {
					if (con != null)
						con.close();
				} catch (SQLException e) {
					e.printStackTrace();
					throw new RuntimeException("Erro ao fechar conexão", e);
				}
			}
		}

		// Metodo de Deletar a tabela(Delete)
		public void deletarCl(Cliente c1) {
			this.c1 = c1;
			Connection con = null;
			try {
				con = ConnectionManager.getConnection();

				String insert_sql = "DELETE FROM Cliente WHERE cpf = ? ";
				PreparedStatement pst;
				pst = con.prepareStatement(insert_sql);
				pst.setObject(1,c1.getcpf_C());
				// pst.setInt (2, c1.getvId_Cliente());
				pst.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException("Erro ao inserir os dados!", e);
			} finally {
				try {
					if (con != null)
						con.close();
				} catch (SQLException e) {
					e.printStackTrace();
					throw new RuntimeException("Erro ao fechar conexﾃ｣o", e);
				}
			}
		}

		// Metodo de Ler a tabela(Read)
		public List<Cliente> buscarCliente(Cliente c1) {
			this.c1 = c1;
			List<Cliente> cliente_1 = new ArrayList<Cliente>();
			Connection con = null;

			try {
				con = ConnectionManager.getConnection();
				select_sql = "select * from cliente where cpf = ? ";
				PreparedStatement pst;
				pst = con.prepareStatement(select_sql);
				pst.setObject(1,c1.getcpf_C());
				ResultSet rs = pst.executeQuery();

				while (rs.next()) {

					c1.setcpf_C(rs.getInt("CPF"));
					c1.setidade_C(rs.getFloat("Idade"));
					c1.setnome_c(rs.getString("Nome"));
					c1.setcidade_c(rs.getString("Cidade"));
					cliente_1.add(c1);

					System.out.print("Placa= " + c1.getcpf_C() + " ano= " + c1.getidade_C() + " Cor= " + c1.getnome_c()
							+ " marca= " + c1.getcidade_c());

				}
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException("Erro ao buscar tarefas!", e);
			} finally {
				try {
					if (con != null)
						con.close();
				} catch (SQLException e) {
					e.printStackTrace();
					throw new RuntimeException("Erro ao fechar conexﾃ｣o", e);
				}
			}
			return cliente_1;

		}

		// Metodo de atualizar (update)
		public void atualizarCl(Cliente c1) {
			this.c1 = c1;
			Connection con = null;
			try {
				con = ConnectionManager.getConnection();
				String insert_sql = "update cliente set  idade=?, nome=?, cidade=? where cpf = ? ";
				PreparedStatement pst;
				pst = con.prepareStatement(insert_sql);
				 pst.setObject(1, c1.getidade_C());
				pst.setObject(2, c1.getnome_c());
				pst.setObject(3, c1.getcidade_c());
				pst.setObject(4, c1.getcpf_C());
				int rowsUpdated = pst.executeUpdate();
				if (rowsUpdated > 0) {
					System.out.println("Atualizou passou");
				}

			} catch (SQLException e) {
				throw new RuntimeException("Erro ao inserir os dados!", e);
			} finally {
				try {
					if (con != null)
						con.close();
				} catch (SQLException e) {
					e.printStackTrace();
					throw new RuntimeException("Erro ao fechar conexão", e);
				}
			}

		}

	
	
	
	
	
	
	
    }

