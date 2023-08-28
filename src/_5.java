/*
Gæt et tal: 8
Tallet jeg tænker på er højere.
Gæt et tal: 13
Tallet jeg tænker på er lavere.
Gæt et tal: 11
Det er det rigtige tal! Du brugte 3 forsøg.

 */


public class _5 {
    public static void main(String[] args) {

        int mit_tal = (int) (Math.random()*100)+1;
        java.util.Scanner Tastatur = new java.util.Scanner(System.in);

        System.out.println();
        System.out.println("Heyo velkommen til Gaet-et-tal-Spillet!"+"\n");
        System.out.println("Gæt mit hemmelige tal, det er mellem 1-100. :D");
        int FoersteGaet = Tastatur.nextInt();


        if (FoersteGaet != mit_tal) {
            if (FoersteGaet>mit_tal) {
                System.out.println("Tallet jeg tænker på er mindre"+"\n");
            } else {
                System.out.println("Tallet jeg tænker på er højere"+"\n");
            }

            System.out.println("Gæt endelig igen en gang");
            System.out.println("Du har to gæt tilbage ;)"+"\n");

            int AndetGaet = Tastatur.nextInt();

                if (AndetGaet>mit_tal) {
                    System.out.println("Tallet jeg tænker på er mindre"+"\n");
                } else {
                    System.out.println("Tallet jeg tænker på er højere"+"\n");
                }

                System.out.println("Gæt endelig igen en gang.");
                System.out.println("Uh, du har et sidste gæt tilbage!"+"\n");


                    int TredjeGaet = Tastatur.nextInt();

                    if (AndetGaet>mit_tal) {
                        System.out.println("Tallet jeg tænker på er mindre"+"\n");
                    } else {
                        System.out.println("Tallet jeg tænker på er højere"+"\n");
                    }

                    System.out.println("Desværre, det var dit sidste gæt");
                    System.out.println("Tak for forsøget, du kan altid give spillet et forsøg til! :D"+"\n");



        }
        else {
            System.out.println("Tillykke du gættede rigtigt!");
            System.out.println("Tallet var: "+mit_tal);
        }
    }
}