public class Main {
    public static void main(String[] args) {
        Computer computer1 = Computer.getComputerObj();
        System.out.println(computer1.hashCode());

        Computer computer2 = Computer.getComputerObj();
        System.out.println(computer2.hashCode());

        Laptop laptop1 = Laptop.getLaptopObj();
        System.out.println(laptop1.hashCode());

        Laptop laptop2 = Laptop.getLaptopObj();
        System.out.println(laptop2.hashCode());
    }
}
