package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import modelo.Pessoa;

import fabricaconexao.Conexao;

/**
 * Classe que permite a manipulação dos dados no DB
 * 
 * @author Ruan Silva da Costa
 * 
 */
public class PessoaDao {

	/**
	 * Uso o objeto para instaciar uma pessoa
	 * @param minhaPessoa
	 */
	public void registrarPessoa(Pessoa minhaPessoa) {
		Conexao conexao = new Conexao();

		try {
			Statement stm = conexao.getConnection().createStatement();
			stm.executeUpdate("INSERT INTO pessoas(idPessoa,nomePessoa,idadePessoa,profissaoPessoa,telefonePessoa) VALUES ('"
					+ minhaPessoa.getIdPessoa() + "', '"
					+ minhaPessoa.getNomePessoa() + "', '"
					+ minhaPessoa.getIdadePessoa() + "', '"
					+ minhaPessoa.getProfissaoPessoa() + "', '"
					+ minhaPessoa.getTelefonePessoa() + "')");
			JOptionPane.showMessageDialog(null,
					"Feito Registro na Base de Dados", "Informativo",
					JOptionPane.INFORMATION_MESSAGE);
			stm.close();
			conexao.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null,
					"Registro não realizado, verifique s console para verificar o error informado",
					"Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * Usa o objeto modelo para guardar diretamente a informação obtida
	 * do BD, e  mostra na view da tabela
	 * 
	 * 
	 */
        
        
	public void buscarUsuariosConTableModel(DefaultTableModel model) {

		Conexao conexao = new Conexao();
		try {
			Statement stm = conexao.getConnection().createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM pessoas ");

			while (rs.next()) {
				// obter os objetos e guardar nas linhas
				Object[] linha = new Object[5];
				// para preencher cada coluna com os dados armazenados
				for (int i = 0; i < 5; i++)
					linha[i] = rs.getObject(i + 1);
				// para carregar os dados em linhas da view da tabela
				model.addRow(linha);

			}
			rs.close();
			stm.close();
			conexao.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "Error ao consultar", "Error",
					JOptionPane.ERROR_MESSAGE);

		}
	}

	/**
	 *  Retorna uma linha com os dados do BD, para depois
         * buscar as outras linhas e armazenar na tabela por meio da Matriz
	 */
	 public ArrayList<Pessoa> buscarUsuariosConMatrix() {

		Conexao conexao = new Conexao();
		ArrayList<Pessoa> minhaLinha = new ArrayList<Pessoa>();
		Pessoa pessoa;
		try {
			Statement stm = conexao.getConnection().createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM pessoas ");

			while (rs.next()) {
				pessoa = new Pessoa();
				pessoa.setIdPessoa(Integer.parseInt(rs.getString("idPessoa")));
				pessoa.setNomePessoa(rs.getString("nomePessoa"));
				pessoa.setIdadePessoa(Integer.parseInt(rs.getString("idadePessoa")));
				pessoa.setProfissaoPessoa(rs.getString("profissaoPessoa"));
				pessoa.setTelefonePessoa(Integer.parseInt(rs.getString("telefonePessoa")));
				minhaLinha.add(pessoa);
			}
			rs.close();
			stm.close();
			conexao.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "Error ao consultar a base de dados", "Error",
					JOptionPane.ERROR_MESSAGE);

		}
		return minhaLinha;
	} 
}
