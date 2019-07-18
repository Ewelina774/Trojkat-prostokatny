public class Metod {

    boolean isRightTriangle (Triangle triangle) {

        boolean condition1 = triangle.a * triangle.a + triangle.b * triangle.b == triangle.c * triangle.c;
        boolean condition2 = triangle.b * triangle.b + triangle.c * triangle.c == triangle.a * triangle.a;
        boolean condition3 = triangle.c * triangle.c + triangle.a * triangle.a == triangle.b * triangle.b;

        return condition1 || condition2 || condition3;
    }
}

