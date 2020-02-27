package Rectangle;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(9, 9);
        rectangle.drawInConsole('E','D','Z', ' ');
        rectangle.setWidth(18);
        rectangle.drawInConsole('E','D','Z', ' ');
        rectangle.setHeight(15);
        rectangle.drawInConsole('E','D','Z', ' ');

    }
}
