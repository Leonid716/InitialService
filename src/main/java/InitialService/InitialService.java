package InitialService;

public class InitialService {
    public String getInitialsOne(String name) {
        String[] parts = name.split(" ");
        return parts[0].substring(0, 1) + parts[1].substring(0, 1);
    }

    public String getInitialsTwo(String name) {
        String[] parts = name.split(" ");
        return parts[0].substring(0, 1) + parts[2].substring(0, 1);
    }

    public String getInitialsThree(String name) {
        String[] parts = name.split(" ");
        return parts[0].substring(0, 1);
    }
    public String getInitialsFour(String name) {
        String[] parts = name.split(" ");
        return parts[0].substring(0, 1) + parts[1].substring(0, 1);
    }
}

