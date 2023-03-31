package studio7;

public class hockeyPlayer {

	private String name;
	private int jerseyNumber;
	private boolean isRighty;
	private boolean shootRight;
	private boolean shootLeft;
	private int numGames;

	public hockeyPlayer(String n, int jers, int g) {
		name = n;
		jerseyNumber = jers;
		numGames = g;
	}

	public int assists() {
		return (int)Math.random()*5;
	}

	public int goals() {
		return (int)Math.random()*5;
	}
	
	public int points() {
		return assists()+goals();
	}
	
	public int games() {
		int totalPoints = 0;
		for (int i = 0; i < numGames; i++) {
			totalPoints = totalPoints+points();
		}
		
		return totalPoints;
	}
	
	
}
