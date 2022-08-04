package Builder;

public class Apartment {
	private int smq;
	private int rooms;
	private String city;
	private String area;
	private boolean kitchen;
	
	public Apartment(int smq, int rooms, String city, String area, boolean kitchen) {
		this.smq = smq;
		this.rooms = rooms;
		this.city = city;
		this.area = area;
		this.kitchen = kitchen;
	}

	public int getSmq() {
		return smq;
	}

	public void setSmq(int smq) {
		this.smq = smq;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public boolean isKitchen() {
		return kitchen;
	}

	public void setKitchen(boolean kitchen) {
		this.kitchen = kitchen;
	}
	
	
	// method check display apartment
	public void display() {
		System.out.println("Apartment has: ");
		if(smq > 1) {
			System.out.println(smq + "sqm");
		}
		if(rooms >= 1) {
			System.out.println(rooms + " rooms");
		}
		if(city != null && !city.isBlank()) {
			System.out.println("Apartment is in " + city);
		}
		if(area!= null && !area.isBlank()) {
			System.out.println("Apartment is in " + area);
		}
		if(kitchen) {
			System.out.println("Apartment has a kitchen");
		}
		System.out.println("");
		
	}
	
}


















