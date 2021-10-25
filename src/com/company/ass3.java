import java.util.concurrent.ThreadLocalRandom;

 class Dice {
    private int faceValue;
    public Dice() {
        roll();
    }
    // Rolls the dice
    public void roll() {
        int curr_faceValue = ThreadLocalRandom.current().nextInt(1, 2 + 1);
        setFaceValue(curr_faceValue);
    }
    private void setFaceValue (int value) {
            faceValue = value;
    }
     public int getFaceValue() {
         return faceValue;
     }
}
class Player{
     private  String  playerName;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

}

class ass3 {
     
    public static void main(String[] args) {
        
    }
}
