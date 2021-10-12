package knb.dinsdag.olc.domein;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Lesdag {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
	String lokaal;
	int aantalLeerlingen;
	LocalDateTime datum;
	
	@OneToOne
	Leraar leraar;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLokaal() {
		return lokaal;
	}

	public void setLokaal(String lokaal) {
		this.lokaal = lokaal;
	}

	public int getAantalLeerlingen() {
		return aantalLeerlingen;
	}

	public void setAantalLeerlingen(int aantalLeerlingen) {
		this.aantalLeerlingen = aantalLeerlingen;
	}

	public LocalDateTime getDatum() {
		return datum;
	}

	public void setDatum(LocalDateTime datum) {
		this.datum = datum;
	}

	public Leraar getLeraar() {
		return leraar;
	}

	public void setLeraar(Leraar leraar) {
		this.leraar = leraar;
	}
	
	
	
	
}
