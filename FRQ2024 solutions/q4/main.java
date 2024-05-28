public Location getNextLoc(int row, int col) {
    int nextRow = row + 1;
    int nextCol = col + 1;
    
    if (nextRow <= maxRow && nextCol <= maxCol) {
        Location downLoc = new Location(nextRow, col);
        Location rightLoc = new Location(row, nextCol);
        int downValue = getGridValue(downLoc);
        int rightValue = getGridValue(rightLoc);
    }
     return downValue (rightValue  downLoc : rightLoc);  
}



B
  public int sumPath(int row, int col) {
    int sum = 0;
    Location currentLoc = new Location(row, col);

    while (currentLoc != null) {
        sum += getGridValue(currentLoc); 
        currentLoc = getNextLoc(currentLoc.getRow(), currentLoc.getCol());
    }

    return sum;
}
