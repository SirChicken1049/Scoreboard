public class Team {
    private String name;
    private int wins;
    public Team(String n) {
        name = n;
    }
    public void wins(){
        wins++;
    }
    public int getWins(){
        return wins;
    }
    public String toString() {
        return name;

    }
}
