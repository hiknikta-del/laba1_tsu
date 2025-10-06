public class lucasProcess {

   private int lucasFirst = 2;
    private int lucasNext = 1;
    private int lucasFin = 0;
    private int lucasPlusone = 0;
    private int NofLucas;

    public  lucasProcess(int NofLucas){
        this.NofLucas= NofLucas;
    }

public int getlucasFirst(){
        return(lucasFirst);
    }

    public int getLucasNext() {
        return lucasNext;
    }

    public int getLucasFin() {
        return lucasFin;
    }

    public int getLucasPlusone() {
        return lucasPlusone;
    }



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
