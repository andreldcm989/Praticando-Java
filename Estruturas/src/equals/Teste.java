package equals;

public class Teste {
    public static void main(String[] args) {

        Carro c1 = new Carro("Chevrolet", "Ômega");
        Carro c2 = new Carro("Chevrolet", "Ômega");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println("São iguais? " + c1.equals(c2));

    }
}
