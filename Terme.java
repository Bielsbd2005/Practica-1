
public class Terme {
    private double coeficient;
    private int exponent;

    /* Métodos constructores */
    public Terme() {
        // Cuerpo del constructor por defecto
    }

    public Terme(double c, int e) {
        coeficient = c;
        exponent = e;
    }

    /* Métodos get/set y toString */
    public void setCoeficient(double c) {
        coeficient = c;
    }

    public double getCoeficient() {
        return coeficient;
    }

    @Override

    // Aquí lo que se hace es pasar a cadena para luego imprimir. Queda hacer más,
    // como que cuando no haya exponente no salga la X
    public String toString() {
        String temp = "";
        temp = coeficient + "X^" + exponent;

        return temp;
    }

    /* Métodos sumar, restar, derivar, multiplicar */
    public Terme sumar(Terme b) {
        Terme resultat = new Terme();

        // tienen que tener el mismo exponente para poder sumarlos
        if (exponent == b.exponent) { // El primer coeficient es a y el segundo es b
            resultat.exponent = exponent;
            resultat.coeficient = coeficient + b.coeficient;
        }

        return resultat;
    }

    public Terme restar(Terme b) {
        Terme resultat = new Terme();

        // tienen que tener el mismo exponente para poder sumarlos
        if (exponent == b.exponent) { // El primer coeficient es a y el segundo es b
            resultat.exponent = exponent;
            resultat.coeficient = coeficient - b.coeficient;
        }

        return resultat;
    }

    public Terme derivar() {
        return null;
    }

    public Terme multiplicar(Terme b) {
        return null;
    }

}
