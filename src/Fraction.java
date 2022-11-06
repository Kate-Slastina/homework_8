public class Fraction {
    private int numerator;
    private int denominator;

    Fraction(int numerator, int denominator){
        if(denominator==0){
            System.out.println("Error");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        this.normalize();
        System.out.println(toString());
    }

    Fraction(int num){
        this(num, 1);
    }
    Fraction(){
        this(0, (int) (Math.random()*78));
    }

    Fraction(double numerator){
        this.denominator = 1;
        while (numerator%10 !=0){
            numerator*=10;
            denominator*=10;
        }
        this.numerator = (int)numerator;
        this.normalize();
        System.out.println(toString());
    }
    Fraction(Fraction f){
        this(f.numerator, f.denominator);
    }

        @Override
    public String toString(){
        return numerator + "/" + denominator;
    }
    double toDecimal(){
        return (double) numerator/denominator;
    }
    private  int getGed(){
        int a = numerator;
        int b = denominator;
        while (a != 0 && b !=0){
            if (a>b){
                a%=b;
            }
            else {
                b%=a;
            }
        }
        return a+b;
    }
    void normalize(){
        int gsd = getGed();
        numerator /= gsd;
        denominator /= gsd;
    }
    public void sum(Fraction f){
        numerator = numerator*f.denominator + f.numerator*denominator;
        denominator *= f.denominator;
        normalize();
    }

    public void mult(Fraction f){
        numerator = numerator*f.numerator;
        denominator *= f.denominator;
        normalize();
        System.out.println((double) numerator/denominator);
    }
}
