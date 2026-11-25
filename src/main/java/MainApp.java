import java.awt.*;

public class MainApp {
    public static void main(String[] args) {
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
        World world = new World(500, 500);
        Turtle turtle = new Turtle(world, -100, -100);

        int width = 500;
        int height = 500;

        // calculate the hypotenuse (diagonal)
        // a2 + b2 = c2
        double widthSquared = Math.pow(width, 2);
        double heightSquared = Math.pow(height, 2);
        double hypotenuse = Math.sqrt(widthSquared + heightSquared);


        turtle.setPenWidth(3);
        turtle.setColor(Color.GREEN);
        //call the method
        drawSquare(turtle, -50, -50, 100);
    }

        //method to draw a square
        public static void drawSquare(Turtle turtle, int x, int y, int size)
        {   //coordinates and drawing
            turtle.penUp();
            turtle.goTo(x, y);
            turtle.penDown();
            //loop to draw the square
            for (int i = 0; i < 4; i++) {
                turtle.forward(size);
                turtle.turnRight(90);
            }
        }
}

