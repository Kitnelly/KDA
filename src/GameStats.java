
public class GameStats {

		private int kills;
		private int deaths;
		private int assists;
		private String gameName;
		
	public GameStats(String gameName, int kills, int deaths, int assists) {
		this.gameName = gameName;
		this.kills = kills;
		this.deaths = deaths;
		this.assists = assists;
	}
	
	public String getName() {
		return gameName;
	}
	
	//3 methods to add individual stats
	//1 method to add kills, deaths and assists at once
	public void addStats(int newKills, int newDeaths, int newAssists) {
		kills += newKills;
		deaths += newDeaths;
		assists += newAssists;
	}
	public void addKills(int newKills) {
		kills += newKills;
	}
	
	public void addDeaths(int newDeaths) {
		deaths += newDeaths;
	}

	public void addAssists(int newAssists) {
		assists += newAssists;
	}
	
	public int getKills(String game) {
		return kills;
	}
	
	public int getDeaths(String game) {
		return deaths;
	}
	
	public int getAssists(String game) {
		return assists;
	}
	
	//method to return actual KDA ratio using kills plus assists divided by deaths
	public double getKDA() {
		return (kills + assists)/deaths;
	}
	
	//method to return actual KD ration using kills divided by deaths
	public double getKD() {
		return kills/deaths;
	}
}
