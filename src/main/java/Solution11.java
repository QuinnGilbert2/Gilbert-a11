import java.util.*;
public class Solution11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many Euros are you exchanging? ");
        double euros = in.nextDouble();
        System.out.print("What is the exchange rate? ");
        double rate = in.nextDouble();
        System.out.printf("%f euros at an exhange rate of %f is %.2f\n USD",euros,rate,(double)Math.ceil(euros*rate*100)/100);
    }
}
/*
Input Euros
Input Rate
dollars = Euros*rate
round up with ceiling(dollars*100)
print result
 */