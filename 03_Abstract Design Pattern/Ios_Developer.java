public class Ios_Developer implements Employee{
    @Override
    public int salary() {
        System.out.println("Ios Developer");
        return 60000;
    }

    @Override
    public String name() {
        return "I am a IOS developer";
    }
}
