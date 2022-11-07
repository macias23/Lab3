import java.lang.Math;
public class pierwiastki {
    public static void main(String[] args) {
        calculateRoot(0,7, 6); // write testing here
    }

    public static void calculateRoot(float a, float b, float c) { // Write calculations for quadratic function
        if (a == 0) {
            calculateRoot(b,c);
            return;
        }
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b - Math.pow(delta, 0.5)) / 2 * a;
            double x2 = (-b + Math.pow(delta, 0.5)) / 2 * a;
            System.out.println("Rozwiązaniem równania są x=" + x1 + "i x=" + x2);
        } else if (delta == 0) {
            float x = -b / 2 * a;
            System.out.println("Rozwiązaniem równania jest x=" + x);
        } else System.out.println("Brak rozwiązań");
    }

    public static void calculateRoot(float a, float b) { // Write calculations for linear function
        if (a == 0 && b != 0) {
            System.out.println("Brak rozwiązań");
            return;
        } else if (a == 0) {
            System.out.println("Rozwiązań równania jest nieskończoność");
            return;
        }
        float x = -b / a;
        System.out.println("Rozwiązaniem równania jest x=" + x);

    }
}
