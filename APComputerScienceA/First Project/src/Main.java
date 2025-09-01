import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        double coffeePrice = 2.10;
        double teaPrice = 1.60;
        double pastryPrice = 2.75;

        System.out.println("How many coffees would you like?");
        Scanner coffeeAnswer = new Scanner(System.in);
        int coffeeNo = coffeeAnswer.nextInt();
        System.out.println("How many cups of tea would you like?");
        Scanner teaAnswer = new Scanner(System.in);
        int teaNo = teaAnswer.nextInt();
        System.out.println("How many pastries would you like?");
        Scanner pastryAnswer = new Scanner(System.in);
        int pastryNo = pastryAnswer.nextInt();
        System.out.println("So that will be " + coffeeNo + " coffees " + teaNo + " cups of tea and " + pastryNo + " pastries?");
        double subTotal = ((coffeePrice * coffeeNo) + (teaPrice * teaNo) + (pastryPrice * pastryNo));
        double afterVat = subTotal * 1.21;
        int finalPrice = (int)afterVat * 130;
        
        System.out.println("So that will be " + finalPrice / 100.0 + " dollars");
    }
}