class RationalNumber {
    private int numerator;
    private int denominator;

    // Constructor
    public RationalNumber(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    // Getters
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // Simplify the rational number
    private void simplify() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;
        if (denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
    }

    // Find greatest common divisor
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // Add two rational numbers
    public RationalNumber add(RationalNumber other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    // Subtract two rational numbers
    public RationalNumber subtract(RationalNumber other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    // Multiply two rational numbers
    public RationalNumber multiply(RationalNumber other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    // Divide two rational numbers
    public RationalNumber divide(RationalNumber other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    // Convert to floating point
    public double toDouble() {
        return (double) numerator / denominator;
    }

    // Absolute value
    public RationalNumber abs() {
        return new RationalNumber(Math.abs(numerator), Math.abs(denominator));
    }

    // Compare two rational numbers
    public int compareTo(RationalNumber other) {
        double thisValue = this.toDouble();
        double otherValue = other.toDouble();
        return Double.compare(thisValue, otherValue);
    }

    // String representation of the rational number
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}