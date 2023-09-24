public class IOSDevFactory extends AbstractFactory{
    @Override
    public Employee createEmployee() {
        return new Ios_Developer();
    }
}
