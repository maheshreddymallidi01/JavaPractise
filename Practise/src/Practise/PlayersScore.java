package Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PlayersScore {

	public static void main(String[] args) {
		List<Player> players = Arrays.asList(new Player("Mahesh", 100, "India"),new Player("MMR", 50, "USA"),
				new Player("MR", 200, "India"),new Player("MK", 250, "USA"));
		
		DoubleSummaryStatistics result = players.stream().collect(Collectors.summarizingDouble(Player::getScore));
		System.out.println(result.getSum());
		
		int r = players.stream().mapToInt(x->x.getScore()).reduce(0,(a,b)->a+b);
		System.out.println(r);
		
		Map<String, List<Player>> teams = players.stream().collect(Collectors.groupingBy(Player::getTeam));
		System.out.println(teams);
		
		List<Player>sortedList = players.stream().sorted(Comparator.comparing(Player::getName)).collect(Collectors.toList());
		System.out.println(sortedList);
	}

}
