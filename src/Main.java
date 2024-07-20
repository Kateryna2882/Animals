public class Main {
    public static void main(String[] args) {
Cat cat = new Cat("Tima");
Cat cat2 = new Cat("Booma");
Dog dog = new Dog("Funny");
Dog dog2 = new Dog("Fred");
cat.run(100);
cat2.run(200);
cat2.run(300);
dog.run(300);
dog.run(400);
dog.run(500);
dog.run(600);

cat2.run(50);
cat2.run(100);
cat2.run(300);
cat2.run(600);

dog2.run(50);
dog2.run(100);
dog2.run(300);
dog2.run(600);

    }
}