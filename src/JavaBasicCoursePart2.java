public class JavaBasicCoursePart2 {
    public static void main(String[] args)
    {

        // JAVA BASIC COURSE UDACITY.COM


        String driver; // declaration statement
        driver = "Hamish";
        System.out.println(driver);
        driver.length(); // komenda, kltóra liczy ilośc znaków przechowywanych w zmiennej driver
        int letters = driver.length();
        System.out.println(letters);
        driver.toUpperCase(); // komenda, która zmienia znaki przechowywane w zmiennej driver na WIELKI LITERY
        driver = driver.toUpperCase(); //
        System.out.println(driver);

        // STRING CONCATENATION is use for joining strings together or join variables with strings

        String driverFirstName;
        driverFirstName = "Hamish";
        String driverLastName = "Blake";
        String driverFullName = driverFirstName + " " + driverLastName;
        System.out.println(driverFullName);

        // STRING CONCETENATION used to join strings with numbers (variables)

        int stops;
        int fare;
        stops = 0;
        fare = 0;
        stops = stops + 1;
        fare = fare + 5;
        stops = stops + 1;
        fare = fare + 3;
        stops = stops + 1;
        fare = fare + 7;
        System.out.println(stops);
        System.out.println(fare);
        System.out.println("The bus made $" + fare + " after " + stops + " stops");

        // LEKCJA 14

        String language = "java";
        String feeling = "Love";
        feeling = feeling.toLowerCase();
        language = language.toUpperCase();
        System.out.println(" I " + feeling + " " + language);

        // LEKCJA 15
        /* Camel Case for example driverFirstName

        Są dwa przykłady Camel Case  1. lowerCamelVase and 2. UpperCamelCase
        They are both commonly use in Java but in different places

        Remember! you should always follow the lower camel case when you're creating a new variable name

        VARIABLE NAME RULES

        (1) variable names are case snesitive
        (2) start variable names with a letter
        (3) cannot have white spaces !!
        (4) Declare and initalize variables in one line (good practice) np. String player = "Jack"
         */

        // LEKCJA 16

        /* (1) int maxInt       = 1234567890;  int może miec maksymalnie 10 znaków
           (2) long maxLong     = 1234567890*10000000;
           (3) double fraction  = 99.275;
           (4) String  fullText = "(b) WWII ended 1945";
           (5) char answer      = 'b';  This is just one character so it couldn't be '10'
           (6) boolean fact     = true/false;  is storing result of the decision

         */
        // LEKCJA 18

        int x = 2 + 3;      // addition
        int y = 4 + 5;      // substraction
        int temp = -20;
        int days = 7 * 4;   // mlultuplication
        double div = 5 / 2;// division  wynikiem tego działanie będzie 2 dopoki jedna z liczb nie bedzie z przecinkiem
        double div1 = 5 / 2.0; // tutaj wynik wyjdzie 2.5 bo jedna z liczb jest zmiennoprzecinkowa (czyli jest doublem)

        // LEKCJA 19 CASTING - RZUTOWANIE NP DOUBLA NA INTIGERA LUB NA ODWRÓT

        double current = 17;
        double rate = 1.5;
        double future = current * rate;
        System.out.println(future);
        int approx = (int) future; // RZUTOWANIE DOUBLE NA INTIGERA
        System.out.println(approx);

        double accurate = (double) x / y; //rzutowanie intigera na double
        System.out.println(accurate);

        // Tasks - JAVA BASIC COURSE - PART 1

        //tak 3.
        int bankBalance = 500;
        bankBalance = bankBalance + 250;
        bankBalance = bankBalance - 100;
        System.out.println(bankBalance);

        //Task 4.
        System.out.println(2.0 * (5 / 2)); // wynik wychodzi 4 bo java pomija reszte przy dizeleniu dwoch intigerow

        //Task 5.
        int day;
        day = 9;
        String month;
        month = " kwiecień ";

        // Task 6
        String firstName = "Tomasz";
        String lastName = "Machaj";
        String fullName = firstName + " " + lastName;
        int quantiti = fullName.length();
        System.out.println("Hello, my name is" + " " + fullName + ". There are" + " " + quantiti + " letters in my name");

        //TASK 7

        double fahrenheit = 55.0;
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(celsius);
    }
}
