package knb.dinsdag.olc.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Leraar {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
	String voornaam;
	String vak;
	int leeftijd;
	

	
	
}
