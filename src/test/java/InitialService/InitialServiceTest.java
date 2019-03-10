package InitialService;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class InitialServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/initials.csv", numLinesToSkip = 1)
    void getInitials(String input, String expected) {
        InitialService service = new InitialService();

        String actual = service.getInitialsOne(input);

        assertEquals(expected, actual);
    }

}