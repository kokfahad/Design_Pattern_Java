public class Android_Developer implements Employee{
    @Override
    public int salary() {
        System.out.println("Android developer");
        return 50000;
    }

    @Override
    public String name() {
        return "I am a Android developer";
    }
}
