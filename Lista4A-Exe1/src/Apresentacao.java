
import java.awt.Checkbox;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;

public class Apresentacao {

	private JFrame frame;
	private JTextField tfNumero;
	private JTextField tfNome;
	private JTextField tfEndereco;
	private JTextField tfDataInstalacao;
	private JTextField tfCategoria;
	private JTextField tfRamoAtiv;
	private JTextField tfQtdOcor;
	private JTextField tfNumeroConsulta;
	private Telefone telefone;
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private boolean box;
	private HashMap<String, Telefone> redeTelefonica = new HashMap<>();
	private JComboBox<String> comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apresentacao window = new Apresentacao();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Apresentacao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 425, 552);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 11, 62, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NÃºmero:");
		lblNewLabel_1.setBounds(10, 46, 62, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("EndereÃ§o:");
		lblNewLabel_2.setBounds(10, 81, 102, 28);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Data de InstalaÃ§Ã£o:");
		lblNewLabel_3.setBounds(10, 113, 162, 28);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Categoria:");
		lblNewLabel_4.setBounds(10, 152, 79, 28);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("Ramo de Atividade:");
		lblNewLabel_6.setBounds(10, 231, 112, 28);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Quantidade de OcorrÃªncias:");
		lblNewLabel_7.setBounds(10, 270, 145, 28);
		frame.getContentPane().add(lblNewLabel_7);
		
		tfNumero = new JTextField();
		tfNumero.setBounds(58, 46, 136, 20);
		frame.getContentPane().add(tfNumero);
		tfNumero.setColumns(10);
		
		tfNome = new JTextField();
		tfNome.setColumns(10);
		tfNome.setBounds(58, 11, 270, 20);
		frame.getContentPane().add(tfNome);
		
		tfEndereco = new JTextField();
		tfEndereco.setColumns(10);
		tfEndereco.setBounds(68, 85, 270, 20);
		frame.getContentPane().add(tfEndereco);
		
		tfDataInstalacao = new JTextField();
		tfDataInstalacao.setColumns(10);
		tfDataInstalacao.setBounds(114, 117, 102, 20);
		frame.getContentPane().add(tfDataInstalacao);
		
		tfCategoria = new JTextField();
		tfCategoria.setColumns(10);
		tfCategoria.setBounds(68, 156, 102, 20);
		frame.getContentPane().add(tfCategoria);
		
		tfRamoAtiv = new JTextField();
		tfRamoAtiv.setColumns(10);
		tfRamoAtiv.setBounds(114, 235, 270, 20);
		frame.getContentPane().add(tfRamoAtiv);
		
		tfQtdOcor = new JTextField();
		tfQtdOcor.setColumns(10);
		tfQtdOcor.setBounds(148, 274, 102, 20);
		frame.getContentPane().add(tfQtdOcor);
		
		JCheckBox checkInternet = new JCheckBox("ConexÃ£o com Internet?");
		checkInternet.setHorizontalAlignment(SwingConstants.LEFT);
		checkInternet.setBounds(10, 198, 184, 26);
		frame.getContentPane().add(checkInternet);
		
		JButton btnCadastro = new JButton("Cadastrar");
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tipo = (String) comboBox.getSelectedItem();
				if (tipo.equals("Residencial")) {
					telefone = new TelefoneResidencial();
					((TelefoneResidencial)telefone).setConexaoInternet(checkInternet.isSelected());

				}
				else if(tipo.equals("Comercial")) {
					telefone = new TelefoneComercial();
					((TelefoneComercial)telefone).setRamoAtividade(tfRamoAtiv.getText());
				}
				else {
					telefone = new TelefoneEspecializado();
					int qtd = Integer.parseInt(tfQtdOcor.getText());
					((TelefoneEspecializado)telefone).setQtdOcorrencias(qtd);
				}

				telefone.setNome(tfNome.getText());
				telefone.setNumero(tfNumero.getText());
				telefone.setEndereco(tfEndereco.getText());
				telefone.setDataInstalacao(LocalDate.parse(tfDataInstalacao.getText(),formatter));
				
				redeTelefonica.put(telefone.getNumero(), telefone);
			}
		});
		btnCadastro.setBounds(10, 326, 102, 28);
		frame.getContentPane().add(btnCadastro);
		
		JLabel lblNewLabel_8 = new JLabel("Consultar telefone:");
		lblNewLabel_8.setBounds(10, 376, 112, 20);
		frame.getContentPane().add(lblNewLabel_8);
		
		tfNumeroConsulta = new JTextField();
		tfNumeroConsulta.setColumns(10);
		tfNumeroConsulta.setBounds(105, 376, 102, 20);
		frame.getContentPane().add(tfNumeroConsulta);
		
		JButton btnConsultaTelefone = new JButton("Consultar");
		btnConsultaTelefone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Telefone t = redeTelefonica.get(tfNumeroConsulta.getText());
				String str;
				if (t == null) {
					str = "Número não Localizado";
				}
				else {
					str = "Telefone: "+t.getNumero()
							+"\nCliente:"+ t.getNome()
							+"\nEndereço:"+t.getEndereco()
							+"\nData Instalação:"+t.getDataInstalacao()
							+"\n"+t.getInfoPropria()   // polimorfismo
							+"\nValor básico: R$"+t.calculaValores(); // polimorfismo
				}
				JOptionPane.showMessageDialog(frame,str);
			}
		});
		btnConsultaTelefone.setBounds(239, 375, 89, 23);
		frame.getContentPane().add(btnConsultaTelefone);
		
		JButton btnFaturamento = new JButton("Projetar Faturamento");
		btnFaturamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double total = 0;
				for (Telefone t: redeTelefonica.values()) {
					total += t.calculaValores(); // polimorfismo
				}
			}
		});
		btnFaturamento.setBounds(105, 445, 145, 37);
		frame.getContentPane().add(btnFaturamento);
		
		comboBox = new JComboBox<>();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Comercial", "Especializado", "Residencial"}));
		comboBox.setBounds(239, 171, 145, 22);
		frame.getContentPane().add(comboBox);
		
		
	}
}
