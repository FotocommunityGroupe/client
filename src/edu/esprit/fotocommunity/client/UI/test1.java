package edu.esprit.fotocommunity.client.UI;

import edu.esprit.fotocommunity.client.utils.AdminBusinessDelegate;
import edu.esprit.fotocommunity.ejb.entities.AdminManager;
import edu.esprit.fotocommunity.ejb.entities.SuperAdmin;

public class test1 {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		AdminManager ad = new AdminManager();
		ad = AdminBusinessDelegate.connexion("senda", "senda");
		
		
		
		
		/*SuperAdmin admin =new SuperAdmin();
		admin.setEMAIL("senda");
		admin.setPassword("senda");
		AdminBusinessDelegate.addAdminManager(admin);*/
			
	}

}
