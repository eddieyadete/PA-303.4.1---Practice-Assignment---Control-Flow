import java.util.Scanner;

//https://github.com/eddieyadete/PA-303.4.1---Practice-Assignment---Control-Flow.git
public class ControlFlow {
    int x;

    public void ifStatement() {
//    Scanner in = new Scanner(System.in);
//    System.out.print("Enter X: ");
        x= 7;
    if(x < 10){
        x = 15;
        System.out.println("less than 10: " + x);
    }
    }
    public void ifElseStatement() {
//            Scanner in = new Scanner(System.in);
        x = 11;
        if (x < 10) {
            System.out.println("less than 10: " + x);

        } else {
            x = 15;
            System.out.println("more than 10: " + x);
        }

    }
    public void ifElseIfStatement() {
        x = 15;
        if (x < 10) {
            System.out.println("Greater than 10");

        } else if (x > 10 && x < 20) {
            System.out.println("between 10 and 20");

        } else {
            System.out.println("Greater than or equal to 20");

        }
    }
    public void ifElseIfElseStatement() {
        x = 5;
        if (x < 10 || x > 20){
            System.out.println("out of range");
        }else {
            System.out.println("in range");
        }
    }
    public void nestIFElseStatement(){
        int x;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        if(x > 90 && x <100){
            System.out.println("A");
        }else if(x > 80 && x <90){
            System.out.println("B");
        }else if(x > 70 && x <80){
            System.out.println("C");
        }else if(x > 60 && x <70){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
    public void switchStatement() {

            Scanner scanner = new Scanner(System.in);

            // Prompt the user for input
            System.out.print("Enter a number between 1 and 7: ");
            int day = scanner.nextInt();

            // Use a switch statement to determine the weekday
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Out of range");
                    break;
            }

            scanner.close();
        }
    public void incomeTax1(){
        Scanner in = new Scanner(System.in);
        System.out.println("Select your filing status:");
        System.out.println("1. Single");
        System.out.println("2. Married Filing Jointly");
        System.out.println("3. Married Filing Separately");
        System.out.println("4. Head of Household");
        int status = in.nextInt();


        System.out.println("please input user income: ");
        double income = in.nextDouble();

        double tax = 0;
        switch(status){
            case 1:
                if(income >= 8350) tax= income * 0.10;
                else if(income >= 33950) tax = income * 0.15;
                else if(income >= 82250) tax = income * 0.25;
                else if(income >= 171550) tax = income * 0.28;
                else if (income >= 372950) tax = income * 0.33;
                else tax = 108216 + (income - 372950) * 0.35;

                break;
            case 2:
                if (income <= 16700) tax = income * 0.10;
                else if (income <= 67900) tax = 1670 + (income - 16700) * 0.15;
                else if (income <= 137050) tax = 9350 + (income - 67900) * 0.25;
                else if (income <= 208850) tax = 26637 + (income - 137050) * 0.28;
                else if (income <= 372950) tax = 46741 + (income - 208850) * 0.33;
                else tax = 101085 + (income - 372950) * 0.35;

                break;
            case 3:
                if (income <= 8350) tax = income * 0.10;
                else if (income <= 33950) tax = 835 + (income - 8350) * 0.15;
                else if (income <= 68525) tax = 4675 + (income - 33950) * 0.25;
                else if (income <= 104425) tax = 13318.5 + (income - 68525) * 0.28;
                else if (income <= 186475) tax = 23370.5 + (income - 104425) * 0.33;
                else tax = 50542.5 + (income - 186475) * 0.35;
                break;


            case 4: // Head of Household
                if (income <= 11950) tax = income * 0.10;
                else if (income <= 45500) tax = 1195 + (income - 11950) * 0.15;
                else if (income <= 117450) tax = 6227.5 + (income - 45500) * 0.25;
                else if (income <= 190200) tax = 24215 + (income - 117450) * 0.28;
                else if (income <= 372950) tax = 44585 + (income - 190200) * 0.33;
                else tax = 104892.5 + (income - 372950) * 0.35;
                break;

                default:
                    System.out.println("invalid status");
                    in.close();
                    return;
        }
                    System.out.printf("invalid tax $%.2f%n", tax);
                    in.close();


        }
    }



