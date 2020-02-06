package desafioAnbima;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtSalario;
	private JTextField txtDependentes;
	private JLabel lblCculoImposto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
        } catch (InstantiationException ex) {
        	System.err.println(ex);
        } catch (IllegalAccessException ex) {
        	System.err.println(ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        	System.err.println(ex);
        }
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 224, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Informe o sal\u00E1rio:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(28, 77, 118, 14);
		contentPane.add(lblNewLabel);
		
		txtSalario = new JTextField();
		txtSalario.setText("0");
		txtSalario.setBounds(28, 93, 86, 30);
		contentPane.add(txtSalario);
		txtSalario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00FAmero de Dependentes:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(28, 145, 170, 14);
		contentPane.add(lblNewLabel_1);
		
		txtDependentes = new JTextField();
		txtDependentes.setText("0");
		txtDependentes.setBounds(28, 159, 86, 35);
		contentPane.add(txtDependentes);
		txtDependentes.setColumns(10);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double salario = Double.parseDouble(txtSalario.getText());
				int dependentes = Integer.parseInt(txtDependentes.getText());
				CalculaImposto p = new CalculaImposto(salario, dependentes);
				System.out.println(p.toString());
			}
		});
		btnEnviar.setBounds(57, 217, 89, 23);
		contentPane.add(btnEnviar);
		
		lblCculoImposto = new JLabel("C\u00E1culo Imposto");
		lblCculoImposto.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCculoImposto.setHorizontalAlignment(SwingConstants.CENTER);
		lblCculoImposto.setBounds(10, 26, 188, 14);
		contentPane.add(lblCculoImposto);
	}
}
