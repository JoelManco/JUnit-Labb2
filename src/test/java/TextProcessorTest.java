import org.junit.jupiter.api.*;
import textprocessor.TextProcessor;
import org.junit.jupiter.api.Disabled;

import static org.junit.jupiter.api.Assertions.*;

public class TextProcessorTest {

    private TextProcessor textProcessor;

    @BeforeAll
    static void message() {
        System.out.println("Performing TextProcessor tests...");
    }

    @BeforeEach
    void TextProcInstance() {
        this.textProcessor = new TextProcessor();
    }


    @Test
    void StringChecker() {
        String str = "HELLO";
        assertEquals(str, textProcessor.toUpper(str));
        System.out.println(str);
    }

    @Test
    void StringChecker2() {
        String str = "hello";
        assertNotEquals(str, textProcessor.toUpper(str));
        System.out.println(str);
    }

    @Test
    void NullChecker() {
        String string1 = "Full";
        assertNotNull(string1);
    }

    @Test
    @DisplayName("NullChecker2 expected error.")
    void NullChecker2() {
        String string1 = "Full";
        assertNull(string1);
    }


    @Test
    void UpperConverter() {
        String str = "greetings";
        String ssr = "GREETINGS";
        assertEquals(ssr, textProcessor.toUpper(str));
    }

    @Test
    void LowerConverter() {
        String str = "GOODBYE";
        String ssr = "goodbye";
        assertEquals(ssr, textProcessor.toLower(str));
    }

    @Test
    void ReverseConverter() {
        String str = "Another";
        String ssr = "rehtonA";
        assertEquals(ssr, textProcessor.reverse(str));
    }


    @Test
    @Disabled
    void testVoid() {
        System.out.println("This string should not be visible");
    }


    @AfterAll
    static void messageAfter() {
        System.out.println("TextProcessor tests completed.");
    }
}