package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Loja.Carro;
import Loja.Funcionario;

public class DaoFuncionario {
	
	// private PreparedStatement pst;

		// Atributos privados, detalhe c1além de atributo ele é objeto da classe carro
		// através dele chamo o c1 que está em cadatra carro.
		private String select_sql;
		private Funcionario c1;
		String sql;

		// Metodo de Criar a Tabela(Create)
		public void criarC1(Funcionario c1) {
			this.c1 = c1;
			Connection con = null;
			try {
				con = ConnectionManager.getConnection();
				String insert_sql = "insert into funcionario (nome, setor, cidade ) values (?, ?, ?)";
				PreparedStatement pst;
				pst = con.prepareStatement(insert_sql);
				pst.setObject(1, c1.getnome_F());
				pst.setObject(2, c1.getsetor_f());
				pst.setObject(3, c1.getcidade_f());
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
		public void deletarCl(Funcionario c1) {
			this.c1 = c1;
			Connection con = null;
			try {
				con = ConnectionManager.getConnection();

				String insert_sql = "DELETE FROM Funcionario WHERE nome = ? ";
				PreparedStatement pst;
				pst = con.prepareStatement(insert_sql);
				pst.setString(1, c1.getnome_F());
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
		public List<Funcionario> buscarFuncionarios(Funcionario c1) {
			this.c1 = c1;
			List<Funcionario> funcionario_1 = new ArrayList<Funcionario>();
			Connection con = null;

			try {
				con = ConnectionManager.getConnection();
				select_sql = "select * from Funcionario where nome = ? ";
				PreparedStatement pst;
				pst = con.prepareStatement(select_sql);
				pst.setString(1, c1.getnome_F());
				ResultSet rs = pst.executeQuery();

				while (rs.next()) {

					c1.Setnome_F(rs.getString("Nome"));
					c1.Setsetor_f(rs.getString("Setor"));
					c1.Setcidade_f(rs.getString("Cidade"));
					funcionario_1.add(c1);

					System.out.print("Placa= " + c1.getnome_F() + " ano= " + c1.getsetor_f() + " Cor= " + c1.getcidade_f());

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
			return funcionario_1;

		}

		// Metodo de atualizar (update)
		public void atualizarCl(Funcionario c1) {
			this.c1 = c1;
			Connection con = null;
			try {
				con = ConnectionManager.getConnection();
				String insert_sql = "update carro set  setor=?, cidade=? where nome = ? ";
				PreparedStatement pst;
				pst = con.prepareStatement(insert_sql);
				// pst.setObject(1, c1.getPlaca());
				// pst.setObject(2, c1.getAno());
				pst.setObject(1, c1.getsetor_f());
				pst.setObject(2, c1.getcidade_f());
				pst.setObject(3, c1.getnome_F());
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
