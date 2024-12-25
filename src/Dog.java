// Subclass
class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void bark() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public String toString() {
        return super.toString() + ", Breed=" + breed;
    }
}