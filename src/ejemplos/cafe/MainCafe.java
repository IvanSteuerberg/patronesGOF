package ejemplos.cafe;


public class MainCafe {
    public static void main(String[] args) {
        Bebida cafe = new Cafe();
        System.out.println("Descripción: " + cafe.getDescripcion() + ", Coste: " + cafe.getCoste());
        Bebida cafeConLeche = new Leche(new Cafe());
        System.out.println("Descripción: " + cafeConLeche.getDescripcion() + ", Coste: " + cafeConLeche.getCoste());
        Bebida cafeConDobleLeche = new Leche(new Leche(new Cafe()));
        System.out.println("Descripción: " + cafeConDobleLeche.getDescripcion() + ", Coste: " + cafeConDobleLeche.getCoste());
        Bebida cafeConAzucar = new Azucar(new Cafe());
        System.out.println("Descripción: " + cafeConAzucar.getDescripcion() + ", Coste: " + cafeConAzucar.getCoste());
    }

}
