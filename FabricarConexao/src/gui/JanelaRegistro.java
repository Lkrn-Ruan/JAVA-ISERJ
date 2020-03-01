package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import dao.PessoaDao;
import java.sql.PreparedStatement;
import fabricaconexao.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Pessoa;

public class JanelaRegistro extends JFrame implements ActionListener {

	private JLabel labelTitulo, labelTabela1, labelTabela2;
	private JTextField textCod, textNome, textIdade, textTelefone,
			textProfissao;
	private JLabel cod, nome, idade, telefone, profissao;
	private JButton botaoGuardar, botaoCancelar, botaoApagar, botaoAtualizar;
	JTable minhatabela1, minhaTabela2;
	JScrollPane minhabarra1, minhaBarra2;
    private Connection connection;

	/**
	 * constructor de la clase donde se inicializan todos los componentes de la
	 * ventana de registro
	 */
	public JanelaRegistro() {
		botaoGuardar = new JButton();
		botaoGuardar.setBounds(110, 200, 120, 25);
		botaoGuardar.setText("Registrar");

		botaoCancelar = new JButton();
		botaoCancelar.setBounds(250, 200, 120, 25);
		botaoCancelar.setText("Cancelar");
                
                botaoApagar = new JButton();
                botaoApagar.setBounds(110,225, 120, 25);
                botaoApagar.setText("Apagar");
                
                botaoAtualizar = new JButton();
                botaoAtualizar.setBounds(250, 225, 120, 25);
                botaoAtualizar.setText("Atualizar");
                        
		labelTitulo = new JLabel();
		labelTitulo.setText("REGISTRO DE PESSOAS");
		labelTitulo.setBounds(120, 20, 380, 30);
		labelTitulo.setFont(new java.awt.Font("Verdana", 1, 18));

		labelTabela1 = new JLabel();
		labelTabela1.setText("Tabela Usando Matrix de dados");
		labelTabela1.setBounds(40, 250, 380, 50);

		labelTabela2 = new JLabel();
		labelTabela2.setText("Tabela Usando Table Model");
		labelTabela2.setBounds(40, 430, 380, 50);

		cod = new JLabel();
		cod.setText("Codigo");
		cod.setBounds(20, 80, 80, 25);
		add(cod);

		nome = new JLabel();
		nome.setText("Nome");
		nome.setBounds(20, 120, 80, 25);
		add(nome);

		telefone = new JLabel();
		telefone.setText("telefone");
		telefone.setBounds(290, 160, 80, 25);
		add(telefone);

		idade = new JLabel();
		idade.setText("Idade");
		idade.setBounds(290, 120, 80, 25);
		add(idade);

		profissao = new JLabel();
		profissao.setText("Profissão");
		profissao.setBounds(20, 160, 80, 25);
		add(profissao);

		textCod = new JTextField();
		textCod.setBounds(80, 80, 80, 25);
		add(textCod);

		textNome = new JTextField();
		textNome.setBounds(80, 120, 190, 25);
		add(textNome);

		textTelefone = new JTextField();
		textTelefone.setBounds(340, 160, 80, 25);
		add(textTelefone);

		textIdade = new JTextField();
		textIdade.setBounds(340, 120, 80, 25);
		add(textIdade);

		textProfissao = new JTextField();
		textProfissao.setBounds(80, 160, 190, 25);
		add(textProfissao);

		botaoGuardar.addActionListener(this);
		botaoCancelar.addActionListener(this);
                botaoAtualizar.addActionListener(this);
                botaoApagar.addActionListener(this);
		// ////////////////////////////////////////////
		minhabarra1 = new JScrollPane();
		minhabarra1.setBounds(40, 300, 400, 130);
		mostrarDadosUsandoLogica();// mostramos la tabla

		minhaBarra2 = new JScrollPane();
		minhaBarra2.setBounds(40, 480, 400, 130);
		mostrarDadosComTableModel();// mostrar a tabela
                
                
                add(botaoAtualizar);
                add(botaoApagar);
		add(botaoCancelar);
		add(botaoGuardar);
		add(labelTitulo);
		add(labelTabela1);
		add(labelTabela2);
		add(minhabarra1);
		add(minhaBarra2);
		limpar();
		setSize(480, 650);
		setTitle("Exercicios de Views : Componentes JTable");
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
	}

	/**
	 * Permite o prenchimento da view sem utilizar o table model, para
	 * isto usamos logica de programação por meio da captura de informação
	 * linha a linha e assim completa uma matrix preenchendo todo a view da tabela correspondente.
	 */
	public void mostrarDadosUsandoLogica() {

		String titulos[] = { "Codigo", "Nome", "Idade", "Profissão",
				"Telefone" };
		String informacao[][] = obterMatrix();

		minhatabela1 = new JTable(informacao, titulos);
		minhatabela1.setEnabled(false);
		minhatabela1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		minhabarra1.setViewportView(minhatabela1);
	}

	/**
	 * Metodo que permite hacer el llenado de la tabla2 usando Table Model
	 */
	private void mostrarDadosComTableModel() {
		DefaultTableModel model;
		model = new DefaultTableModel();// definimos o objeto tableModel
		minhaTabela2 = new JTable();// criamos a instancia da tabela
		minhaTabela2.setModel(model);
		model.addColumn("Código");
		model.addColumn("Nome");
		model.addColumn("Idade");
		model.addColumn("Profissão");
		model.addColumn("Telefone");

		minhaTabela2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		minhaTabela2.getTableHeader().setReorderingAllowed(false);

		PessoaDao minhaPessoaDao2 = new PessoaDao();
		
		minhaPessoaDao2.buscarUsuariosConTableModel(model);
		minhaBarra2.setViewportView(minhaTabela2);

	}

	/**
	 * Metodo que permite retornar a matrix com informacões do BD
	 * 
	 * @return
	 */
	private String[][] obterMatrix() {
		PessoaDao minhaPessoaDao = new PessoaDao();
		/*
		 * chamamos o metodo que retorna a info do BD e guarda na linha
		 * 
		 */
		ArrayList<Pessoa> minhaLinha = minhaPessoaDao.buscarUsuariosConMatrix();
		/*
		 * como sabemos que son 5 campos, definimos ese valor por defecto para
		 * las columnaslas filas dependen de los registros retornados
		 */
		String informacao[][] = new String[minhaLinha.size()][5];

		for (int x = 0; x < informacao.length; x++) {
			informacao[x][0] = minhaLinha.get(x).getIdPessoa() + "";
			informacao[x][1] = minhaLinha.get(x).getNomePessoa() + "";
			informacao[x][2] = minhaLinha.get(x).getIdadePessoa() + "";
			informacao[x][3] = minhaLinha.get(x).getProfissaoPessoa() + "";
			informacao[x][4] = minhaLinha.get(x).getTelefonePessoa() + "";
		}
		return informacao;
	}

	/**
	 * Limpia el formulario de Registro
	 */
        
        public String atualizarUsuario(String idPessoa, String nomePessoa, String idadePessoa, String profissaoPessoa, String telefonePessoa) {
        this.connection = new Conexao().getConnection();
        //Connection con;
        PreparedStatement stmt = null;
        String status = "";
        try {
            stmt = connection.prepareStatement("update pessoa set telefonePessoa=?, profissaoPessoa=?, idadePessoa=?, nomePessoa=? WHERE idPessoa =?" ) ;
            
            stmt.setString(1, telefonePessoa);
            stmt.setString(2, profissaoPessoa);
            stmt.setString(3, idadePessoa);
            stmt.setString(4, nomePessoa);
            stmt.setString(5, idPessoa);
                    
            int i = stmt.executeUpdate();
            if (i != 0) {
                status = "Detalhes do cliente atualizado com sucesso";
                JOptionPane.showMessageDialog(null,status,"Atualização de Usuário",JOptionPane.INFORMATION_MESSAGE);
                
           } else {
                status = "Detalhes do cliente não atualizados";
                JOptionPane.showMessageDialog(null,status,"Atualização de Usuário",JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
        
        public String deletarUsuario(String idPessoa) {
        this.connection = new Conexao().getConnection();
        PreparedStatement stmt = null;
        String status = "";
        try {
            stmt = connection.prepareStatement("delete from pessoas where idPessoa? ");
            stmt.setString(1, idPessoa);
            int i = stmt.executeUpdate();
            if (i != 0) {status = "Usuario deletado do database";
                JOptionPane.showMessageDialog(null,status,"Deleção de Usuário",JOptionPane.INFORMATION_MESSAGE);
            }else{status = "Usuario não deletado do database";
                JOptionPane.showMessageDialog(null,status,"Deleção de Usuário",JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            
            e.printStackTrace();
        }finally {
	mostrarDadosUsandoLogica();
	mostrarDadosComTableModel();
	limpar();
	}
        return status;
    }
        
	private void limpar() {
		textCod.setText("");
		textNome.setText("");
		textIdade.setText("");
		textTelefone.setText("");
		textProfissao.setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botaoGuardar) {

			PessoaDao minhaPessoaDao = new PessoaDao();
			try {
				Pessoa minhaPessoa = new Pessoa();
				minhaPessoa.setIdPessoa(Integer.parseInt(textCod.getText()));
				minhaPessoa.setNomePessoa(textNome.getText());
				minhaPessoa.setTelefonePessoa(Integer.parseInt(textTelefone
						.getText()));
				minhaPessoa.setIdadePessoa(Integer.parseInt(textIdade.getText()));
				minhaPessoa.setProfissaoPessoa(textProfissao.getText());

				minhaPessoaDao.registrarPessoa(minhaPessoa);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null,
						"Error na entrada de dados", "Error",
						JOptionPane.ERROR_MESSAGE);
			} finally {
				/* Atualizamos sempre as tabelas depois de feito o registro */
				mostrarDadosUsandoLogica();
				mostrarDadosComTableModel();
				limpar();
			}
		}
		if (e.getSource() == botaoCancelar) {
			limpar();
		}
                if (e.getSource() == botaoApagar){
                try {
                    String idPessoa ;
                    idPessoa =  JOptionPane.showInputDialog("Entrar com ID a ser deletado");
                    deletarUsuario(idPessoa);

			} catch (Exception ex) {
                            JOptionPane.showMessageDialog(null,
				"Erro ao apagar", "Error",
				JOptionPane.ERROR_MESSAGE);
                        }
                }
                if (e.getSource() == botaoAtualizar){
                    try{
                    String  idPessoa = JOptionPane.showInputDialog("ID do pessoa a ser atualizado");
                    String  nomePessoa = JOptionPane.showInputDialog("Digite Nome da pessoa atualizado");
                    String  idadePessoa = JOptionPane.showInputDialog("Digite a idade da pessoa atualizado");
                    String  profissaoPessoa = JOptionPane.showInputDialog("Digite a profissão da pessoa atualizado");
                    String  telefonePessoa = JOptionPane.showInputDialog("Digite telefone da pessoa atualizado");
                    atualizarUsuario(idPessoa, nomePessoa, idadePessoa, profissaoPessoa, telefonePessoa);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null,
				"Erro ao apagar", "Error",
				JOptionPane.ERROR_MESSAGE);
                    }finally {
                    mostrarDadosUsandoLogica();
                    mostrarDadosComTableModel();
                    limpar();
                    }
                }
	
                
}
}
