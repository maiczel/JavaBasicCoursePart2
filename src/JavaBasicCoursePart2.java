public class JavaBasicCoursePart2 {
    public static void main(String[] args){

        // CZESC 2 - KURS PODSTAWOWY JAVA AUDAICTY

        boolean isCold = false; // w tym przypadku if nie zostanie uruchomine ponieważ wartośc boolean is false
        if (isCold) {
            System.out.println("Please wear the coat");
        }

        /* VARIABLE SCOPE - Scope is the block or range of code where a certain variable can be used and referred to.
        Pamietaj - zawsze musisz zadeklarowac zmienna zanim uzyjesz ja w kodzie if, poniewaz if testuje zakres zmiennej
        w tym przypadku jest to zakres True/False. Jesli dodamy w bloku "if" jakas dodatkowa zmienna to nie mozemy
        uzywać jej poza blokiem bo nalezy ona tylko do tego konkretnego bloku, oddzielonego przez klamry*/

        //LEKCJA 9 ELSE STATEMENT

        /* Else statement can be placed only after "if" statement. It tells what program should do as an alternative.
        using this together is called else-if statement" */

        boolean isLightGreen = false; //true or false
        boolean isLightYellow = true;
        if (isLightGreen) {
            //traffic light is green
            System.out.println("Drive!");
        } else if (isLightYellow) {
            //Light is not green but yellow
            System.out.println("Slow down.");
        } else {      //zauważ, że else ma swoj osobny block który pisany jest po zamknięciu bloku ifa
            //light is NOT green
            System.out.println("Stop. ");
        } // W zależności od tego jaki wariant boolean przyjmie, tylko jeden blok codu moze byc wykonany

        // LEKCJA 12
        /*
        <=  less-than/equal
        >=  more-than/equal
        ==  equal
        !=  not equal
          */

        // LEKCJA 16 - BILETY DO MUZEUM

        //znizka na bilet obowiazuje dla osob majacych 15 lub mniej, majacych wiecej niz 60 lub dla studentow.

        int ticketPrice = 10;
        int age = 26;
        boolean isStudent = false;

        if (age <= 15) {
            // age is less or equal to 15
            ticketPrice = 5;
            System.out.println("Ticket price is: " + ticketPrice);
        } else if (age > 60) {
            ticketPrice = 5;
            // age is greater than 60
            System.out.println("Ticket price is: " + ticketPrice);
        } else if (isStudent) {
            ticketPrice = 5;
            // The person is student
            System.out.println("Ticket price is: " + ticketPrice);
        } else {
            ticketPrice = 10;
            // The persone is not student and is older that 15 and younger than 60
            System.out.println("Ticket price is: " + ticketPrice);
        }
        // Lekcja 17
        /* można to zapisać prościej za pomocą operatorów logicznyh

       LOGICAL OPERATORS
       (1) AND &&
       (2) OR ||
       (3) NOT !

       Order of Operations:
       !   wil operated firs
       &&  will operated second
       ||  will operated third
         */

        // LEKCJA 21
        // NESTED IF STATEMENTS - IF zagnieżdżony w IF

        boolean action = true;
        boolean romance = true;
        boolean horror = false;
        boolean comedy = true;

        if (action && romance) {
            // includes action and romance
            System.out.println("This movie includes action and romance. ");
            if (comedy || horror) {
                //everyone preferences have been met!
                System.out.println("This movie includes comedy or horror!");
            }
        }
        // LEKCJA 23 SWITCH STATEMENT  na przykłądzie COFFEE MACHINE

        int passcode = 629;
        String coffeeType;

        if (passcode == 555) {
            //espresso passcode
            coffeeType = "Espresso";
        } else if (passcode == 312) {
            //vanilla passcode
            coffeeType = "Vanilla Latte";
        } else if (passcode == 629) {
            //drip coffe code
            coffeeType = "Drip coffee";
        } else {
            //unknows passcode
            coffeeType = "Unknown";
        }

        /* Caly ten code mozna zapisac zwiężlej za pomoca switch statement

            Switch statement  A switch statement let’s you check the value of a certain variable
            (like our coffee maker passcode)  and test it for equality against a list of possible values that it can take.
            Each of these specific values is called a case and you can program different behavior for each case.
            In Java this looks like this: */

        switch (passcode) {
            case 555:
                coffeeType = "Espresso";
                break;
            case 312:
                coffeeType = "Vanilla latte";
                break;
            case 629:
                coffeeType = "Drip coffe";
                break;
            default:
                coffeeType = "Unknown";
                break;
        }
        System.out.println(coffeeType);
    }
}
