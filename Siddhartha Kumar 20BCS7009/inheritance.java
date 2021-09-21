class Shape {
    public void display(){
        System.out.println("The length of rectangle is:  40");
        System.out.println("The breadth of rectangle is: 60");
    }
}
class Rectangle extends Shape {
    public void area(){
        System.out.println("The Area is: 2400");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.display();
        rect.area();
    }
}
