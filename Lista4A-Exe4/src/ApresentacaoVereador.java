
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSeparator;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

/**
 *
 * @author
 */
public class ApresentacaoVereador extends javax.swing.JFrame {

	private Camara camara = new Camara();
	private DateTimeFormatter df = DateTimeFormatter.ofPattern("d/M/y");

	/**
	 * 
	 */
	public ApresentacaoVereador() {
		initComponents();
	}

	@SuppressWarnings("unchecked")

	private void initComponents() {

		jLabel7 = new javax.swing.JLabel();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jTextField4 = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		jButton3 = new javax.swing.JButton();

		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vereador v = camara.getVereadorMenorDesempenho();
				String str;
				if (v == null) {
					str = "Não há vereadores cadastrados";
				} else {
					str = "Menor desempenho\n\n" + v.getNome() + " do partido " + v.getPartido().getNome() + " = "
							+ v.getDesempenho();
				}
				JOptionPane.showMessageDialog(jTabbedPane1, str);
			}
		});
		jButton4 = new javax.swing.JButton();
		jButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vereador v = camara.getVereadorMaisProjAprov();
				String str;
				if (v == null) {
					str = "Não há vereadores cadastrados";
				} else {
					str = "Mais projetos cadastrados\n\n" + v.getNome() + " do partido " + v.getPartido().getNome()
							+ " = " + v.getDesempenho();
				}
				JOptionPane.showMessageDialog(jTabbedPane1, str);
			}
		});
		jLabel9 = new javax.swing.JLabel();
		jTextField7 = new javax.swing.JTextField();
		jButton5 = new javax.swing.JButton();
		jButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Partido p = camara.getPartido(Integer.parseInt(jTextField7.getText()));
					String str;
					if (p == null) {
						str = "Não há partido com este número";
					} else {
						str = "Partido " + p.getNome() + "\n\nTotal de projetos aprovados = "
								+ p.getTotalProjetosAprovados() + "\nTotal de projetos apresentados = "
								+ p.getTotalProjetosApresentados() + "\nMÃ©dia de desempenho do partido = "
								+ p.getMediaDesempenho();
					}
					JOptionPane.showMessageDialog(jTabbedPane1, str);
				} catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(jTabbedPane1, "Digite um nï¿½mero de partido vï¿½lido");
				}
			}
		});
		jSeparator1 = new javax.swing.JSeparator();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();

		jLabel7.setText("jLabel7");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Lista 3 - Exercício 5");

		jLabel1.setText("Número:");

		jLabel2.setText("Nome:");

		jButton1.setText("Cadastrar");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jButton1)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel1)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel2)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 177,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addContainerGap(153, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2).addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(28, 28, 28).addComponent(jButton1).addContainerGap(139, Short.MAX_VALUE)));

		jTabbedPane1.addTab("Partido", jPanel1);

		jLabel3.setText("Nome: ");

		jLabel4.setText("Número do partido:");

		jButton2.setText("Cadastrar");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addComponent(jLabel3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addComponent(jLabel4)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 170, Short.MAX_VALUE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(132)
							.addComponent(jButton2)
							.addGap(79)
							.addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(101)))
					.addContainerGap(63, Short.MAX_VALUE))
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addGap(19)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel3)
						.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jLabel4)
						.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(52)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
							.addGap(96))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(32)
							.addComponent(jButton2)
							.addGap(114)))
					.addGap(93))
		);
		jPanel2.setLayout(jPanel2Layout);

		jTabbedPane1.addTab("Vereador", jPanel2);

		jButton3.setText("Vereador menor desempenho");

		jButton4.setText("Vereador com mais proj. aprovados");

		jLabel9.setText("Número do partido:");

		jButton5.setText("Estatísticas do partido");

		jButton6.setText("Total de projetos da Câmara");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton7.setText("Vereadores acima da média");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		btnConsultarProj = new JButton("Projetos de lei");
		btnConsultarProj.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnConsultarProj(evt);
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout
				.createSequentialGroup()
				.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap()
								.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
										.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(jPanel3Layout.createSequentialGroup().addComponent(jLabel9)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, 52,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18).addComponent(jButton5))))
						.addComponent(jButton3).addComponent(jButton4).addComponent(jButton6)
						.addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnConsultarProj, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jButton7, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel9)
								.addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton5))
						.addGap(13)
						.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(jButton3).addGap(18)
						.addComponent(jButton4).addGap(18).addComponent(jButton6).addGap(18).addComponent(jButton7)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnConsultarProj)
						.addContainerGap(16, Short.MAX_VALUE)));
		jPanel3.setLayout(jPanel3Layout);

		jTabbedPane1.addTab("Consultas", jPanel3);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout
						.createSequentialGroup().addContainerGap().addComponent(jTabbedPane1,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 424, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		JPanel jPanel4 = new JPanel();
		jTabbedPane1.addTab("Projetos de Lei", null, jPanel4, null);
		jPanel4.setLayout(null);

		JLabel lblNomeProjeto = new JLabel("Nome do Projeto:");
		lblNomeProjeto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNomeProjeto.setBounds(10, 109, 129, 13);
		jPanel4.add(lblNomeProjeto);

		txtNomeProjeto = new JTextField();
		txtNomeProjeto.setBounds(111, 101, 231, 30);
		jPanel4.add(txtNomeProjeto);
		txtNomeProjeto.setColumns(10);

		JLabel lblDataApres = new JLabel("Data de apresentação:");
		lblDataApres.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDataApres.setBounds(10, 150, 141, 13);
		jPanel4.add(lblDataApres);

		txtDataApres = new JTextField();
		txtDataApres.setBounds(140, 142, 202, 30);
		jPanel4.add(txtDataApres);
		txtDataApres.setColumns(10);

		JLabel lblDataAprov = new JLabel("Data de aprovação:");
		lblDataAprov.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDataAprov.setBounds(10, 191, 129, 13);
		jPanel4.add(lblDataAprov);

		txtDataAprov = new JTextField();
		txtDataAprov.setBounds(122, 183, 220, 30);
		jPanel4.add(txtDataAprov);
		txtDataAprov.setColumns(10);

		JLabel lblNumProj = new JLabel("Número do projeto:");
		lblNumProj.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNumProj.setBounds(10, 241, 112, 13);
		jPanel4.add(lblNumProj);

		txtNumProj = new JTextField();
		txtNumProj.setBounds(122, 233, 210, 30);
		jPanel4.add(txtNumProj);
		txtNumProj.setColumns(10);

		JButton btnCadastrarProj = new JButton("Cadastrar Projeto");
		btnCadastrarProj.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnCadastrarProjeto(evt);
			}
		});
		btnCadastrarProj.setBounds(91, 364, 162, 21);
		jPanel4.add(btnCadastrarProj);

		JLabel lblNewLabel = new JLabel("Nome do Vereador:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 59, 129, 13);
		jPanel4.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Número do Partido:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 11, 112, 13);
		jPanel4.add(lblNewLabel_1);

		txtVereadorProjeto = new JTextField();
		txtVereadorProjeto.setBounds(122, 51, 220, 30);
		jPanel4.add(txtVereadorProjeto);
		txtVereadorProjeto.setColumns(10);

		txtPartidoProjeto = new JTextField();
		txtPartidoProjeto.setBounds(123, 3, 219, 30);
		jPanel4.add(txtPartidoProjeto);
		txtPartidoProjeto.setColumns(10);

		JLabel lblLeiOrganica = new JLabel("Lei Orgânica");
		lblLeiOrganica.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLeiOrganica.setBounds(10, 310, 112, 13);
		jPanel4.add(lblLeiOrganica);

		txtALO = new JTextField();
		txtALO.setBounds(91, 304, 141, 27);
		jPanel4.add(txtALO);
		txtALO.setColumns(10);

		JLabel lblQtdVotosFavoraveis = new JLabel("Qtd votos favoráveis");
		lblQtdVotosFavoraveis.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblQtdVotosFavoraveis.setBounds(10, 340, 112, 13);
		jPanel4.add(lblQtdVotosFavoraveis);

		txtQtdVF = new JTextField();
		txtQtdVF.setColumns(10);
		txtQtdVF.setBounds(140, 334, 141, 27);
		jPanel4.add(txtQtdVF);

		JLabel lblCasoForProjeto = new JLabel("Caso for projeto complementar");
		lblCasoForProjeto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCasoForProjeto.setBounds(10, 286, 242, 13);
		jPanel4.add(lblCasoForProjeto);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 273, 355, 2);
		jPanel4.add(separator);
		getContentPane().setLayout(layout);

		pack();
	}

	public void btnCadastrarProjeto(java.awt.event.ActionEvent evt) {
		String str = "Erro";
		try {
			Partido partidos = camara.getPartido(Integer.parseInt(txtPartidoProjeto.getText()));
			ArrayList<Vereador> vereadores = partidos.getVereadores();
			if (partidos.getNumero() == (Integer.parseInt(txtPartidoProjeto.getText()))
					&& camara.getPartido(Integer.parseInt(txtPartidoProjeto.getText())) != null) {
				for (Vereador vereador : vereadores) {
					if (vereador.getNome().equals(txtVereadorProjeto.getText())) {
						ProjetoDeLei projetos = new ProjetoDeLei();
						projetos.setNumeroProjeto(Integer.parseInt(txtNumProj.getText()));
						projetos.setTitulo(txtNomeProjeto.getText());
						projetos.setDataApresentacao(LocalDate.parse(txtDataApres.getText(), df));
						try {
							projetos.setDataAprovado(LocalDate.parse(txtDataAprov.getText(), df));
						} catch (DateTimeParseException dte) {
							JOptionPane.showMessageDialog(jTabbedPane1,
									"Projeto será cadastrado sem data de aprovação");
						}
						vereador.addProjetos(projetos);
						str = "Projeto Cadastrado";

					} else {
						str = "Não existe nome declarado. Escolha outro nome";
					}
				}
			} else {
				str = "Não existe partido declarado. Escolha outro número";
			}
		} catch (IllegalArgumentException iae) {
			str = iae.getMessage();
		}
		JOptionPane.showMessageDialog(jTabbedPane1, str);
	};

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		String str;
		try {
			if (camara.getPartido(Integer.parseInt(jTextField1.getText())) == null) {
				Partido partido = new Partido();
				partido.setNome(jTextField2.getText());
				partido.setNumero(Integer.parseInt(jTextField1.getText()));
				camara.addPartido(partido);
				str = "Partido cadastrado";
			} else {
				str = "Já há partido com este número. Escolha outro número";
			}
		} catch (IllegalArgumentException iae) {
			str = iae.getMessage();
		}
		JOptionPane.showMessageDialog(this, str);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		Partido p = camara.getPartido(Integer.parseInt(jTextField4.getText()));
		if (p == null) {
			jLabel8.setText("Número do partido não localizado");
		} else {
			try {
				jLabel8.setText(p.getNome());
				Vereador ver = new Vereador(jTextField3.getText());
				camara.addVereador(ver, p);
				JOptionPane.showMessageDialog(this, "Vereador cadastrado com desempenho " + ver.getDesempenho());
			} catch (IllegalArgumentException iae) {
				JOptionPane.showMessageDialog(this, iae.getMessage());
			}
		}
	}

	private void btnConsultarProj(java.awt.event.ActionEvent evt) {
		String str = "";
		Partido p = camara.getPartido(Integer.parseInt(jTextField7.getText()));
		ArrayList<Vereador> v = p.getVereadores();
		ProjetoDeLeiComplementar pLO;
		if (p == null) {
			str = "Número do partido não localizado";
		} else {
			for (Vereador vereador : v) {
				for (ProjetoDeLei proj : vereador.getProjetos()) {
					if (vereador.getProjetos() != null) {
						str = "\nVereador: " + vereador.getNome() + "\nPartido: " + p.getNumero()
								+ "Número do projeto: " + proj.getNumeroProjeto() + "\nTítulo:" + proj.getTitulo()
								+ "\nData de apresentação:" + proj.getDataApresentacao() + "\nData de aprovação:"
								+ proj.getDataAprovado();
					}
				}
			}
		}
		JOptionPane.showMessageDialog(this, str);
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		int aprov = camara.getTotalProjAprov();
		int apres = camara.getTotalProjApres();
		String str = "Total de projetos aprovados = " + aprov + "\nTotal de projetos apresentados = " + apres;
		JOptionPane.showMessageDialog(this, str);
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		List<Vereador> acima = camara.getVereadoresAcimaMedia();
		String str = "Vereadores acima da média (" + camara.getDesempenhoMedioCamara() + ")\n";
		for (Vereador v : acima) {
			str += "\n" + v.getNome() + " do partido " + v.getPartido().getNome() + " = " + v.getDesempenho();
		}
		JOptionPane.showMessageDialog(this, str);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(ApresentacaoVereador.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ApresentacaoVereador.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ApresentacaoVereador.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ApresentacaoVereador.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ApresentacaoVereador().setVisible(true);
			}
		});
	}

	// Variables declaration
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField7;
	private JTextField txtNomeProjeto;
	private JTextField txtDataApres;
	private JTextField txtDataAprov;
	private JTextField txtNumProj;
	private JTextField txtVereadorProjeto;
	private JTextField txtPartidoProjeto;
	private JTextField txtALO;
	private JTextField txtQtdVF;
	private JButton btnConsultarProj;
}