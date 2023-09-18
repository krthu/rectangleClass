public class Rectangle {
    private int x;
    private int y;
    private double width;
    private double height;

    public Rectangle(int x, int y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public  Rectangle(double width, double height){
        this.x = 0;
        this.y = 0;
        this.width = width;
        this.height = height;
    }

    public Rectangle(){
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }

    public double calculateArea(){
        return width*height;
    }

    public double calculatePerimeter(){
        return width * 2 + height * 2;
    }




    public String toString(){
        return " x: " + x + " y: " + y + " width: " + width + " height: " + height;
    }


}

