package PAQUETE1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Primeravista extends JFrame {

	private JPanel contentPane;
	private JTextField txtHola;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Primeravista frame = new Primeravista();
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
	public Primeravista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("mi primera vista");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBackground(new Color(0, 128, 0));
		
		JButton btnNewButton = new JButton("New button");
		
		JButton btnBoton1 = new JButton("Hola");
		btnBoton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtHola.setText("CLICK");
			}
		});
		
		
		btnBoton1.setFont(new Font("Shruti", Font.BOLD, 11));
		btnBoton1.setBackground(Color.WHITE);
		contentPane.setLayout(new GridLayout(2, 2, 0, 0));
		contentPane.add(btnNewButton_1);
		
		JLabel label = new JLabel("");
		contentPane.add(label);
		
		txtHola = new JTextField();
		txtHola.setText("Hola");
		contentPane.add(txtHola);
		txtHola.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		contentPane.add(label_1);
		contentPane.add(btnNewButton);
		contentPane.add(btnBoton1);
	}

}
