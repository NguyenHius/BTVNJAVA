package main.homework;

import java.util.Scanner;

public class Fraction {
    private int numerator;   // tử số
    private int denominator; // mẫu số

    // Constructor
    public Fraction() {
        numerator = 0;
        denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Getter & Setter
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
        if (denominator != 0)
            this.denominator = denominator;
        else
            System.out.println("Mau so khong duoc bang 0");
    }

    // Input fraction
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        numerator = sc.nextInt();
        do {
            System.out.print("Nhap mau so (khac 0): ");
            denominator = sc.nextInt();
        } while (denominator == 0);
    }

    // Print fraction
    public void print() {
        System.out.println(numerator + "/" + denominator);
    }

    // Find GCD
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // Reduce fraction
    public void reduce() {
        int g = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= g;
        denominator /= g;
    }

    // Inverse fraction
    public Fraction inverse() {
        return new Fraction(denominator, numerator);
    }

    // Add
    public Fraction add(Fraction f) {
        int num = numerator * f.denominator + f.numerator * denominator;
        int den = denominator * f.denominator;
        Fraction result = new Fraction(num, den);
        result.reduce();
        return result;
    }

    // Subtract
    public Fraction sub(Fraction f) {
        int num = numerator * f.denominator - f.numerator * denominator;
        int den = denominator * f.denominator;
        Fraction result = new Fraction(num, den);
        result.reduce();
        return result;
    }

    // Multiply
    public Fraction mul(Fraction f) {
        int num = numerator * f.numerator;
        int den = denominator * f.denominator;
        Fraction result = new Fraction(num, den);
        result.reduce();
        return result;
    }

    // Divide
    public Fraction div(Fraction f) {
        int num = numerator * f.denominator;
        int den = denominator * f.numerator;
        Fraction result = new Fraction(num, den);
        result.reduce();
        return result;
    }
}
