package APP;

import entidades.Triangulo;

public class appSOO {
    public static void main(String[] args) {
        Triangulo tri = new Triangulo(3.0,4.0,5.0);
        System.out.println("O valor de P: "+ tri.calcularP());
        System.out.println("O valor da área de P é: "+ tri.calcularArea());
    }
}
