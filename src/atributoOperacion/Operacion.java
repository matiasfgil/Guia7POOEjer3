package atributoOperacion;

import java.util.Scanner;

public class Operacion {

    private double Numero1;
    private double Numero2;

    //constructor vacio
    public Operacion() {
    }

    //constructor por parametros
    public Operacion(double Numero1, double Numero2) {
        this.Numero1 = Numero1;
        this.Numero2 = Numero2;
    }

    //metodo set
    public void setNumero1(double Numero1) {
        this.Numero1 = Numero1;
    }

    public void setNumero2(double Numero2) {
        this.Numero2 = Numero2;
    }

    //metodo get
    public double getNumero1() {
        return Numero1;
    }

    public double getNumero2() {
        return Numero2;
    }

    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el valor del primer numero");
        this.setNumero1(leer.nextDouble());

        System.out.println("Ingrese el valor del segundo numero");
        this.setNumero2(leer.nextDouble());

    }

    public double sumar() {
        return this.getNumero1() + this.getNumero2();
    }

    public double restar() {
        return this.getNumero1() - this.getNumero2();
    }

    public double multiplicar() {
        if (this.getNumero1() == 0 || this.getNumero2() == 0) {
            System.out.println("Error");
            return 0;

        } else {
            return this.getNumero1() * this.getNumero2();

        }
    }

    public double dividir() {
        if (this.getNumero2() == 0) {
            System.out.println("Error");
            return 0;

        } else {
            return this.getNumero1() / this.getNumero2();

        }
    }
}
