package ndr;
// Продемонстрировать перегрузку методов

class Overload {
    void test() {
        System.out.println("Без параметров");
    }

    void test(int a){
        System.out.println("One parament a: " + a);
    }

    void  test (double a, double b){
        System.out.println("Two paraments a and b: " + a +" " + b);
    }

    double test (double a, double b, double c){
        System.out.println("Parament get");
        return a * b * c;
    }

    void test (String a){
        System.out.println("String parament: " + a);
    }

}

public class OverloadDemo {
    public static void main(String[] args) {
        Overload qr = new Overload();
        qr.test();
        qr.test(5);
        qr.test(5.4,6.9);
        qr.test("string");
        System.out.println(qr.test(5.6, 2.0, 1.0));


    }
}
