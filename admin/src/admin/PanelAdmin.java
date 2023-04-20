package admin;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JPanel;
import javax.swing.text.AbstractDocument.Content;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class PanelAdmin {

	private JFrame frame;
	private JButton btnNewButton;
	private JPanel panel;
	private JPanel content;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelAdmin window = new PanelAdmin();
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
	public PanelAdmin() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(26, 95, 180));
		frame.getContentPane().setLayout(null);

		panel = new JPanel();
		panel.setBackground(new Color(23, 22, 123));
		panel.setBounds(50, 0, 176, 398);
		frame.getContentPane().add(panel);

		btnNewButton = new JButton("Añadir");
		btnNewButton.setBounds(45, 187, 85, 20);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				page1 p1 = new page1();
				p1.setSize(441, 398);
				p1.setLocation(0, 0);

				content.removeAll();
				content.add(p1, BorderLayout.CENTER);
				content.revalidate();
				content.repaint();
			}
		});
		panel.setLayout(null);
		panel.add(btnNewButton);

		content = new JPanel();
		content.setBackground(new Color(98, 160, 234));
		content.setBounds(225, 0, 441, 398);
		frame.getContentPane().add(content);
		content.setLayout(null);

		frame.setBounds(100, 100, 666, 425);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
