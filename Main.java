package who.wants.to.be.a.millionaire;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList arrQ = new ArrayList();
        arrQ.add("How many seconds are in a minute?");
        arrQ.add("What makeup product makes eyelashes appear longer?");
        arrQ.add("What city contains the Eiffel Tower?");
        arrQ.add("Who wasn't a member of the Beatles?");
        arrQ.add("What gas makes voices sound higher when inhaled?");

        ArrayList arrA = new ArrayList();
        arrA.add("60");
        arrA.add("Mascara");
        arrA.add("Paris");
        arrA.add("Justin Timberlake");
        arrA.add("Helium");

        ArrayList arrV0 = new ArrayList();
        arrV0.add("30");
        arrV0.add("1");
        arrV0.add("60");
        arrV0.add("300");

        ArrayList arrV1 = new ArrayList();
        arrV1.add("Mascara");
        arrV1.add("Blush");
        arrV1.add("Foundation");
        arrV1.add("Lipstcik");

        ArrayList arrV2 = new ArrayList();
        arrV2.add("Sydney");
        arrV2.add("Los Angeles");
        arrV2.add("New York City");
        arrV2.add("Paris");

        ArrayList arrV3 = new ArrayList();
        arrV3.add("Jhon Lennon");
        arrV3.add("Paul McCartney");
        arrV3.add("Ringo Star");
        arrV3.add("Justin Timberlake");

        ArrayList arrV4 = new ArrayList();
        arrV4.add("Oxygen");
        arrV4.add("Nitrogen");
        arrV4.add("Sulfur Hexafluoride");
        arrV4.add("Helium");

        ArrayList arrV = new ArrayList();
        arrV.add(arrV0);
        arrV.add(arrV1);
        arrV.add(arrV2);
        arrV.add(arrV3);
        arrV.add(arrV4);

        for (int i = 0; i < arrQ.size(); i++) {
            System.out.println(arrQ.get(i));
            System.out.println(arrV.get(i));
            String answer = sc.nextLine();
            if (answer.equals(arrA.get(i))) {
                System.out.println("Correct answer! Congrats :)");
                System.out.println();
            } else if (!(answer.equals(arrA.get(i)))) {
                System.out.println("Wrong answer! You lose :(");
                System.exit(0);
            }
            if (i == arrQ.size() - 1 && answer.equals(arrA.get(i))) {
                System.out.println("You win! :)");
            }

        }

    }

}
