package minutes_to_years;
import java.util.Scanner;
public class Minutes_To_Years {
int minutes;
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter minutes to convert into years and days: ");
        Scanner scan = new Scanner(System.in);
        Minutes_To_Years obj = new Minutes_To_Years();
        obj.minutes = scan.nextInt();
        minutesToYears(obj.minutes);
    }
    public static void minutesToYears(int x){
        int years,days;
        years = x/(525600);
        days = (x%(525600))/1440;
        System.out.println("Number of years = "+years+" and number of days is "+days);
    }
}
