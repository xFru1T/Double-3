import java.util.Scanner;
class Double {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print 1 double number: ");
        double a = scanner.nextDouble();
        System.out.print("Print 2 double number: ");
        double b = scanner.nextDouble();
        System.out.print("Print the error between the numbers: ");
        double error = scanner.nextDouble();
        if (Math.abs(a-b) < error) {
            System.out.println("Numbers is equal");
            }
        if (Math.abs(a-b) > error) {
            System.out.println("Numbers is not equal");
            }
        }
    }
