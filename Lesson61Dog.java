public class Dog extends Animal{

    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }
    public void run(int distance) {
        if (distance <= 500) {
            super.run(distance);
        } else {
            System.out.println(name + " не может пробежать больше 500 м. ");
        }
    }
    public void swim(int distance) {
        if (distance <= 10) {
        } else {
            System.out.println(name + " не может проплыть больше 10 м. ");
        }
    }
    public static  int getDogCount() {
        return dogCount;
    }
}
