package programme_1_calculate;

public class Calculator {
    int a;
    int b;

    public void addition(int a, int b) {
        this.a = a;
        this.b = b;
        int ans = a + b;
        System.out.println("\nAddition of " + a + " and " + b + " is : " + ans);
    }
    public void subtraction(int a, int b) {
        this.a = a;
        this.b = b;
        int ans = a - b;
        System.out.println("\nSubtraction of " + a + " and " + b + " is " + ans);
    }

    public void division(int a, int b) {
        this.a = a;
        this.b = b;
        int ans = a / b;
        System.out.println("\nDivision of " + a + " and " + b + " is " + ans);
    }

    public void multiplication(int a, int b) {
        this.a = a;
        this.b = b;
        int ans = a * b;
        System.out.println("\nMultiplication of " + a + " and " + b + " is " + ans);
    }
    public void calculateResult(int a, int b, char c) {

        if (c == '+') {
            addition(this.a = a, this.b = b);

        } else if (c == '-') {
            subtraction(this.a = a, this.b = b);

        } else if (c == '/') {
            division(this.a = a, this.b = b);

        } else if (c == '*') {
            multiplication(this.a = a, this.b = b);
        }

    }

}

