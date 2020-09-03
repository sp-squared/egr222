package expressions;

public class FtoC {

    public static void main(String[] args){
        final double FREEZING_POINT = 32.0;
        final double DEGREE_RATIO =  5.0 / 9.0;
        double f = 33.3;
        double c = (f - FREEZING_POINT) * DEGREE_RATIO;
        System.out.print("Celsius = " + c);





    }
}
