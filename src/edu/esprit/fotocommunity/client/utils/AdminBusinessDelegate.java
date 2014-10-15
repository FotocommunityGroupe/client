package edu.esprit.fotocommunity.client.utils;

import edu.esprit.fotocommunity.ejb.entities.AdminManager;
import edu.esprit.fotocommunity.ejb.entities.WolrdUser;
import edu.esprit.fotocommunity.ejb.services.AdminMgmRemote;
import edu.esprit.fotocommunity.ejb.services.UsersMgmRemote;

public class AdminBusinessDelegate {
	
	
	//ajout d'un adminManger
		public static void addAdminManager(AdminManager A) {

			AdminMgmRemote adminMgmRemote = (AdminMgmRemote) ServiceLocator
					.getInstance()
					.lookupProxy("/edu.esprit.fotocommunity.ejb/AdminMgm!edu.esprit.fotocommunity.ejb.services.AdminMgmRemote");

			adminMgmRemote.addAdminManager(A);
		}
	
		//mise à jour d'un Admin Manager	
		public static void updateAdminManager(AdminManager A) {

			AdminMgmRemote adminMgmRemote = (AdminMgmRemote) ServiceLocator
					.getInstance()
					.lookupProxy("/edu.esprit.fotocommunity.ejb/AdminMgm!edu.esprit.fotocommunity.ejb.services.AdminMgmRemote");

			adminMgmRemote.updateAdminManager(A);
		}
		
		//Suppression d'un Admin Manager	
				public static void deleteAdminManager(AdminManager A) {

					AdminMgmRemote adminMgmRemote = (AdminMgmRemote) ServiceLocator
							.getInstance()
							.lookupProxy("/edu.esprit.fotocommunity.ejb/AdminMgm!edu.esprit.fotocommunity.ejb.services.AdminMgmRemote");

					adminMgmRemote.deleteAdminManager(A);
				}
				
				
				
				
				
				
                     // Authentification 
				public AdminManager connexion(String login, String pwd) {

					AdminMgmRemote adminMgmRemote = (AdminMgmRemote) ServiceLocator
							.getInstance()
							.lookupProxy(
									"/edu.esprit.fotocommunity.ejb/AdminMgm!edu.esprit.fotocommunity.ejb.services.AdminMgmRemote");

					return adminMgmRemote.connexion(login, pwd);

				}
				
				
				
				
				
		
		
	

}
