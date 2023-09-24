/**
 * When there is a superclass and multiple subclass
 * We want to create object based on the input that's when factory design pattern used
 * Advantages
 * 1) Focus on creating object of interface rather than implementation
 * 2) loosely coupled
*/

public class Factory {

    public static Employee getEmployeeObj(String empType){
        if (empType.equals("se")){
            return new Software_Engineer();
        } else if (empType.equals("sqa")) {
            return new SQA_Engineer();
        }else {
            return null;
        }
    }
}
