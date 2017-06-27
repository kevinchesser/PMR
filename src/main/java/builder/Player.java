package builder;

public class Player {
	
	private String name;
	private String team;
	private String country;
	
	Player(String name, String team, String country) {
		this.name = name;
		this.team = team;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
