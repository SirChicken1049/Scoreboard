public class Scoreboard {
private String teamOne;
private String teamTwo;
private int teamOneScore;
private int teamTwoScore;
private String activeTeam;

public Scoreboard(String one, String two){
    teamOne = one;
    teamTwo = two;
    activeTeam = teamOne;
}

public void recordPlay(int score) {

}

public String getScore() {
    return teamOneScore + "-" + teamTwoScore + "-" + activeTeam;
}

}
