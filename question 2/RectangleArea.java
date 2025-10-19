public class RectangleArea {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java RectangleArea <width> <height>");
            return;
        }

        try {
            double width = Double.parseDouble(args[0]);
            double height = Double.parseDouble(args[1]);
            double area = width * height;
            System.out.println("Width: " + width);
            System.out.println("Height: " + height);
            System.out.println("Area of rectangle: " + area);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric values for width and height.");
        }
    }
}
