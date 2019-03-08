package InitialService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InitialServiceTest {
    @Test
    public void getInitialsTwoWordsName() {
        InitialService service = new InitialService();
        String name = "Ivan Petrov";

        String actual = service.getInitialsOne(name);

        assertEquals("IP", actual);
    }

    @Test
    public void getInitialsThreeWordsName() {
        InitialService service = new InitialService();
        String name = "Huan Pedro Rodriges";

        String actual = service.getInitialsTwo(name);

        assertEquals("HR", actual);
    }

    @Test
    public void getInitialsOneWordsName() {
        InitialService service = new InitialService();
        String name = "Ivan";

        String actual = service.getInitialsThree(name);

        assertEquals("I", actual);
    }

    @Test
    public void getInitialsTwoWordsUpperName() {
        InitialService service = new InitialService();
        String name = "ivan petrov";

        String actual = service.getInitialsFour(name).toUpperCase();

        assertEquals("IP", actual);
    }

}