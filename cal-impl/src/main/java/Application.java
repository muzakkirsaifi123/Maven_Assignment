import java.util.Scanner;
public final class Application {
    private Application() {

    }
    /**
     * @param args
     */
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. ADD ");
        System.out.println("2. SUB ");
        System.out.println("3. MUL ");
        System.out.println("4. DIV ");
        int choice = input.nextInt();
        System.out.println("Enter two numbers:");
        int a = input.nextInt();
        int b = input.nextInt();

        final int multi = 3;
        final int max = 4;
        Calculator calci = new Calculator();
        if (choice == 1) {
            calci.add(a, b);
        } else if (choice == 2) {
            calci.sub(a, b);

        } else if (choice == multi) {
            calci.mul(a, b);

        } else if (choice == max) {
            calci.div(a, b);

        } else {
            System.out.println("Wrong Choice");
        }
    }
}