import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.event.ActionEvent;

public class Apresentacao {

	private JFrame frame;
	private JTextField tfNome;
	private JTextField tfCPF;
	private JTextField tfUF;
	private JTextField tfRenda;
	private JTextField tfConsulta;
	private JTextField tfCPFConsulta;
	// estruturas de dados para guardar os contribuintes cadastrados.
	// Normalmente se usa apenas a mais adequada ao problema. Aqui usaremos ambas para exemplificar.
	private ArrayList<Contribuinte> contribuintes = new ArrayList<>();
	private HashMap<String, Contribuinte> hashContrib = new HashMap<>();
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
		frame.setBounds(100, 100, 450, 328);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do contribuinte:");
		lblNewLabel.setBounds(10, 22, 139, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tfNome = new JTextField();
		tfNome.setBounds(158, 19, 218, 20);
		frame.getContentPane().add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setBounds(10, 57, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tfCPF = new JTextField();
		tfCPF.setBounds(158, 50, 86, 20);
		frame.getContentPane().add(tfCPF);
		tfCPF.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Estado (UF):");
		lblNewLabel_2.setBounds(10, 88, 86, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tfUF = new JTextField();
		tfUF.setBounds(158, 81, 46, 20);
		frame.getContentPane().add(tfUF);
		tfUF.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Renda anual: R$");
		lblNewLabel_3.setBounds(10, 113, 99, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tfRenda = new JTextField();
		tfRenda.setBounds(158, 110, 86, 20);
		frame.getContentPane().add(tfRenda);
		tfRenda.setColumns(10);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Contribuinte c;
				c = new Contribuinte(tfNome.getText(), 
									tfCPF.getText(),
									tfUF.getText(),
									Double.parseDouble(tfRenda.getText()));
				double imposto = c.calcularImposto();
				String msg = "Contribuinte "+c.getNome()
							 +", CPF:"+c.getCpf()
							 +" pagará R$"+imposto;
				JOptionPane.showMessageDialog(frame, msg);
				
				// guardando nas estruturas de dados
				contribuintes.add(c);
				hashContrib.put(c.getCpf(),c);
			}
		});
		btnInserir.setBounds(158, 141, 89, 23);
		frame.getContentPane().add(btnInserir);
		
		JLabel lblNewLabel_4 = new JLabel("Valor do imposto a consultar: R$");
		lblNewLabel_4.setBounds(10, 208, 194, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tfConsulta = new JTextField();
		tfConsulta.setBounds(214, 205, 86, 20);
		frame.getContentPane().add(tfConsulta);
		tfConsulta.setColumns(10);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double impostoAConsultar = Double.parseDouble(tfConsulta.getText());
				String exibicao = "Contribuintes com imposto acima de R$"
									+impostoAConsultar+"\n";
				
				for (int i=0; i < contribuintes.size(); i++) {
					Contribuinte c = contribuintes.get(i);
					if (c.calcularImposto() > impostoAConsultar) {
						exibicao += "\n"+c.getNome()+", CPF:"+c.getCpf()
									+" Renda "+c.getRendaAnual()
									+" Imposto "+c.calcularImposto();
					}
				}
				JOptionPane.showMessageDialog(frame, exibicao);
			}
		});
		btnConsultar.setBounds(311, 204, 89, 23);
		frame.getContentPane().add(btnConsultar);
		
		JLabel lblNewLabel_5 = new JLabel("CPF a consultar:");
		lblNewLabel_5.setBounds(10, 239, 139, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		tfCPFConsulta = new JTextField();
		tfCPFConsulta.setBounds(214, 236, 86, 20);
		frame.getContentPane().add(tfCPFConsulta);
		tfCPFConsulta.setColumns(10);
		
		JButton btnConsultarCPF = new JButton("ConsultarCPF");
		btnConsultarCPF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String exibicao = "CPF nao encontrado";
				//buscando no ArrayList, usando for-each
				for (Contribuinte c: contribuintes) {
					if (c.getCpf().equals(tfCPFConsulta.getText())) {
						exibicao = "ArrayList:"+c.getNome()+", CPF:"+c.getCpf()
									+" Renda "+c.getRendaAnual()
									+" Imposto "+c.calcularImposto();
					}
				}
				JOptionPane.showMessageDialog(frame, exibicao);
				
				//buscando no HashMap
				Contribuinte c = hashContrib.get(tfCPFConsulta.getText());
				if (c == null) {
					exibicao = "HashMap: CPF nao encontrado";
				}
				else {
					exibicao = "HashMap:"+c.getNome()+", CPF:"+c.getCpf()
								+" Renda "+c.getRendaAnual()
								+" Imposto "+c.calcularImposto();
				}
				JOptionPane.showMessageDialog(frame, exibicao);
			}
		});
		btnConsultarCPF.setBounds(311, 238, 89, 23);
		frame.getContentPane().add(btnConsultarCPF);
		
		JButton btnParticipacao = new JButton("Participa\u00E7\u00E3o %");
		btnParticipacao.setBounds(311, 169, 113, 23);
		frame.getContentPane().add(btnParticipacao);
	}
}
