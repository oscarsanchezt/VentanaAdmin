package admin;

import javax.swing.JPanel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;

public class page1 extends JPanel {
	private JTextField textFieldNombre;
	private DefaultListModel<String> listModel;
	private JTextField textField;
	private JTextField textField_1;

	public page1(DefaultListModel<String> listModel) {
		this.listModel = listModel;
		setBorder(null);
		setForeground(new Color(153, 193, 241));
		setBackground(new Color(98, 160, 234));
		setLayout(null);
		// USUARIO
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(164, 173, 248, 27);
		add(textFieldNombre);
		textFieldNombre.setBackground(new Color(153, 193, 241));
		textFieldNombre.setColumns(10);

		JPanel panel = new JPanel();
		panel.setForeground(new Color(153, 193, 241));
		panel.setBackground(new Color(53, 132, 228));
		panel.setBounds(0, 350, 441, 48);
		add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setBounds(324, 12, 90, 30);
		panel.add(btnNewButton);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(53, 132, 228));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setForeground(new Color(0, 1, 56));

		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(new Color(53, 132, 228));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBounds(219, 12, 93, 30);
		panel.add(btnNewButton_1);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBackground(new Color(153, 193, 241));
		textField.setBounds(164, 227, 248, 27);
		add(textField);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(153, 193, 241));
		textField_1.setBounds(164, 281, 248, 27);
		add(textField_1);

		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Dialog", Font.BOLD, 18));
		lblUsuario.setBounds(79, 173, 92, 22);
		add(lblUsuario);

		JLabel lblNewLabel = new JLabel("Contraseña");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(44, 227, 104, 22);
		add(lblNewLabel);

		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Dialog", Font.BOLD, 18));
		lblTelefono.setBounds(68, 281, 78, 22);
		add(lblTelefono);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(153, 193, 241));
		separator.setBounds(33, 146, 379, 15);
		add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(page1.class.getResource("/images/icons8-cambiar-usuario-masculino-80.png")));
		lblNewLabel_1.setBounds(188, 45, 84, 89);
		add(lblNewLabel_1);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = textFieldNombre.getText();
				listModel.addElement(nombre); // Agregar el nombre ingresado al modelo de datos
				setVisible(false);
			}
		});
	}
}
