package InitialService;

public class InitialService {
    public String getInitialsOne(String name) {
        String parts[] = name.split(" ");

        if (parts.length >= 2) {
            return parts[0].substring(0,1).toUpperCase() + parts[parts.length - 1].substring(0,1).toUpperCase();

        }
        return parts[0].substring(0, 1).toUpperCase();
    }
}


