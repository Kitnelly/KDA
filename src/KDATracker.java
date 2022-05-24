import java.util.HashMap;
import java.util.Map;

public class KDATracker {
	
	private Map<String, GameStats> games;
	
	KDATracker() {
		this.games = new HashMap<String, GameStats>();
	}
	
	public void addGame(String name, GameStats game) {
		if (!games.containsKey(name)) {
		games.put(name, game);
		} else { System.out.println("Game already exists in directory"); }
	}
	
	public void addNewStats(String name, int kills, int deaths, int assists) {
		if (games.containsKey(name)) {
			games.get(name).addKills(kills);
			games.get(name).addDeaths(deaths);
			games.get(name).addAssists(assists);
		} else { System.out.println("This game is not in the directory"); 
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KDATracker g = new KDATracker();
		GameStats cod = new GameStats("cod", 8, 10, 10);
		GameStats apex = new GameStats("apex", 5, 1, 3);
		GameStats fortnite = new GameStats("fortnite", 10, 1, 0);
		g.addGame(cod.getName(), cod);
		g.addGame(apex.getName(), apex);
		g.addGame(fortnite.getName(), fortnite);
		g.games.get(cod.getName()).addStats(5, 3, 2);
		for (String entry : g.games.keySet()) {
			System.out.println(entry + " KDA " + g.games.get(entry).getKDA());
		}
	}

}
