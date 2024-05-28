A.
public void simulateOneDay(int numBirds) {
    for (int i = 0; i < numBirds; i++) {
        recordPlay(1);
    }
    if (Math.random() < 0.3) {
       recordPlay(-5);
    }
}

B.
 public int simulateManyDays(int numBirds, int numDays) {
    int daysWithFood = 0;
    for (int i = 0; i < numDays; i++) {
        simulateOneDay(numBirds);
        if (team1Score > 0 || team2Score > 0) {
            daysWithFood++;
        }
    }
    return daysWithFood;
}
    
