package edu.esprit.fotocommunity.client.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import edu.esprit.fotocommunity.client.utils.AdminBusinessDelegate;
import edu.esprit.fotocommunity.client.utils.UsersBusinessDelegate;
import edu.esprit.fotocommunity.ejb.entities.AdminManager;
import edu.esprit.fotocommunity.ejb.entities.BasicUser;
import edu.esprit.fotocommunity.ejb.entities.PremiumUser;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTabbedPane;

public class test extends JFrame {

	private JPanel contentPane;
	private List<BasicUser> l=new ArrayList<BasicUser>();
	private List<PremiumUser> l1=new ArrayList<PremiumUser>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
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
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(609, 373, 89, 23);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//l=UsersBusinessDelegate.findAllUsers();
				l1=UsersBusinessDelegate.findUser1();
			//	System.out.println(l1.get(0).getUSER_NAME());
				System.out.println(l1.size());
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(43, 32, 543, 332);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("List\r\n", null, panel, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
	}
	
	public void testConnexion(){
		AdminManager ad=new AdminBusinessDelegate().connexion("sinda", "sinda");
		if(ad==null)
			System.out.println("n'existe pas");
			else System.out.println("fammmmaaaa");
			
		
		
		}
}
