public class TestPolinomi {
    public static void main(String[] args) {

        Terme a = new Terme(4, 5);
        // a.setCoeficient(9.2);
        System.out.println(a);

        Terme a2 = new Terme(-3.6, 5); // C = Coefincient, e = Exponent:
        System.out.println(a2);

        Terme c = a.sumar(a2);
        System.out.println(c);
    }
}
