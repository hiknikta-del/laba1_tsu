/**
 * @author Kolya
 * @version 0.03
 *
 * головний клас
 */

import java.util.Scanner;



public class Main {



    static public void main(String[] args) {

        /**
         *
         *
         * @param stop буліан зупиняє програму якщо фолс
         * @param lucasN інт номер числа лукаса вводить користувач
         * @param lucasProcess[] objects статичний масив об'єктів лукасчисло всього 10
         * @param counter int лічильник що переключай на новий об'єкт з масиву об'єктів на новому циклі
         *
         */


        Scanner scanner = new Scanner(System.in);
        boolean stop = true;
        int lucasN = 0;
        int counter = 0;
        lucasProcess[] objects= new lucasProcess[10];



        while (stop == true) {

            /**
             * перевірка чи запустили з командного рядка
             *
             */
            if (args.length == 0) {
                System.out.println("Please provide the N-Lucas number");

                lucasN = scanner.nextInt();


            } else {


                /**
                 * виводимо що нам надав користувач з командного рядка ,
                 * перетворюємо дані в інт ,
                 * якщо були введені не числа ловим помилку і дефолти лукасн до 0
                 *
                 *
                 */


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
/**
 * створюємо об'єкт
 * вкликаємо метод,
 * показуємо гетери
 */
            objects[counter] = new lucasProcess(lucasN);
            objects[counter].Luca_process();
            System.out.println("Variables of the object");
            System.out.println("LucasFin ended up " + objects[counter].getLucasFin());
            System.out.println("LucasFirst ended up " + objects[counter].getlucasFirst());
            System.out.println("LucasNext ended up " + objects[counter].getLucasNext());
            System.out.println("LucasPlusone ended up " + objects[counter].getLucasPlusone());


/**
 * питаємо чи закінчити програму
 */

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
