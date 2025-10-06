import java.util.Scanner;
public class Main {

    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = true;
        int lucasN = 0;
        int counter = 0;

        lucasProcess[] objects= new lucasProcess[100];
        while (stop == true) {
            if (args.length == 0) {
                System.out.println("Please provide the N-Lucas number");

                lucasN = scanner.nextInt();


            } else {
                System.out.println("Data provided:");
                for (int i = 0; args.length > i; ) {
                    System.out.println(args[i]);


                    i++;


                }
                try {
                    lucasN = Integer.parseInt(args[0]);
                } catch (NumberFormatException e) {
                    System.out.println("u cannot put a character here int only" + e.getMessage());
                    System.out.println("here is how it would work if u did not screw up and typed in 0");
                    lucasN = 0;
                }

                if (args.length > 1) {
                    System.out.println("Error cause man u have to input only 1 number and u typed more so the first number will be used");
                }


            }

            objects[counter] = new lucasProcess(lucasN);
            objects[counter].Luca_process();
            System.out.println("Variables of the object");
            System.out.println("LucasFin ended up " + objects[counter].getLucasFin());
            System.out.println("LucasFirst ended up " + objects[counter].getlucasFirst());
            System.out.println("LucasNext ended up " + objects[counter].getLucasNext());
            System.out.println("LucasPlusone ended up " + objects[counter].getLucasPlusone());





           if(args.length>0){
               scanner.close();
               System.exit(0);
           }
            System.out.println("do u wish to stop?");
            System.out.println("enter true or false");

            stop=scanner.nextBoolean();

         counter++;

        }

        scanner.close();
    }

}
