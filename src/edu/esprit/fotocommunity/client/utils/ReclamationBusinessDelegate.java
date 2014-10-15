package edu.esprit.fotocommunity.client.utils;

import java.util.List;

import edu.esprit.fotocommunity.ejb.entities.Reclamation;
import edu.esprit.fotocommunity.ejb.services.ReclamationsMgm;
import edu.esprit.fotocommunity.ejb.services.ReclamationsMgmRemote;

public class ReclamationBusinessDelegate {

	
	
	
	
	// récupration de tous les reclamations de la plateforme
		public static List<Reclamation> findAllReclamations() {

			ReclamationsMgmRemote reclamationsMgmRemote = (ReclamationsMgmRemote) ServiceLocator
					.getInstance()
					.lookupProxy("/edu.esprit.fotocommunity.ejb/ReclamationsMgm!edu.esprit.fotocommunity.ejb.services.ReclamationsMgmRemote");

			 return reclamationsMgmRemote.findAllReclamations();
		}
		
		
		public static void deleteReclamation (Reclamation rec) {

			ReclamationsMgmRemote reclamationsMgmRemote = (ReclamationsMgmRemote) ServiceLocator
					.getInstance()
					.lookupProxy("/edu.esprit.fotocommunity.ejb/ReclamationsMgm!edu.esprit.fotocommunity.ejb.services.ReclamationsMgmRemote");

			reclamationsMgmRemote.deleteReclamation(rec);
		}
		
		
		public static void addReclamation (Reclamation rec) {

			ReclamationsMgmRemote reclamationsMgmRemote = (ReclamationsMgmRemote) ServiceLocator
					.getInstance()
					.lookupProxy("/edu.esprit.fotocommunity.ejb/ReclamationsMgm!edu.esprit.fotocommunity.ejb.services.ReclamationsMgmRemote");

			reclamationsMgmRemote.addReclamation(rec);
		}
		
		
		
		
		
		
		
		
		
	
	
	
	
}
