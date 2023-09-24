public class Main {
    public static void main(String[] args) {
//        tightly coupled way of creating an object
//        Software_Engineer softwareEngineer = new Software_Engineer();
//        SQA_Engineer sqaEngineer = new SQA_Engineer();

        Employee employee1 = Factory.getEmployeeObj("se");
        employee1.salary();

        Employee employee2 = Factory.getEmployeeObj("sqa");
        employee2.salary();
    }
}
