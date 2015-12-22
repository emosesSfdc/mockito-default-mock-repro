package mockitoTest;

/**
 *
 */
public class Application {

    private DefaultedInterface defaultedInterface;

    public Application(DefaultedInterface defaultedInterface) {
        this.defaultedInterface = defaultedInterface;
    }

    public String getValue() {
        return defaultedInterface.getValue();
    }

    void run() {
        System.out.println(getValue());
    }
    public static void main(String[] args) {
        new Application(new DefaultedInterface() {}).run();
    }
}
