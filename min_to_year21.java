import java.util.Scanner;
public class min_to_year21 {

	public static void main(String[] Strings) {


        double minInYear = 60 * 24 * 365;

        Scanner sc = new Scanner(System.in);

        System.out.print("enter minutes: ");

        double min = sc.nextDouble();

        long years = (long) (min / minInYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println(years + " years and " + days + " days");
    }
}