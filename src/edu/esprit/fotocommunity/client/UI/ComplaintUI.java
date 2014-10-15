package edu.esprit.fotocommunity.client.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.List;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JTable;

import edu.esprit.fotocommunity.client.Models.ReclamationModel;

public class ComplaintUI extends JFrame {

	private JPanel contentPane;
	private JTable tableComplaints;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComplaintUI frame = new ComplaintUI();
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
	public ComplaintUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 583, 423);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("List of complaints");
		lblNewLabel.setBounds(107, 50, 152, 14);
		panel.add(lblNewLabel);
		
		Button button = new Button("Consult detail");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(66, 322, 87, 22);
		panel.add(button);
		
		Button button_1 = new Button("Delete");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(175, 322, 92, 22);
		panel.add(button_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(352, 39, 140, 133);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Sinda Yakoubi\\Desktop\\admin.png"));
		
		JLabel lblNewLabel_2 = new JLabel("Oumayma Ajengui");
		lblNewLabel_2.setBounds(376, 183, 140, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Registration date : 05/08/2009");
		lblNewLabel_3.setBounds(352, 256, 190, 35);
		panel.add(lblNewLabel_3);
		
		JLabel label = new JLabel("");
		label.setBounds(352, 302, 46, 14);
		panel.add(label);
		
		Button button_2 = new Button("Block");
		button_2.setBounds(340, 322, 70, 22);
		panel.add(button_2);
		
		Button button_3 = new Button("Alert");
		button_3.setBounds(457, 322, 70, 22);
		panel.add(button_3);
		
		tableComplaints = new JTable();
		tableComplaints.setBounds(10, 89, 310, 213);
		tableComplaints.setModel(new ReclamationModel());
		panel.add(tableComplaints);
		
	}
}
