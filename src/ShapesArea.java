import java.util.Scanner;

public class ShapesArea {
    public void triangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Háromszög területe");
        System.out.print("Alap: ");
        String baseStr = scanner.nextLine();
        System.out.print("Magasság: ");
        String heightStr = scanner.nextLine();
        Triangle triangle = new Triangle();
        boolean good = true;
        good = triangle.isGoodInput(baseStr);
        good = triangle.isGoodInput(heightStr);
        if (good) {
            triangle.base = Double.parseDouble(baseStr);
            triangle.height = Double.parseDouble(heightStr);
            triangle.calcArea();
            String format = "Háromszög területe: %f\n";
            System.out.printf(format, triangle.getArea());
        }

        // scanner.close();
    }
    public void circle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kör területe");
        System.out.print("Sugár: ");
        String radiusStr = scanner.nextLine();
        Circle circle = new Circle();
        boolean good = true;
        good = circle.isGoodInput(radiusStr);
        if (good) {
            circle.radius = Double.parseDouble(radiusStr);
            circle.calcArea();
            String format = "Kör területe: %f\n";
            System.out.printf(format, circle.getArea());
        }
        // scanner.close();
    }
    public void rectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Téglalap területe");
        System.out.print("a oldal: ");
        String aSideStr = scanner.nextLine();
        System.out.print("b oldal: ");
        String bSideStr = scanner.nextLine();
        Rectangle rectangle = new Rectangle();
        boolean good = true;
        good = rectangle.isGoodInput(aSideStr);
        good = rectangle.isGoodInput(bSideStr);
        if (good) {
            rectangle.aSide = Double.parseDouble(aSideStr);
            rectangle.bSide = Double.parseDouble(bSideStr);
            rectangle.calcArea();
            String format = "Téglalap területe: %f\n";
            System.out.printf(format, rectangle.getArea());
        }

        // scanner.close();        
    }
}
