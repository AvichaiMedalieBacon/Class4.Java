public class Main {
    public static void main(String[] args) {
        // Dog myDog = new Dog (type: "Labrador", colour: "White");
        // Labrador myDog = new Labrador( colour: "Black");
        //Beagle myDog = new Beagle (colour: "White");
        //Dog myDog = new Labrador (colour: "Black");
        Animal myAnimal1 = new Labrador(colour:"Black");
        Animal myAnimal2 = new Cat(type:"Persian", colour:"White");
        List<Animal> myList = newArrayList <>();
        myList.add(myAnimal1);
        myList.add(myAnimal2);

        for (Animal myAnimal : myList) {
            System.out.println("My "myAnimal.Kind + " is a " + myAnimal.Type + "He is"myAnimal.colour);
            myAnimal.makeSound();
        }


    }
}