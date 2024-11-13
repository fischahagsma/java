public class Animal {
    public void sayHi() {
        System.out.println("Звук");
    }
    static class Cat extends Animal {

        public void sayHi() {
            System.out.println("Мяю");
        }
    }

    static class Dog extends Animal {
        public void sayHi() {
                System.out.println("Гав");
        }
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal fish = new Cat();
        Dog dog = new Dog();
        cat.sayHi();
        dog.sayHi();
        fish.sayHi();
    }
}


