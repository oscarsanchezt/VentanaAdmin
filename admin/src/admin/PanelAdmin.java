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
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;

public class PanelAdmin {

    private JFrame frame;
    private JPanel content;
    private JButton btnNewButton;
    private JScrollPane scrollPane;
    private JList<String> list;
    private JPanel panel;

    public static void main(String[] args) {
        PanelAdmin window = new PanelAdmin();
        window.frame.setVisible(true);
    }

    public PanelAdmin() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(26, 95, 180));
        frame.getContentPane().setLayout(null);
        content = new JPanel();
        content.setBackground(new Color(98, 160, 234));
        content.setBounds(225, 0, 441, 398);
        frame.getContentPane().add(content);
        content.setLayout(null);

        btnNewButton = new JButton("Añadir");
        btnNewButton.setForeground(new Color(153, 193, 241));
        btnNewButton.setBackground(new Color(28, 113, 216));
        btnNewButton.setBounds(91, 142, 85, 20);
        frame.getContentPane().add(btnNewButton);

        scrollPane = new JScrollPane();
        scrollPane.setBounds(65, 226, 155, 160);
        frame.getContentPane().add(scrollPane);

        // Crear un modelo de datos para el JList
        DefaultListModel<String> listModel = new DefaultListModel<>();
        list = new JList<>(listModel);
        list.setBackground(new Color(28, 113, 216));
        scrollPane.setViewportView(list);
        
        panel = new JPanel();
        panel.setBackground(new Color(29, 41, 135));
        panel.setBounds(0, 0, 59, 398);
        frame.getContentPane().add(panel);
        
        JLabel lblNewLabel = new JLabel("USUARIOS");
        lblNewLabel.setForeground(new Color(153, 193, 241));
        lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
        lblNewLabel.setBounds(104, 202, 85, 17);
        frame.getContentPane().add(lblNewLabel);
        
        JSeparator separator = new JSeparator();
        separator.setBackground(new Color(153, 193, 241));
        separator.setBounds(65, 186, 148, 9);
        frame.getContentPane().add(separator);
        
        JLabel lblNewLabel_1 = new JLabel("Añadir nuevo usuario");
        lblNewLabel_1.setForeground(new Color(153, 193, 241));
        lblNewLabel_1.setBackground(new Color(153, 193, 241));
        lblNewLabel_1.setBounds(68, 113, 139, 17);
        frame.getContentPane().add(lblNewLabel_1);
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setBackground(new Color(153, 193, 241));
        separator_1.setBounds(65, 92, 148, 9);
        frame.getContentPane().add(separator_1);
        
        JLabel lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setIcon(new ImageIcon(PanelAdmin.class.getResource("/images/icons8-cambiar-usuario-masculino-80.png")));
        lblNewLabel_2.setBounds(91, 0, 85, 85);
        frame.getContentPane().add(lblNewLabel_2);

        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                page1 p1 = new page1(listModel);
                p1.setSize(441, 398);
                p1.setLocation(0, 0);
                content.removeAll();
                content.add(p1, BorderLayout.CENTER);
                content.revalidate();
                content.repaint();
            }
        });

        frame.setBounds(100, 100, 666, 425);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
