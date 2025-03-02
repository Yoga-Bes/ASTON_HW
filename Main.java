public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Шелдон");
        Dog dog2 = new Dog("Леонард");
        Cat cat1 = new Cat("Радж");
        Cat cat2 = new Cat("Говард");

        dog1.run(100);
        dog2.run(1100);
        cat1.run(200);
        cat2.run(800);

        dog1.swim(5);
        dog2.swim(20);
        cat1.swim(15);
        cat2.swim(0);

        Bowl bowl = new Bowl(30);
        Cat[] cats = {cat1, cat2};
        for (Cat cat : cats) {
            cat.eat(bowl, 20);
        }
        for (Cat cat : cats) {
            System.out.println(cat.name + " сыт: " + cat.isFull());
        }
        bowl.addFood(50);
        for (Cat cat : cats) {
            cat.eat(bowl, 20);
        }
        for (Cat cat : cats) {
            System.out.println(cat.name + "сыт: " + cat.isFull());
        }
        System.out.println("Всего жывотных:" + Animal.getAnimalCount());
        System.out.println("Всего собак:" + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
    }
}
