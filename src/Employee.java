import java.util.Scanner ;

    public class Employee {
        // Initializing variables
        private String firstName;
        private String lastName;
        private int age;
        private double salary;

        public Employee() {

            Scanner scan = new Scanner(System.in);                              System.out.println("enter your first name");
            String firstName = scan.nextLine();
            System.out.println(" enter your last name ");
            String last =scan.nextLine();
            System.out.println(" enter your age ");
            int age = scan.nextInt();
            System.out.println(" enter  salary");
            double salary =scan.nextDouble();


        }

       //
        // public String toString() {
            // insert logic for toString method

}
