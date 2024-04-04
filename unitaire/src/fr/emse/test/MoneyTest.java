package fr.emse.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MoneyTest {
    private Money m12CHF;
    private Money m14CHF;

    @BeforeEach
    public void setUp() {
        m12CHF = new Money(12, "CHF");
        m14CHF = new Money(14, "CHF");
    }

    @Test
    public void testSimpleAdd() {
        Money expected = new Money(26, "CHF");
        Money result = m12CHF.add(m14CHF); // Utilisation des objets initialisés dans setUp
        assertEquals(expected, result);
    }

    @Test
    public void testEquals() {
        assertTrue(!m12CHF.equals(null));
        assertEquals(m12CHF, m12CHF);
        assertEquals(m12CHF, new Money(12, "CHF"));
        assertFalse(m12CHF.equals(m14CHF));
    }
}
