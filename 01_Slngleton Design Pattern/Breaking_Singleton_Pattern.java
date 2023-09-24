/**3 ways to break Singleton Pattern
 1. Reflect Api
 2.De serialization
 3.Object Cloning
*/


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Breaking_Singleton_Pattern {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Computer computer1 = Computer.getComputerObj();
        System.out.println(computer1.hashCode());

        Constructor<Computer> constructor = Computer.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Computer computer2 = constructor.newInstance();
        System.out.println(computer2.hashCode());
    }
}
