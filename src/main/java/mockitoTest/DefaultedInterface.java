package mockitoTest;

public interface DefaultedInterface {

    default String getValue() {
        return "default";
    }

}
