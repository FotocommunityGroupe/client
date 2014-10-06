package edu.esprit.fotocommunity.client.utils;

import java.util.List;

import edu.esprit.fotocommunity.ejb.entities.BasicUser;
import edu.esprit.fotocommunity.ejb.entities.PremiumUser;
import edu.esprit.fotocommunity.ejb.entities.WolrdUser;
import edu.esprit.fotocommunity.ejb.services.UsersMgmRemote;



public class UsersBusinessDelegate {
	
	
//ajout d'un basicUser
	public static void addBasicUser(BasicUser U) {

		UsersMgmRemote usercmMgmRemote = (UsersMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/UsersMgm!edu.esprit.fotocommunity.ejb.services.UsersMgmRemote");

		usercmMgmRemote.addBasiUser(U);
	}
	
//ajout d'un premium user
	public static void addPremiumUser(PremiumUser U) {

		UsersMgmRemote usercmMgmRemote = (UsersMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/UsersMgm!edu.esprit.fotocommunity.ejb.services.UsersMgmRemote");

		usercmMgmRemote.addPremiumUser(U);
	}
	
//ajout d'un world user
	public static void addWorldUser(WolrdUser U) {

		UsersMgmRemote usercmMgmRemote = (UsersMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/UsersMgm!edu.esprit.fotocommunity.ejb.services.UsersMgmRemote");

		usercmMgmRemote.addWorldUser(U);
	}
	
//mise � jour d'un basicUser
	public static void updateBasicUser(BasicUser U) {

		UsersMgmRemote usercmMgmRemote = (UsersMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/UsersMgm!edu.esprit.fotocommunity.ejb.services.UsersMgmRemote");

		usercmMgmRemote.updateBasicUser(U);
	}
	
	
//mise � jour d'un premium user	
	public static void updatePremiumUser(PremiumUser U) {

		UsersMgmRemote usercmMgmRemote = (UsersMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/UsersMgm!edu.esprit.fotocommunity.ejb.services.UsersMgmRemote");

		usercmMgmRemote.updatePremiumUser(U);
	}
	
	
//mise � jour d'un World User	
	public static void updateWolrdUser(WolrdUser U) {

		UsersMgmRemote usercmMgmRemote = (UsersMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/UsersMgm!edu.esprit.fotocommunity.ejb.services.UsersMgmRemote");

		usercmMgmRemote.updateWorldUser(U);
	}
	
	
// r�cup�ration d'un user selon son id	
	public static BasicUser findUser(int idUser) {

		UsersMgmRemote usercmMgmRemote = (UsersMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/UsersMgm!edu.esprit.fotocommunity.ejb.services.UsersMgmRemote");

		return usercmMgmRemote.findUser(idUser);
	}
	
	
//Suppression d'un basic user
	public static void deleteUser (BasicUser U) {

		UsersMgmRemote usercmMgmRemote = (UsersMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/UsersMgm!edu.esprit.fotocommunity.ejb.services.UsersMgmRemote");

		usercmMgmRemote.deleteBasiUser(U);
	}
	
////suppression d'un premium user
//	public static void deletePremiumUser (PremiumUser U) {
//		
//		UsersMgmRemote usercmMgmRemote = (UsersMgmRemote) ServiceLocator
//				.getInstance()
//				.lookupProxy("/edu.esprit.fotocommunity.ejb/UsersMgm!edu.esprit.fotocommunity.ejb.services.UsersMgmRemote");
//
//		usercmMgmRemote.deleteBasiUser(U);
//	}

	
	
// r�cupration de tous les utilisateurs de la plateforme
	public static List<BasicUser> findAllUsers() {

		UsersMgmRemote usercmMgmRemote = (UsersMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/UsersMgm!edu.esprit.fotocommunity.ejb.services.UsersMgmRemote");

		 return usercmMgmRemote.findAllUsers();
	}
	
}
