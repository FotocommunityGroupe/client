package edu.esprit.fotocommunity.client.Models;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import edu.esprit.fotocommunity.client.utils.ReclamationBusinessDelegate;

public class ReclamationModel extends AbstractTableModel{
	
	 List <edu.esprit.fotocommunity.ejb.entities.Reclamation> reclams =new ArrayList<edu.esprit.fotocommunity.ejb.entities.Reclamation>();
	    String[] entete = {"idReclamation","Content", "Photographer", "nbReclamations", "User_ID_USER","admin_ID"};

   
	    
	    
	    
	    public ReclamationModel() {
	    	
	    	
	    	reclams =  ReclamationBusinessDelegate.findAllReclamations(); 	
			
		}
	


	    
	    
	    
	    
	@Override
	public int getRowCount() {
		return reclams.size();
	}

	@Override
	public int getColumnCount() {
	
		return entete.length;
		
		
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
	
		 switch (columnIndex) {
         case 0:
             return reclams.get(rowIndex).getIdReclamation();
         case 1:
             return reclams.get(rowIndex).getContent();
//         case 2:
//             return reclams.get(rowIndex).getPhotographer().getNAME();
         case 3:
             return reclams.get(rowIndex).getNbReclamations();
         case 4:
        	 return reclams.get(rowIndex).getUser().getNAME();
        
        
         
         default:
              throw new IllegalArgumentException();
     }
	}
		 @Override
		    public String getColumnName(int column) {
		        return entete[column];
		    }
		
		
		
	}
	
	
	
	
    
	
	
	
	


