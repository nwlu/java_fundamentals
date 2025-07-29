package labs_examples.objects_classes_methods.labs.methods;

public class ObjectComposition {

    public static void main(String[] args) {
        // create a composite object here
        // after creating your new classes below
        // refer to the previous example for guidance
        Paddle paddle = new Paddle("Sypik", 8);
        Ball ball = new Ball("Vulcan ProV");

        Bag mybag = new Bag("Carbon", paddle, ball);
        System.out.println(mybag.paddle.name);
    }
}

// create your first class below this line
class Paddle {
    String name;
    int weight;

    public Paddle(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
}

// create your second class below this line
class Ball {
    String brand;

    public Ball(String brand) {
        this.brand = brand;
    }
}

// create your third class below this line
class Bag {
    String brand;
    Paddle paddle;
    Ball ball;

    public Bag(String brand, Paddle paddle, Ball ball) {
        this.brand = brand;
        this.paddle = paddle;
        this.ball = ball;
    }
}

