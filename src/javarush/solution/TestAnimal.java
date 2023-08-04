package javarush.solution;

public class TestAnimal {
    public static void main(String[] args) {
        Bear bear = new Bear();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Snake snake = new Snake();

        bear.voice();
        cat.voice();
        dog.voice();
        snake.voice();



    }

    public static class Bear extends Animal {
        @Override
        public void voice() {
            System.out.println("R - r - r");        }
    }

    public static class Cat extends Animal{
        @Override
        public void voice() {
            System.out.println("May - mau");
        }
    }

    public static class Dog extends Animal {
        @Override
        public void voice() {
            System.out.println("Gav - gav");
        }
    }

    public static class Snake extends Animal {
        @Override
        public void voice() {
            System.out.println("Sh - sh - sh");
        }
    }

}
