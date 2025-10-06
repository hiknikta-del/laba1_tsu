/**
 * @author Kolya
 * клас для обробки лукас чисел
 * @param lucasFirst перше число лукаса індекс 0
 * @param lucasNext lheut число лукаса індекс 1
 * @param lucasFin lucas number of the indx provided
 * @param lucasPlusone lucas number of indx +1 from the indx user provided
 * @param NofLucas indx of lucas provided by user
 */


public class lucasProcess {

   private int lucasFirst = 2;
    private int lucasNext = 1;
    private int lucasFin = 0;
    private int lucasPlusone = 0;
    private int NofLucas;


    /**
     * constructor of lucas obj
     */
    public  lucasProcess(int NofLucas){
        this.NofLucas= NofLucas;
    }

    /**
     * geter
     * @return lucasFirst
     */
    public int getlucasFirst(){
        return(lucasFirst);
    }

    /**
     *
     * @return lucasNext;
     */
    public int getLucasNext() {
        return lucasNext;
    }

    /**
     *
     * @return lucasFin;
     */
    public int getLucasFin() {
        return lucasFin;
    }

    /**
     *
     * @return lucasPlusone;
     */
    public int getLucasPlusone() {
        return lucasPlusone;
    }


    /**
     * method processing lucas numbers
     * finds number of the indx provided
     * checks if this true or false n·Lₙ₊₁ > (n+1)·Lₙ
     * presents the results
     *
     *
     * it finds two lucas numbers per loop
     * it defines which one needed by checking if we needed парне чи непарне
     * if the lucasfin is парне то lucas plusone taken from lucasnext because we find two at a time
     * if not find it manually later
     *
     *
     */
    public void Luca_process(){


        if(NofLucas==0){

            lucasFin=lucasFirst;
        } else if (NofLucas==1) {

            lucasFin=lucasNext;

        }

        else {


            for (int i = 0; NofLucas / 2 > i; i++) {
                lucasFirst = lucasFirst + lucasNext;
                lucasNext = lucasFirst + lucasNext;

            }
            if (NofLucas % 2 == 0) {
                lucasFin = lucasFirst;
                lucasPlusone = lucasNext;
            } else {
                lucasFin = lucasNext;
                lucasPlusone= lucasFirst+lucasNext;
            }

        }
     System.out.println(lucasFin + " is the " + NofLucas+"th Number of Lucas");

        if (NofLucas * lucasPlusone> (NofLucas+1)*lucasFin){
            System.out.println("n·Lₙ₊₁ > (n+1)·Lₙ  is true");
        }
        else{System.out.println("n·Lₙ₊₁ > (n+1)·Lₙ  is false");}


    }
}
