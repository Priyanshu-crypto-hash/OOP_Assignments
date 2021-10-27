
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
class Dice {
    public static void format(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Hit enter to roll the dice");
        String space = scn.nextLine();

    }
    public static int rollDice() {

        return ThreadLocalRandom.current().nextInt(1, 2 + 1);
    }

}
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
    private final Player p1;
    Floor(Player play1){
        this.p1=play1;
    }
    protected Player getP1() {
        return p1;
    }
    public void levelMessage(){
        System.out.println("Player position Floor-"+this.getP1().getPlayerPosition());
        System.out.println(this.getP1().getPlayerName()+" has reached an Empty Floor");
        System.out.println("Total points "+this.getP1().getTotalPoints());
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
        System.out.println("Total points "+this.getP1().getTotalPoints());
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
        System.out.println("Total points "+this.getP1().getTotalPoints());
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
        System.out.println("Total points "+this.getP1().getTotalPoints());
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
        System.out.println("Total points "+this.getP1().getTotalPoints());
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


    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the player name and hit enter");
        String name = scn.nextLine();

        Player player1 = new Player(name);
        System.out.println("The game setup is ready");
        Floor f = new Floor(player1);


        while(true){
            Dice.format();
            int diceValue = Dice.rollDice();
            System.out.println("Dice gave "+diceValue);
            if (diceValue==1){
                while(true){
                    if (f.getP1().getPlayerPosition()==0){
                        f.changePoints();
                        f.levelMessage();
                        Dice.format();
                    }
                        int _rollDice = Dice.rollDice();
                        System.out.println("Dice gave "+_rollDice);

                        if((f.getP1().getPlayerPosition()+_rollDice!=2 && f.getP1().getPlayerPosition()+_rollDice!=5 && f.getP1().getPlayerPosition()+_rollDice!=8 && f.getP1().getPlayerPosition()+_rollDice!=11 &&f.getP1().getPlayerPosition()+_rollDice!=13) && (f.getP1().getPlayerPosition()+_rollDice<13) ){
                            f.changePosition(_rollDice);
                            f.changePoints();
                            f.levelMessage();
                            Dice.format();
                        }
                        else if (f.getP1().getPlayerPosition()+_rollDice==2){
                            ElevatorLadder e = new ElevatorLadder(player1);
                            f.changePosition(_rollDice);
                            e.changePoints();
                            e.levelMessage();
                            e.changePosition(_rollDice);
                            f.changePoints();
                            f.levelMessage();
                            Dice.format();
                        }
                        else if (f.getP1().getPlayerPosition()+_rollDice==5){
                            SnakeFloor s = new SnakeFloor(player1);
                            f.changePosition(_rollDice);
                            s.changePoints();
                            s.levelMessage();
                            s.changePosition(_rollDice);
                            f.changePoints();
                            f.levelMessage();
                            Dice.format();
                        }
                        else if (f.getP1().getPlayerPosition()+_rollDice==8){
                            LadderFloor l = new LadderFloor(player1);
                            f.changePosition(_rollDice);
                            l.changePoints();
                            l.levelMessage();
                            l.changePosition(_rollDice);
                            f.changePoints();
                            f.levelMessage();
                            Dice.format();
                        }
                        else if (f.getP1().getPlayerPosition()+_rollDice==11){
                            KingCobraFloor k = new KingCobraFloor(player1);
                            f.changePosition(_rollDice);
                            k.changePoints();
                            k.levelMessage();
                            k.changePosition(_rollDice);
                            f.changePoints();
                            f.levelMessage();
                            Dice.format();
                        }

                        else if(f.getP1().getPlayerPosition()+_rollDice==13){
                            f.changePosition(_rollDice);
                            f.changePoints();
                            f.levelMessage();
                            System.out.println("Game Over");
                            System.out.println(f.getP1().getPlayerName()+" accumulated "+f.getP1().getTotalPoints()+" points");
                            System.out.println("---------------------------------------------------------------");
                            break;
                        }
                        else{
                            System.out.println("Player Cannot Move");
                            Dice.format();
                        }
                 }
                break;
            }
            else {
                System.out.println("Game cannot start until you get 1");
            }
        }


    }
}
