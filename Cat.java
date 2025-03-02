public class Cat extends Animal{

    private static int catCount = 0;
    private boolean isFull;

    public Cat(String name) {
        super(name);
        this.isFull = false;
        catCount++;
    }
    public void run(int distance) {
        if (distance <= 200) {
            super.run(distance);
        } else {
            System.out.println(name + " не может пробежать больше 200 м. ");
        }
    }
    public void swim(int distance) {
            System.out.println(name + " не умеет плавать ");
        }
    public void eat(Bowl bowl, int amount) {
        if (bowl.decreaseFood(amount)) {
            System.out.println(name + " поел и теперь сыт ");
        } else {
            System.out.println(name + " не смог поесть, в миске недостаточно еды ");
        }
    }
    public boolean isFull() {
        return isFull;
    }
    public static int getCatCount() {
        return catCount;
    }
}
