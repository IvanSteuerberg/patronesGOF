package composite;

public class MainComposite {
    public static void main(String[] args) {
        // Crear un gráfico complejo que contendrá todo
        CompoundGraphic allGraphics = new CompoundGraphic();

        // Añadir algunas formas simples directamente
        allGraphics.add(new Dot(1, 2));
        allGraphics.add(new Circle(5, 3, 10));

        // Crear otro grupo (compuesto) de formas
        CompoundGraphic group = new CompoundGraphic();
        group.add(new Dot(100, 200));
        group.add(new Circle(120, 150, 30));

        // Añadir el grupo al gráfico principal
        allGraphics.add(group);

        // Dibujar todo. El cliente (este main) solo necesita llamar a draw()
        // en el componente de más alto nivel. No necesita saber la estructura interna.
        System.out.println("Dibujando el gráfico completo:");
        allGraphics.draw();
    }
}
