public class Main {
    public static void main(String[] args) {
        Fraction frac_1 = new Fraction(18, 30);
        System.out.println(frac_1.toDecimal());

        Fraction frac_2 = new Fraction(7);
        System.out.println(frac_2.toDecimal());

        Fraction frac_3 = new Fraction();
        System.out.println(frac_3.toDecimal());
    }
}