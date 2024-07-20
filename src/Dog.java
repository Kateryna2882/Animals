public class Dog extends Animals{
    private static int DogCount = 0;

    public Dog(String name){
        super(name);
        DogCount++;

    }

    public static int getDogCount() {
        return DogCount;
    }
@Override
    public void run(int distance) {
    if (distance <= 500) {
        System.out.println(name + " running" + " " + distance + " m.");
    } else {
        System.out.println(name + " is not running" + " " + distance + " m.");
    }
}
public void swim(int distance){
        if (distance <= 10) {
            System.out.println(name + " swimming" + " " + distance + " m.");
        }else{
            System.out.println(name + " is not swimming" + " " + distance + " m.");
        }
}
}
