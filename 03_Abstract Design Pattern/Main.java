public class Main {
    public static void main(String[] args) {
        Employee employee1 = Factory.createEmployee(new AndroidDevFactory());
        employee1.salary();
        employee1.name();
        
        Employee employee2 = Factory.createEmployee(new IOSDevFactory());
        employee2.salary();
        employee2.name();


    }
}
