import java.util.Random;

public class Dice {
    private int numberOfDies;
    Random diceRoll = new Random();
    public Dice(int numberOfDies) {
        this.numberOfDies = numberOfDies;
    }
    public int tossAndSum(){
        int sum = 0;
        for(int i=1; i <= numberOfDies; i++){
           sum +=(diceRoll.nextInt(6)+1);
        }return sum;
    }
}
