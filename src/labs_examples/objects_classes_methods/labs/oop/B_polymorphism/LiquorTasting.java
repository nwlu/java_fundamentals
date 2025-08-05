package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class LiquorTasting {
    public static void main(String[] args) {
    Drinkable hibiki = new JapaneseWhiskey("Hibiki", 18);
    Drinkable macallan = new Scotch("Macallan", 25);

    hibiki.drink();
    macallan.drink();
    }
}

interface Drinkable {
    void drink();

    void sniff();
}

abstract class Whiskey implements Drinkable {
    String name;
    int age;

    public Whiskey(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void Swirl() {
        System.out.println("Swirling the " + name + "brings out its flavor");
    }
}

class Scotch extends Whiskey {
    public Scotch(String name, int age) {
        super(name, age);
    }

    @Override
    public void drink() {
        System.out.println("Drinking a single malt " + name + " Scotch that was aged " + age + " years");
    }

    @Override
    public void sniff() {
        System.out.println("Sipping a single malt " + name + " Scotch");
    }
}
class Bourbon extends Whiskey {
    public Bourbon(String name, int age) {
        super(name, age);
    }

    @Override
    public void drink() {
        System.out.println("Enjoying a nice glass of " + name + " whiskey aged " + age + " years");
    }

    @Override
    public void sniff() {
        System.out.println(name + " whiskey is called whiskey because it's made in North America for at least " + age
        + " yrs");
    }

    public void taste() {
        System.out.println(name + " whiskey can have an earthy taste");
    }
    public void taste(String style) {
        System.out.println(name + " whiskey can be had " + style);
    }
}
class JapaneseWhiskey extends Whiskey{
    public JapaneseWhiskey(String name, int age) {
        super(name, age);
    }
    @Override
    public void sniff() {
        System.out.println(name + " Japanese whiskey are very limited");
    }
    public void drink() {
        System.out.println("Japanese whiskys " + age + " years are so smooth");
    }
}
