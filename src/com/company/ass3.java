import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
class Player{

     private final String playerName;
     private int totalPoints;
     private int playerPosition;
    public int getTotalPoints() {
        return totalPoints;
    }
    protected void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    Player(String name){
         this.playerName=name;
         }
    public int getPlayerPosition() {
        return playerPosition;
    }

    protected void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }
    public String getPlayerName() {
        return playerName;
    }
}
class Floor{
    private Player p1;
    Floor(Player play1){
        this.p1=play1;
    }

    protected Player getP1() {
        return p1;
    }
    public void levelMessage(){
        System.out.println(this.getP1().getPlayerName()+" has reached an Empty Floor");
        System.out.println("Total points"+this.getP1().getTotalPoints());
    }
    public void changePosition(int diceValue){
        this.getP1().setPlayerPosition(this.getP1().getPlayerPosition()+diceValue);
    }
    public void changePoints(){
        this.getP1().setTotalPoints(this.getP1().getTotalPoints()+1);
    }

}
class SnakeFloor extends Floor{

    SnakeFloor(Player play1) {
        super(play1);
    }
    public void levelMessage(){
        System.out.println("Player position Floor-"+this.getP1().getPlayerPosition());
        System.out.println(this.getP1().getPlayerName()+" has reached a normal Snake Floor");
        System.out.println("Total points"+this.getP1().getTotalPoints());
    }
    @Override
    public void changePosition(int diceValue){
        this.getP1().setPlayerPosition(1);
    }
    @Override
    public void changePoints(){
        this.getP1().setTotalPoints(this.getP1().getTotalPoints()-2);
    }



}
class KingCobraFloor extends SnakeFloor{

    KingCobraFloor(Player play1) {
        super(play1);
    }
    @Override
    public void levelMessage(){
        System.out.println("Player position Floor-"+this.getP1().getPlayerPosition());
        System.out.println(this.getP1().getPlayerName()+" has reached King Cobra");
        System.out.println("Total points"+this.getP1().getTotalPoints());
    }
    @Override
    public void changePosition(int diceValue){
        this.getP1().setPlayerPosition(3);
    }
    @Override
    public void changePoints(){
        this.getP1().setTotalPoints(this.getP1().getTotalPoints()-4);
    }
}
class LadderFloor extends Floor{
    LadderFloor(Player play1) {
        super(play1);
    }
    @Override
    public void levelMessage(){
        System.out.println("Player position Floor-"+this.getP1().getPlayerPosition());
        System.out.println(this.getP1().getPlayerName()+" has reached a ladder floor");
        System.out.println("Total points"+this.getP1().getTotalPoints());
    }
    @Override
    public void changePosition(int diceValue){
        this.getP1().setPlayerPosition(10);
    }
    @Override
    public void changePoints(){
        this.getP1().setTotalPoints(this.getP1().getTotalPoints()+2);
    }
}
class ElevatorLadder extends  LadderFloor{
    ElevatorLadder(Player play1) {
        super(play1);
    }
    @Override
    public void levelMessage(){
        System.out.println("Player position Floor-"+this.getP1().getPlayerPosition());
        System.out.println(this.getP1().getPlayerName()+" has reached elevator floor");
        System.out.println("Total points"+this.getP1().getTotalPoints());
    }
    @Override
    public void changePosition(int diceValue){
        this.getP1().setPlayerPosition(10);
    }
    @Override
    public void changePoints(){
        this.getP1().setTotalPoints(this.getP1().getTotalPoints()+4);
    }
}
class ass3 {
    public static  int rollDice() {
        return ThreadLocalRandom.current().nextInt(1, 2 + 1);
    }
    public static void format(){
        System.out.println("Hit enter to roll the dice");
        String space = scn.nextLine();

    }
     public static Scanner scn = new Scanner(System.in);
     ArrayList<Player> playerRecord = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Enter the player name and hit enter");
        String name = scn.next();
        scn.nextLine();
        Player player1 = new Player(name);
        System.out.println("The game setup is ready");
        Floor f = new Floor(player1);
        while(true){
            format();
            int diceValue = rollDice();
            System.out.println("Dice gave "+diceValue);
            if(diceValue==1){
                while(true){
                    int _rollDice = rollDice();
                    if (player1.getPlayerPosition()==1||player1.getPlayerPosition()==3||player1.getPlayerPosition()==4||player1.getPlayerPosition()==6||player1.getPlayerPosition()==7||player1.getPlayerPosition()==9||player1.getPlayerPosition()==10||player1.getPlayerPosition()==12){
                        f.changePosition(_rollDice);
                        f.changePoints();
                        f.levelMessage();
                        format();

                    }
                    else if (player1.getPlayerPosition()==2){
                        ElevatorLadder e = new ElevatorLadder(player1);
                        e.changePosition(diceValue);
                        e.changePoints();
                        e.levelMessage();
                        format();
                    }
                    else if (player1.getPlayerPosition()==5){
                        SnakeFloor s = new SnakeFloor(player1);
                        s.changePosition(diceValue);
                        s.changePoints();
                        s.levelMessage();
                        format();

                    }
                    else if (player1.getPlayerPosition()==8){
                        LadderFloor l = new LadderFloor(player1);
                        l.changePosition(diceValue);
                        l.changePoints();
                        l.levelMessage();
                        format();

                    }
                    else if (player1.getPlayerPosition()==11){
                        KingCobraFloor k = new KingCobraFloor(player1);
                        k.changePosition(diceValue);
                        k.changePoints();
                        k.levelMessage();
                        format();

                    }

                    else if(player1.getPlayerPosition()==13){
                        f.changePosition(_rollDice);
                        f.changePoints();
                        f.levelMessage();
                        format();
                        break;
                    }




                }

            }
            else{
                System.out.println("Game cannot start until you get 1");

            }
        }

        
    }
}
