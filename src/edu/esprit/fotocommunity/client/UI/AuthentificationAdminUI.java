package edu.esprit.fotocommunity.client.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JPasswordField;
import javax.swing.UIManager;

import java.awt.Choice;

import javax.swing.JCheckBoxMenuItem;

import com.sun.java.swing.plaf.windows.WindowsBorders.DashedBorder;

import de.javasoft.plaf.synthetica.SyntheticaGreenDreamLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaMauveMetallicLookAndFeel;
import edu.esprit.fotocommunity.client.utils.AdminBusinessDelegate;
import edu.esprit.fotocommunity.client.utils.ComplaintsBusinessDelegate;
import edu.esprit.fotocommunity.client.utils.UsersBusinessDelegate;
import edu.esprit.fotocommunity.ejb.entities.AdminManager;
import edu.esprit.fotocommunity.ejb.entities.BasicUser;
import edu.esprit.fotocommunity.ejb.entities.Reclamation;
import edu.esprit.fotocommunity.ejb.entities.SuperAdmin;

import java.awt.Button;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;

public class AuthentificationAdminUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtlogin;
	private JPasswordField pwdField;
	private List<BasicUser> l=new ArrayList<BasicUser>();
	static AdminManager admin;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				
				try {
					
					UIManager.setLookAndFeel(new SyntheticaGreenDreamLookAndFeel() );
					
					AuthentificationAdminUI frame = new AuthentificationAdminUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	//Reclamation rec=new Reclamation();
	//rec.setContent("sinda bent monia");
	//rec=ComplaintsBusinessDelegate.findReclamation(1);
	

	
	}

	/**
	 * Create the frame.
	 */
	public AuthentificationAdminUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		Button btConnect = new Button("Connect");
		btConnect.addActionListener(new ActionListener() {
			
	
			public void actionPerformed(ActionEvent e) {
				
				admin = new AdminManager();
				AdminBusinessDelegate adminbusiness = new AdminBusinessDelegate();
				
				admin=adminbusiness.connexion(txtlogin.getText(), pwdField.getText());
				
					if((admin instanceof SuperAdmin))
					{

						
						dispose();
						ComplaintUI c = new ComplaintUI();
						
						c.setVisible(true);
						
					}
						else if ((admin instanceof AdminManager)) {
							
							dispose();
							ProfileUI p = new ProfileUI();
							p.setVisible(true);
							}
					
					
					else
						
						
						
				                    JOptionPane.showMessageDialog(null, "your Password or login is incorrect");
					
					
				}
					
					
				
				
				
			
		});
		btConnect.setBounds(309, 324, 120, 28);
		panel.add(btConnect);
		
		JLabel lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(148, 138, 109, 17);
		panel.add(lblNewLabel_1);
		
		JLabel lblPwd = new JLabel("Password");
		lblPwd.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPwd.setBounds(148, 209, 109, 17);
		panel.add(lblPwd);
		
		txtlogin = new JTextField();
		txtlogin.setBounds(267, 131, 193, 35);
		panel.add(txtlogin);
		txtlogin.setColumns(10);
		
		pwdField = new JPasswordField();
		pwdField.setBounds(267, 202, 193, 35);
		panel.add(pwdField);
		
		JLabel LblPassword = new JLabel("Remember my Password");
		LblPassword.setFont(new Font("Times New Roman", Font.BOLD, 13));
		LblPassword.setBounds(297, 269, 193, 28);
		panel.add(LblPassword);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_1 = new JCheckBoxMenuItem("");
		chckbxmntmNewCheckItem_1.setSelected(true);
		chckbxmntmNewCheckItem_1.setBounds(259, 269, 28, 22);
		panel.add(chckbxmntmNewCheckItem_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Sinda Yakoubi\\Desktop\\background.PNG"));
		lblNewLabel.setBounds(0, 0, 744, 514);
		panel.add(lblNewLabel);
	}
}
