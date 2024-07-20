public class Cat extends Animals {
    private static int CatCount = 0;

    public Cat(String name) {
        super(name);
        CatCount++;
    }

    public static int getCatCount() {
        return CatCount;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " is running" + " " + distance + " m.");
        } else {
            System.out.println(name + " is not running" +" " + distance + " m.");
        }
    }

    @Override
    public void swim(int distance) {

            System.out.println(name + " is not swimming" + distance + " m.");
        }
    }
