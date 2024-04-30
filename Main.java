import java.io.FileInputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Какой долг?");
        Scanner sc = new Scanner(System.in);
        double debt = sc.nextDouble();

        System.out.println("Какая ставка?");

        Scanner scc = new Scanner(System.in);
        double rate = scc.nextDouble();

        double resultPerMouth = debt / 100 * rate / 12;
        double resultPerDay = debt / 100 * rate / 12 / 30;

        resultPerMouth = Math.round(resultPerMouth * 100);
        resultPerMouth = resultPerMouth/100;

        resultPerDay = Math.round(resultPerDay * 100);
        resultPerDay = resultPerDay/100;

        System.out.println("Долг в месяц - " + resultPerMouth + "\nДолг в день - " + resultPerDay);
    }
}