package kodilla;

public class Player {
    private String firstPlayerName;
    private String secondPlayerName;
    private double difficultyLevel;

    public Player(String firstPlayerName, double difficultyLevel) {
        this.firstPlayerName = firstPlayerName;
        this.difficultyLevel = difficultyLevel;
    }

    public Player(String firstPlayerName, String secondPlayerName) {
        this.firstPlayerName = firstPlayerName;
        this.secondPlayerName = secondPlayerName;
    }

    public String getFirstPlayerName() {
        return firstPlayerName;
    }

    public String getSecondPlayerName() {
        return secondPlayerName;
    }

    public double getDifficultyLevel() {
        return difficultyLevel;
    }
}
