package admin;

import javax.swing.JPanel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;

public class page1 extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public page1() {
		
		setForeground(new Color(0, 1, 56));
		setBackground(new Color(0, 1, 56));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(153, 193, 241));
		panel.setBackground(new Color(63, 108, 191));
		panel.setBounds(0, 0, 441, 353);
		add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(153, 193, 241));
		textField.setBounds(164, 168, 248, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(153, 193, 241));
		textField_1.setColumns(10);
		textField_1.setBounds(164, 214, 248, 27);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(153, 193, 241));
		textField_2.setColumns(10);
		textField_2.setBounds(164, 262, 248, 27);
		panel.add(textField_2);
		
		JLabel lblNewLabel = new JLabel("Nombre de usuario");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel.setBounds(12, 172, 146, 17);
		panel.add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setFont(new Font("Dialog", Font.BOLD, 15));
		lblContrasea.setBounds(65, 218, 93, 17);
		panel.add(lblContrasea);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setForeground(new Color(51, 51, 51));
		lblTelefono.setFont(new Font("Dialog", Font.BOLD, 15));
		lblTelefono.setBounds(86, 266, 72, 17);
		panel.add(lblTelefono);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(page1.class.getResource("/images/icons8-cambiar-usuario-masculino-80.png")));
		label.setBounds(178, 12, 93, 88);
		panel.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(153, 193, 241));
		separator.setBounds(12, 133, 400, 23);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(153, 193, 241));
		separator_1.setBounds(12, 312, 400, 17);
		panel.add(separator_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(98, 160, 234));
		panel_1.setBounds(0, 353, 441, 49);
		add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(98, 160, 234));
		btnNewButton.setBounds(322, 0, 107, 51);
		btnNewButton.setBorderPainted(false);
		panel_1.add(btnNewButton);
		btnNewButton.setForeground(new Color(0, 1, 56));
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton_1.setForeground(new Color(36, 31, 49));
		btnNewButton_1.setBackground(new Color(98, 160, 234));
		btnNewButton_1.setBounds(222, 0, 101, 51);
		btnNewButton_1.setBorderPainted(false);
		panel_1.add(btnNewButton_1);
		
		// Agrega un ActionListener al botón "Guardar" para cerrar el panel page1 al hacer clic
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});

	}
}

