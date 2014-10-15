package edu.esprit.fotocommunity.Models;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import edu.esprit.fotocommunity.client.utils.ComplaintsBusinessDelegate;
import edu.esprit.fotocommunity.ejb.entities.Reclamation;

public class TableModelComplaint extends AbstractTableModel  {

	
	
	List<Reclamation> subjectlist = new ArrayList<Reclamation>();
	String[] header = { "IdReclamation","Content","User_ID_USER", "amateur_ID" };
	
	public TableModelComplaint() {
		subjectlist = ComplaintsBusinessDelegate.findAllComplaints();

		
	}
	

	
	@Override
	public int getRowCount() {
		return subjectlist.size();

	}

	@Override
	public int getColumnCount() {
		return header.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		
		switch (columnIndex) {
		case 0:
			return subjectlist.get(rowIndex).getIdReclamation();
		case 1:
			return subjectlist.get(rowIndex).getContent();
		case 2:
			return subjectlist.get(rowIndex).getUser().getID_USER();
		case 3:
			return subjectlist.get(rowIndex).getAmateur().getUsername();

		default:
			return null;
		}

		
	}
	 public String getColumnName(int column) {
	        return header[column];
	    }
}
