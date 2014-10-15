package edu.esprit.fotocommunity.client.utils;

import java.util.List;

import edu.esprit.fotocommunity.ejb.entities.AdminManager;
import edu.esprit.fotocommunity.ejb.entities.BasicUser;
import edu.esprit.fotocommunity.ejb.services.AdminMgmRemote;
import edu.esprit.fotocommunity.ejb.services.UsersMgmRemote;

public class AdminBusinessDelegate {
	
	
	
	
	public static void addAdminManager(AdminManager A) {

		 AdminMgmRemote adminmgmremote = (AdminMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/AdminMgm!edu.esprit.fotocommunity.ejb.services.AdminMgmRemote");

		 adminmgmremote.addAdminManager(A);
	}
	
	
	public static AdminManager findAdmin(int idAdmin) {

		AdminMgmRemote adminmgmremote = (AdminMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/AdminMgm!edu.esprit.fotocommunity.ejb.services.AdminMgmRemote");

		return adminmgmremote.findAdmin(idAdmin);
	}
	
	
	

	
	public static AdminManager connexion(String login , String pwd) {

		AdminMgmRemote adminmgmremote = (AdminMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/AdminMgm!edu.esprit.fotocommunity.ejb.services.AdminMgmRemote");

		return adminmgmremote.connexion(login, pwd);
	}
	
	public List<AdminManager> findAllAdmins() {

		AdminMgmRemote adminmgmremote = (AdminMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/AdminMgm!edu.esprit.fotocommunity.ejb.services.AdminMgmRemote");

		return adminmgmremote.findAllAdmins();
	}
	
	
	

}
