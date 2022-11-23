/*Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package mainOperacion;

import atributoOperacion.Operacion;
import java.util.Scanner;

public class EjercicioOperacion {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc;
        Operacion op = new Operacion();
        op.crearOperacion();

        do {
            System.out.println("Ingrese la operacion deseada");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("La suma es " + op.sumar());
                    break;
                case 2:
                    System.out.println("La resta es " + op.restar());
                    break;
                case 3:
                    System.out.println("La multiplicacion es " + op.multiplicar());
                    break;
                case 4:
                    System.out.println("La division es " + op.dividir());
                    break;
            }
        } while (opc != 5);
    }
}
