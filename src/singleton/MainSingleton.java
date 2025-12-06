package singleton;

public class MainSingleton {

    public static void main(String[] args) {
        // Obtener la única instancia de Singleton
        Singleton singleton1 = Singleton.getInstance();

        // Usar la instancia
        singleton1.showMessage();
        singleton1.doSomething();

        // Intentar obtener otra instancia
        Singleton singleton2 = Singleton.getInstance();

        // Comprobar si ambas referencias apuntan al mismo objeto
        if (singleton1 == singleton2) {
            System.out.println("singleton1 y singleton2 son la misma instancia.");
        } else {
            System.out.println("Esto no debería suceder: se crearon diferentes instancias.");
        }
    }
}
