

public class Bins {
//    Dice dice = new Dice(2);
    private int lowestBin;

    private int[] bin;


    public Bins(int lowest, int highest) {
        this.lowestBin = lowest;
        this.bin = new int[highest-lowest+1];

    }

    public int getBin(int number) {
        return bin[number-lowestBin];
    }

    public void increment(int number) {
        bin[number - lowestBin]++;
    }
}
