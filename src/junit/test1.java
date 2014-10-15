package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.esprit.fotocommunity.client.utils.AdminBusinessDelegate;
import edu.esprit.fotocommunity.client.utils.ReclamationBusinessDelegate;
import edu.esprit.fotocommunity.ejb.entities.AdminManager;
import edu.esprit.fotocommunity.ejb.entities.Reclamation;

public class test1 {

	@Test
	public void test() {
           AdminManager rec = new AdminManager();
           rec.setCITY("fffffffff");
           rec.setID(1);
           
		AdminBusinessDelegate.addAdminManager(rec);
		
		
		
	}
	@Test
	public void test2() {
           Reclamation rec = new Reclamation();
           rec.setContent("ddddd");
           rec.setIdReclamation(1);
           
		ReclamationBusinessDelegate.deleteReclamation(rec);
		
		
		
	}


}
