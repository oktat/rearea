public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Alakzatok területe");
        ShapesArea shapesArea = new ShapesArea();

        shapesArea.triangle();
        shapesArea.circle();
        shapesArea.rectangle();
    }
}
