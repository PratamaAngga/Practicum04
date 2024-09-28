import java.util.Scanner;
public class ImplementationFlowchart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int battleRange;

        System.out.println("Input your battle range: ");
        battleRange = sc.nextInt();

        if (battleRange <= 5) {
            System.out.println("You should use melee weapon");
        } else {
            System.out.println("You should use ranged weapon");
        }
    }
}
