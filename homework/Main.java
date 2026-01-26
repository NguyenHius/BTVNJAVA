package main.homework;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();

        System.out.println("Nhap phan so thu nhat:");
        f1.input();

        System.out.println("Nhap phan so thu hai:");
        f2.input();

        System.out.print("Phan so 1: ");
        f1.print();

        System.out.print("Phan so 2: ");
        f2.print();

        System.out.print("Tong: ");
        f1.add(f2).print();

        System.out.print("Hieu: ");
        f1.sub(f2).print();

        System.out.print("Tich: ");
        f1.mul(f2).print();

        System.out.print("Thuong: ");
        f1.div(f2).print();

        System.out.print("Nghich dao phan so 1: ");
        f1.inverse().print();
    }
}
