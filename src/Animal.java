public abstract class Animal implements IAnimal{

    public String Type;
    public String Colour;
    public String Kind;

    // no need for a constructor

    public Animal (String Kind, String Colour, String Type) {
        this.Colour = colour;
        this.Type = type;
        this.Kind = kind;
    }

    public abstract void makeSound();

}
