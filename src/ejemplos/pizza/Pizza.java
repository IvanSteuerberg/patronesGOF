package ejemplos.pizza;

public class Pizza {
    // 1. Atributos finales para inmutabilidad
    private final String tamanho;
    private final String masa;
    private final boolean quesoExtra;
    private final boolean pepperoni;
    private final boolean aceitunas;

    // 2. Constructor privado que recibe el Builder
    private Pizza(PizzaBuilder builder) {
        this.tamanho = builder.tamanho;
        this.masa = builder.masa;
        this.quesoExtra = builder.quesoExtra;
        this.pepperoni = builder.pepperoni;
        this.aceitunas = builder.aceitunas;
    }

    // 3. No hay setters, la clase es inmutable

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pizza:\n");
        sb.append(" - Tamaño: ").append(tamanho).append("\n");
        sb.append(" - Masa: ").append(masa).append("\n");
        if (quesoExtra) {
            sb.append(" - Con queso extra\n");
        }
        if (pepperoni) {
            sb.append(" - Con pepperoni\n");
        }
        if (aceitunas) {
            sb.append(" - Con aceitunas\n");
        }
        return sb.toString();
    }

    // 4. Clase anidada estática Builder
    public static class PizzaBuilder {
        // Atributos obligatorios
        private final String tamanho;
        private final String masa;

        // Atributos opcionales, inicializados a su valor por defecto
        private boolean quesoExtra = false;
        private boolean pepperoni = false;
        private boolean aceitunas = false;

        // Constructor del Builder con los atributos obligatorios
        public PizzaBuilder(String tamanho, String masa) {
            this.tamanho = tamanho;
            this.masa = masa;
        }

        // Métodos para los atributos opcionales que devuelven 'this'
        public PizzaBuilder conQuesoExtra(boolean quesoExtra) {
            this.quesoExtra = quesoExtra;
            return this;
        }

        public PizzaBuilder conPepperoni(boolean pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        public PizzaBuilder conAceitunas(boolean aceitunas) {
            this.aceitunas = aceitunas;
            return this;
        }

        // Método final que construye y devuelve el objeto Pizza
        public Pizza build() {
            return new Pizza(this);
        }
    }
}
