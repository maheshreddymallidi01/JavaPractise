package Practise;

public class Player {
	private String name;
	private int score;
	private String team;
	public Player(String name, int score, String team) {
		super();
		this.name = name;
		this.score = score;
		this.team = team;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", score=" + score + ", team=" + team + "]";
	}
	
}
