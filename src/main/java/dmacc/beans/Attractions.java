package dmacc.beans;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Attractions {
	@Column(name = "TO_EAT")
	private String toEat;
	@Column(name = "TO_DRINK")
	private String toDrink;
	@Column(name = "TO_DO")
	private String toDo;
	
	public Attractions() {
		super();
		// TODO Auto-generated constructor stub
	}

		
	public Attractions(String toEat, String toDrink, String toDo) {
		super();
		this.toEat = toEat;
		this.toDrink = toDrink;
		this.toDo = toDo;
	}


	public String getToEat() {
		return toEat;
	}


	public void setToEat(String toEat) {
		this.toEat = toEat;
	}


	public String getToDrink() {
		return toDrink;
	}


	public void setToDrink(String toDrink) {
		this.toDrink = toDrink;
	}


	public String getToDo() {
		return toDo;
	}


	public void setToDo(String toDo) {
		this.toDo = toDo;
	}


	@Override
	public String toString() {
		return "Attractions [toEat=" + toEat + ", toDrink=" + toDrink + ", toDo=" + toDo + "]";
	}
	
	
	
	
	
}
