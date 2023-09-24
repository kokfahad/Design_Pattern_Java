//eager way of creating singleton object
public class Laptop {
    private static Laptop laptop = new Laptop();

    public static Laptop getLaptopObj() {
        return laptop;
    }
}
