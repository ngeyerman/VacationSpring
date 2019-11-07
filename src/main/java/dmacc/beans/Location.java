package dmacc.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;


/*
 * Program to take in location information and specific things to do and add to a database
 * uses database: vacaspringboot
 * table: location
 */

@Entity
public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column()
	private String destination; 
	@Column(name = "TRAVEL_MODE")
	private String travelMode; //car or plane
	@Column(name = "TRAVEL_TIME")
	private double travelTime; //amount of time it takes to travel there
	@Column(name = "KID_FRIENDLY")
	private boolean kidFriendly; //is it the type of place you would bring kids to?
	@Autowired
	private Attractions attractions;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getTravelMode() {
		return travelMode;
	}
	public void setTravelMode(String travelMode) {
		this.travelMode = travelMode;
	}
	public double getTravelTime() {
		return travelTime;
	}
	public void setTravelTime(double travelTime) {
		this.travelTime = travelTime;
	}
	public boolean isKidFriendly() {
		return kidFriendly;
	}
	public void setKidFriendly(boolean kidFriendly) {
		this.kidFriendly = kidFriendly;
	}
	public Attractions getAttractions() {
		return attractions;
	}
	public void setAttractions(Attractions attractions) {
		this.attractions = attractions;
	}
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	

		
	
	
}
