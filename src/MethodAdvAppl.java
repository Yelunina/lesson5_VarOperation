public class MethodAdvAppl {
    public static void main(String[] args) {
        double a = pi();
        System.out.println(a);
        long d = day();
        System.out.println(d);
        printResult(a);
        printResult(d);
        a = circleLength(10);
        printResult(a);
        a = circleLength(25);
        System.out.println(a);
    }

    private static double pi() {
        double res = 3.1415926;
        return res;
    }

    public static long day() {
        long duration = 1000 * 60 * 60 * 24;
        return duration;
    }
    public static void printResult(double a){
        System.out.print("Result = ");
        System.out.println(a);
    }
    public static double circleLength(double radius){
        double result = 2*pi()*radius;
        return result;
    }

}
