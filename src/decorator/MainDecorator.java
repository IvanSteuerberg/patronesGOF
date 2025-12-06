package decorator;

public class MainDecorator {
    public static void main(String[] args) {
        // Empezamos con un café simple
        Bebida cafe = new Cafe();
        System.out.println("Bebida: " + cafe.getDescripcion() + " | Costo: " + cafe.getCosto());

        System.out.println("----------------------------------------");

        // Ahora decoramos el café con leche
        Bebida cafeConLeche = new ConLeche(cafe);
        System.out.println("Bebida: " + cafeConLeche.getDescripcion() + " | Costo: " + cafeConLeche.getCosto());

        System.out.println("----------------------------------------");

        // Ahora decoramos el café con leche y azúcar
        // Fíjate cómo envolvemos un decorador con otro
        Bebida cafeCompleto = new ConAzucar(new ConLeche(new Cafe()));
        System.out.println("Bebida: " + cafeCompleto.getDescripcion() + " | Costo: " + cafeCompleto.getCosto());

        // El orden de decoración importa
        Bebida cafeCompleto2 = new ConLeche(new ConAzucar(new Cafe()));
        System.out.println("Bebida: " + cafeCompleto2.getDescripcion() + " | Costo: " + cafeCompleto2.getCosto());
    }
}
