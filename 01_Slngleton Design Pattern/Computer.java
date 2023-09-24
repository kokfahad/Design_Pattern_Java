import java.util.Objects;

//lazy way of creating singleton object
public class Computer {
    public static Computer computer;

    private Computer() {
    }

    public static Computer getComputerObj() {

        if (Objects.isNull(computer)) {
            synchronized (Computer.class) {
                if (Objects.isNull(computer))
                    computer = new Computer();
            }
        }

        return computer;
    }
}
