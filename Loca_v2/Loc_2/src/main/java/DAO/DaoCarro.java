package DAO;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Loja.Carro;

public class DaoCarro {

	// private PreparedStatement pst;

	// Atributos privados, detalhe c1além de atributo ele é objeto da classe carro
	// através dele chamo o c1 que está em cadatra carro.
	private String select_sql;
	private Carro c1;
	String sql;

	// Metodo de Criar a Tabela(Create)
	public void criarC1(Carro c1) {
		this.c1 = c1;
		Connection con = null;
		try {
			con = ConnectionManager.getConnection();
			String insert_sql = "insert into carro (placa, ano, cor, marca ) values (?, ?, ?, ?)";
			PreparedStatement pst;
			pst = con.prepareStatement(insert_sql);
			pst.setObject(1, c1.getPlaca());
			pst.setObject(2, c1.getAno());
			pst.setObject(3, c1.getCor());
			pst.setObject(4, c1.getMarca());
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
	public void deletarCl(Carro c1) {
		this.c1 = c1;
		Connection con = null;
		try {
			con = ConnectionManager.getConnection();

			String insert_sql = "DELETE FROM carro WHERE placa = ? ";
			PreparedStatement pst;
			pst = con.prepareStatement(insert_sql);
			pst.setString(1, c1.getPlaca());
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
	public List<Carro> buscarCarros(Carro c1) {
		this.c1 = c1;
		List<Carro> carro_1 = new ArrayList<Carro>();
		Connection con = null;

		try {
			con = ConnectionManager.getConnection();
			select_sql = "select * from carro where Placa = ? ";
			PreparedStatement pst;
			pst = con.prepareStatement(select_sql);
			pst.setString(1, c1.getPlaca());
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {

				c1.setPlaca(rs.getString("Placa"));
				c1.setano(rs.getInt("ano"));
				c1.setCor(rs.getString("Cor"));
				c1.setmarca(rs.getString("marca"));
				carro_1.add(c1);

				System.out.print("Placa= " + c1.getPlaca() + " ano= " + c1.getAno() + " Cor= " + c1.getCor()
						+ " marca= " + c1.getMarca());

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
		return carro_1;

	}

	// Metodo de atualizar (update)
	public void atualizarCl(Carro c1) {
		this.c1 = c1;
		Connection con = null;
		try {
			con = ConnectionManager.getConnection();
			String insert_sql = "update carro set  cor=?, marca=? where placa = ? ";
			PreparedStatement pst;
			pst = con.prepareStatement(insert_sql);
			// pst.setObject(1, c1.getPlaca());
			// pst.setObject(2, c1.getAno());
			pst.setObject(1, c1.getCor());
			pst.setObject(2, c1.getMarca());
			pst.setObject(3, c1.getPlaca());
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
