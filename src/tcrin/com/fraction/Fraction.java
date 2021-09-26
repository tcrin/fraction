package tcrin.com.fraction;

import java.util.ArrayList;
import java.util.Random;

public class Fraction implements Comparable<Fraction> {
    private int numerator;
    private int denominator;

    Random random = new Random();
    ArrayList arrayList = new ArrayList();

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void createFraction(int n) {
        for (int i = 0; i < n; i++) {
            int x = random.nextInt(11);
            this.numerator = x;
            do {
                int y = random.nextInt(11);
                this.denominator = y;
            } while (this.denominator == 0);
            arrayList.add(this.numerator + "/" + this.denominator);
        }

    }

    public void displayFraction() {
        System.out.println("Sort fraction list:");
//        Collections.sort(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            if (i == 0) {
                System.out.print("[ ");
            }
            System.out.print(arrayList.get(i));
            if (i == arrayList.size() - 1) {
                System.out.print(" ]\n");
            } else {
                System.out.print(" , ");
            }
        }
    }

    double kq = (double) this.numerator / this.denominator;

    @Override
    public int compareTo(Fraction o) {

        if ((this.numerator / this.denominator) > o.kq)
            return 1;
        if ((this.numerator / this.denominator) < o.kq)
            return -1;
        return 0;
    }
}
