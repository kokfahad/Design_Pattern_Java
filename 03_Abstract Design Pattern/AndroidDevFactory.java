public class AndroidDevFactory extends AbstractFactory{
    @Override
    public Employee createEmployee() {
        return new Android_Developer();
    }
}
