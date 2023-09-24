public class Factory {

    public static Employee createEmployee(AbstractFactory factory){
        return factory.createEmployee();
    }
}
