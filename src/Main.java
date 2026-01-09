public class Main {
    public static void main(String[] args) {
        String info;
        Scoreboard game = new Scoreboard("Red", "Blue");
        info = game.getScore();
        System.out.println(info);
        game.recordPlay(1);
        info = game.getScore();
        System.out.println(info);
        game.recordPlay(0);
        info = game.getScore();
        System.out.println(info);
    }
}