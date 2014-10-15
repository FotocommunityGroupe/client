package edu.esprit.fotocommunity.client.utils;

import java.util.List;

import edu.esprit.fotocommunity.ejb.entities.AdminManager;
import edu.esprit.fotocommunity.ejb.entities.Alert;
import edu.esprit.fotocommunity.ejb.entities.Reclamation;
import edu.esprit.fotocommunity.ejb.services.AdminMgmRemote;
import edu.esprit.fotocommunity.ejb.services.AlertMgmRemote;
import edu.esprit.fotocommunity.ejb.services.ReclamationRemote;

public class AlertBusinessDelegate {

	
	public static void addAlert(Alert al){

		 AlertMgmRemote alertmgmremote = (AlertMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/AlertMgm!edu.esprit.fotocommunity.ejb.services.AlertMgmRemote");

		 alertmgmremote.addAlert(al);
	}
	public static void deleteAlert (Alert al) {

		AlertMgmRemote alertmgmremote = (AlertMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/AlertMgm!edu.esprit.fotocommunity.ejb.services.AlertMgmRemote");

		alertmgmremote.deleteAlert(al);
	}
	
	
	public static Alert findAlert(int IdAlert) {

		AlertMgmRemote alertmgmremote = (AlertMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/AlertMgm!edu.esprit.fotocommunity.ejb.services.AlertMgmRemote");

		return alertmgmremote.findAlert(IdAlert);
	}
	
	
	public static List<Alert> findAllAlert() {

		AlertMgmRemote alertmgmremote = (AlertMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/ReclamationMgm!edu.esprit.fotocommunity.ejb.services.ReclamationRemote");

		 return alertmgmremote.findAllAlert();
	}
	
	
	
	

	
	
	
}
