package edu.esprit.fotocommunity.client.utils;

import java.util.List;

import edu.esprit.fotocommunity.ejb.entities.Comment;
import edu.esprit.fotocommunity.ejb.entities.Reclamation;
import edu.esprit.fotocommunity.ejb.services.CommentMgmRemote;
import edu.esprit.fotocommunity.ejb.services.ReclamationRemote;

public class ComplaintsBusinessDelegate {
	
	
	
	//ajout d'une Reclamation
		public static void addComplaint(Reclamation rec) {

			ReclamationRemote reclamationRemote = (ReclamationRemote) ServiceLocator
					.getInstance()
					.lookupProxy("/edu.esprit.fotocommunity.ejb/ReclamationMgm!edu.esprit.fotocommunity.ejb.services.ReclamationRemote");

			reclamationRemote.addComplaint(rec);
		}
		
		//Suppression d'une reclamation
		public static void deleteReclamation (Reclamation rec) {

			ReclamationRemote reclamationRemote = (ReclamationRemote) ServiceLocator
					.getInstance()
					.lookupProxy("/edu.esprit.fotocommunity.ejb/ReclamationMgm!edu.esprit.fotocommunity.ejb.services.ReclamationRemote");

			reclamationRemote.deleteComplaint(rec);
		}
		
		
		
		// récupration de toutes les reclamations des utilisateurs
		public static List<Reclamation> findAllComplaints() {

			ReclamationRemote reclamationRemote = (ReclamationRemote) ServiceLocator
					.getInstance()
					.lookupProxy("/edu.esprit.fotocommunity.ejb/ReclamationMgm!edu.esprit.fotocommunity.ejb.services.ReclamationRemote");

			 return reclamationRemote.findAllReclamation();
		}
		

	
	
		// récupération d'une reclamation selon son id	
		public static Reclamation findReclamation(int idReclamation) {

			ReclamationRemote reclamationRemote = (ReclamationRemote) ServiceLocator
					.getInstance()
					.lookupProxy("/edu.esprit.fotocommunity.ejb/ReclamationMgm!edu.esprit.fotocommunity.ejb.services.ReclamationRemote");

			return reclamationRemote.findReclamation(idReclamation);
		}
		
	

}
