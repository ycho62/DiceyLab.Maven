public class Simulation {
    private int numOfDice;
    private int timesRolled;
    private Dice dice;
    private Bins bin;
    private int lowest;
    private int highest;

    public static void main(String[] args) {
        Simulation sim = new Simulation(2,1000000);
        sim.runSimulation();
        sim.printResults();
    }

    public Simulation(int numberDice, int timesThrown) {
        this.numOfDice = numberDice;
        this.timesRolled = timesThrown;
        this.dice = new Dice(numberDice);
        this.lowest = numberDice;
        this.highest = numberDice * 6;
        this.bin = new Bins(lowest, highest);
    }

        void runSimulation() {
            for (int i = 0; i < timesRolled; i++) {
                bin.increment(dice.tossAndSum());
            }
        }
        public void printResults() {
            String stars = "";
            int binRolled = 0;
            double percent = 0.00;
            int binNum = 2;


            System.out.println("*** \nSimulation of " + numOfDice
                    + " dice tossed for " + timesRolled + " times. \n***");

            for (int i = 0; i <=((highest-lowest)); i++) {
                binRolled = bin.getBin(i +2);
                percent = ((double) binRolled / timesRolled);

                for (int j = 0; j < (Math.round(percent* 100)); j++) {
                    stars += "*";
                }
                System.out.println(String.format("%3d :  %10d:  %.2f %s", (lowest+i), binRolled, percent, stars ));
                stars = "";
            }
        }
    }






