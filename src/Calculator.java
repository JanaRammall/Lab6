
    import java.util.Scanner;

    public class Calculator {
        private int num1;
        private int num2;
        private String operator;

        // Constructor to initialize the calculator
        public String Calculator() {


            Scanner scanCalc = new Scanner(System.in);
            System.out.println(" please enter the first number ");
            int num1= scanCalc.nextInt();
            System.out.println(" please enter the second number");
            int num2=scanCalc.nextInt();
            System.out.println();
            System.out.println(" which operation you want to use"+
                    "+ or - or / or * ");
            String operator = scanCalc.nextLine();

            switch(operator){
                case "+" :
                   add(num1,num2);
                    break;
                case "-":
                    subtract(num1,num2);
                    break;
                case "*":
                    multiply(num1,num2);
                    break;
                case  "/":
                    divide(num1,num2);
                default:
                    break;

            }

            public String  add (int a,int b) {

                int result = num1+num2;
                return  num1 + "+" + num2 + "=" + result;
            }

            public String subtract(int a, int b) {

                int result = num1-num2;
                return num1 + "-" + num2 + "=" + result;


            }

            public String multiply(int a, int b) {

                int result = num1*num2;
                return num1 + "*" + num2 + "=" + result;

            }

              public String divide(int a,int b){
            num1 =a;
            num2 =b;


            int result = num1/num2;
            return num1 + "/" + num2 + "=" + result;


        }
}
