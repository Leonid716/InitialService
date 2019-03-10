package InitialService;

public class InitialService {
    public String getInitialsOne(String name) {
        String parts[] = name.split(" ");

        if (parts.length == 1) {
            return parts[0].substring(0, 1);
        }

        if (parts.length == 3) {
            return parts[0].substring(0, 1) + parts[2].substring(0, 1);
        }

        String firstLetter = parts[0].substring(0, 1);
        String secondLetter = parts[1].substring(0, 1);

        return firstLetter.toUpperCase() + secondLetter.toUpperCase();

    }
}


