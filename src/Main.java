// Main class
public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("GenericAnimal", 5);
        Dog goldenRetriever = new Dog("Buddy", 3, "Golden Retriever");

        genericAnimal.eat();
        genericAnimal.sleep();

        goldenRetriever.eat();
        goldenRetriever.sleep();
        goldenRetriever.bark();

        System.out.println(genericAnimal);
        System.out.println(goldenRetriever);
    }
}