    import static org.junit.Assert.assertEquals;
    import org.junit.Test;

    public class ExemploTest {

    @Test
    public void testSomar() {
        assertEquals(5, Exemplo.somar(2, 3));
        assertEquals(-1, Exemplo.somar(-4, 3));
        assertEquals(0, Exemplo.somar(0, 0));
    }

    @Test
    public void testConcatenar() {
        assertEquals("Olá, Mundo!", Exemplo.concatenar("Olá, ", "Mundo!"));
        assertEquals("12345", Exemplo.concatenar("123", "45"));
    }
    }