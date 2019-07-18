public class TriangleTest {

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        triangle1.a = 3;
        triangle1.b = 4;
        triangle1.c = 5;

        Metod metod1 = new Metod();

        System.out.println(metod1.isRightTriangle(triangle1));
    }
}


