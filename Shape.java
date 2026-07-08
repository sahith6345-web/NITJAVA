abstract class Shapes {
    abstract double calculateArea();
}
class Circle extends Shapes {

    int radius;
    Circle(int radius) {
        this.radius = radius;
    }
    double calculateArea() {
       return 3.17*radius*radius;
    }
}
class Rectangle extends Shapes {
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    double calculateArea() {
       return length*width;
    }
}
class Shape {
    public static void main(String[] args) {
        Shapes myCircle = new Circle(5.0);
        Shapes myRectangle = new Rectangle(4, 6);
        System.out.println(myCircle.calculateArea());
        System.out.println(myRectangle.calculateArea());
    }
}

