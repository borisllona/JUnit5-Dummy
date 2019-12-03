import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryImplTest {
    /** CASOS DE TEST:
     * A)Diccionari Buit
     * B)"" amb una paraula amb una sola definició
     * C)"" amb qualsevol situació
     * **/
    DictionaryImpl dict;

    @BeforeEach
    public void initDict(){
        dict = new DictionaryImpl();
        dict.defineWord("Lleida","Ciutat...");
    }

    @Test
    void definedWordLengthCorrect() throws NotDefinedException {
        assertEquals(1,dict.hash.size());
    }
    @Test
    void givenKeyGivesDef() throws NotDefinedException{
        assertEquals("Ciutat...",dict.getDefinitions("Lleida"));
    }
    @Test
    void given_Nondefined_Key_ThrowsExcept() throws NotDefinedException{
            assertThrows(NotDefinedException.class,
                    () -> dict.getDefinitions("Barcelona"));

    }

}