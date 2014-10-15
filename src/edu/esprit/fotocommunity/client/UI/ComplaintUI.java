package edu.esprit.fotocommunity.client.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.security.auth.Subject;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.List;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import edu.esprit.fotocommunity.Models.TableModelComplaint;
import edu.esprit.fotocommunity.client.utils.AlertBusinessDelegate;
import edu.esprit.fotocommunity.client.utils.ComplaintsBusinessDelegate;
import edu.esprit.fotocommunity.client.utils.UsersBusinessDelegate;
import edu.esprit.fotocommunity.ejb.entities.Alert;
import edu.esprit.fotocommunity.ejb.entities.Amator;
import edu.esprit.fotocommunity.ejb.entities.BasicUser;
import edu.esprit.fotocommunity.ejb.entities.PremiumUser;
import edu.esprit.fotocommunity.ejb.entities.Reclamation;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import edu.esprit.fotocommunity.Models.*;

import java.awt.Color;

import javax.swing.JScrollPane;
import javax.swing.JButton;

import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.Label;

import javax.swing.JTextField;

import com.sun.org.apache.regexp.internal.recompile;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class ComplaintUI extends JFrame {

	private JPanel contentPane;
	private JTable ComplaintTable;
	private JTextField txtIdReclamation;
	private JTextField txtContent;
	private JTextField txtUserName;

	// mayssirech lajout fel base

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

		// test
		Reclamation rec = new Reclamation();
		rec.setContent("testa");

		ComplaintsBusinessDelegate.addComplaint(rec);

		PremiumUser pu = new PremiumUser();
		pu.setEMAIL("fatma@esprit.tn");
		UsersBusinessDelegate.addPremiumUser(pu);

	}

	/**
	 * Create the frame.
	 */
	public ComplaintUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 721, 572);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("List of complaints");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(119, 97, 189, 14);
		panel.add(lblNewLabel);

		Button button_1 = new Button("Delete");
		button_1.setBounds(143, 454, 107, 34);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JOptionPane jOptionPane = new JOptionPane();
				// int selectedId = ComplaintTable.getSelectedRow();

				int idReclamation = (int) ComplaintTable.getValueAt(
						ComplaintTable.getSelectedRow(), 0);
				Reclamation rec = ComplaintsBusinessDelegate
						.findReclamation(idReclamation);
				System.out.print(rec);
				ComplaintsBusinessDelegate.deleteReclamation(rec);
				TableModelComplaint tbm = new TableModelComplaint();
				ComplaintTable.setModel(tbm);
				tbm.fireTableDataChanged();
				
				  JOptionPane.showMessageDialog(null, "the complaint was deleted");
				
				

			}
		});
		panel.add(button_1);

		JLabel label = new JLabel("");
		label.setBounds(352, 302, 46, 14);
		panel.add(label);

		Button button_2 = new Button("Block");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(434, 454, 88, 34);
		panel.add(button_2);

		Button button_3 = new Button("Alert");
		button_3.addActionListener(new ActionListener() {
			
			
			
			
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane jOptionPane = new JOptionPane();
				// int selectedId = ComplaintTable.getSelectedRow();

				BasicUser u=new BasicUser();
			        u.setID_USER((Integer) ComplaintTable.getValueAt(ComplaintTable.getSelectedRow(),0));
				Alert a = new Alert();
		        a.setUser(u);
		        
				System.out.print(u.getID_USER());
				AlertBusinessDelegate.addAlert(a);;
				TableModelComplaint tbm = new TableModelComplaint();
				ComplaintTable.setModel(tbm);
				tbm.fireTableDataChanged();
				
				  JOptionPane.showMessageDialog(null, "you have sent an alert");

				
				
				
				
			}
			
			
			
		});
		button_3.setBounds(597, 454, 91, 34);
		panel.add(button_3);

		JLabel lblAcounte = new JLabel("Account");
		lblAcounte.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAcounte.setBounds(366, 26, 72, 22);
		lblAcounte.setForeground(new Color(0, 0, 0));
		panel.add(lblAcounte);

		JLabel userNameLabel = new JLabel("User Name");
		userNameLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		userNameLabel.setBounds(472, 26, 140, 22);
		userNameLabel.setText(AuthentificationAdminUI.admin.getUsername());
		panel.add(userNameLabel);

		JButton btnDeconnexion = new JButton("");
		btnDeconnexion.setIcon(new ImageIcon("C:\\Users\\Sinda Yakoubi\\Desktop\\Logout.png"));
		btnDeconnexion.setBounds(622, 26, 51, 40);
		btnDeconnexion.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				dispose();
				AuthentificationAdminUI aut = new AuthentificationAdminUI();
				aut.setVisible(true);

			}
		});
		panel.add(btnDeconnexion);

		JPanel panelTable = new JPanel();
		panelTable.setBounds(10, 142, 371, 292);
		panel.add(panelTable);
		panelTable.setLayout(new BorderLayout(0, 0));

		ComplaintTable = new JTable();
		ComplaintTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// c bon just blasetha ghalta !! att
				
				//selected row  , id Copmlain
				int IdUser = (int) ComplaintTable.getValueAt(ComplaintTable.getSelectedRow(), 0);
				
				// find Complain complain c find user par id
				BasicUser u = UsersBusinessDelegate.findUser(IdUser);
				System.out.println(IdUser+" "+" "+u);
				
				//setii textFiled bel find eli 9itha textFiledNom.setText(c.nom)
				txtIdReclamation.setText(u.getNAME());
				txtContent.setText(u.getEMAIL());
				txtUserName.setText(u.getUSER_NAME());
			   
		    
		    
		    
			}
		});
		ComplaintTable.setModel(new TableModelComplaint());
		JScrollPane scrollPane = new JScrollPane(ComplaintTable);
		scrollPane.addMouseListener(new MouseAdapter() {
			
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				       
				
			}
		});
		panelTable.add(scrollPane, BorderLayout.CENTER);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblName.setBounds(440, 140, 69, 14);
		panel.add(lblName);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblEmail.setBounds(439, 225, 70, 14);
		panel.add(lblEmail);
		
		JLabel lblUser = new JLabel("User Name");
		lblUser.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblUser.setBounds(429, 302, 80, 14);
		panel.add(lblUser);
		
		txtIdReclamation = new JTextField();
		txtIdReclamation.setEditable(false);
		txtIdReclamation.setBounds(530, 142, 127, 20);
		panel.add(txtIdReclamation);
		txtIdReclamation.setColumns(10);
		
		txtContent = new JTextField();
		txtContent.setEditable(false);
		txtContent.setColumns(10);
		txtContent.setBounds(530, 221, 127, 22);
		panel.add(txtContent);
		
		txtUserName = new JTextField();
		txtUserName.setEditable(false);
		txtUserName.setColumns(10);
		txtUserName.setBounds(530, 296, 127, 20);
		panel.add(txtUserName);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Sinda Yakoubi\\Desktop\\background.PNG"));
		lblNewLabel_1.setBounds(0, 0, 705, 514);
		panel.add(lblNewLabel_1);

	}
}
