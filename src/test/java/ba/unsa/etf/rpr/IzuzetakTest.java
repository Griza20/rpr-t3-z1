package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class IzuzetakTest
{
    @Test
    public void bacanjeIzuzetka() {
        assertThrows(Izuzetak.class, () -> { MobilniBroj mb = new MobilniBroj(69,"9530159"); }, "Nedozvoljena mobilna mreza");
    }
}
