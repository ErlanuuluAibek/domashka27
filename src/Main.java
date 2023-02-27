import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        sqrt(scanner.nextDouble());


    }
    public static UnaryOperator<Double> sqrt(double san){
       UnaryOperator<Double>doubleUnaryOperator= Math::sqrt;
        System.out.println(doubleUnaryOperator.apply(san));
        return null ;
    }
}