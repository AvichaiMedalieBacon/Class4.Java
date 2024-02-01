public class Dog extends Animal{

    // State
    // not needed due to having it in Animal
   // public String Type;
    //public String Colour;

    // constructor
    public Dog (String type, String colour) {
      //  this.Colour = colour;
       // this.Type = type;
        super (kind: "Dog" , colour, type);
    }

    //behaviour
    public void makeSound() {
       System.out.println("Woof Woof");
    }

}
