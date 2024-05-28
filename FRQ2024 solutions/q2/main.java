public class Scoreboard {
    private String team1Name;
    private String team2Name;
    private int team1Score;
    private int team2Score;
    private String activeTeam;
    public Scoreboard(String team1Name, String team2Name) {
        this.team1Name = team1Name;
        this.team2Name = team2Name;
        this.team1Score = 0;
        this.team2Score = 0;
        this.activeTeam = team1Name;
    }
    public void recordPlay(int points) {
        if (points > 0) {
            if (activeTeam.equals(team1Name)) {
                team1Score += points;
            } else {
                team2Score += points;
            }
        } else {
            switchActiveTeam();
        }
    }
