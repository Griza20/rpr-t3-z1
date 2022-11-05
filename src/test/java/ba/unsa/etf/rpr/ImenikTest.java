package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImenikTest {
    @Test
    void dodaj() {
        Imenik i = new Imenik();
        FiksniBroj a = new FiksniBroj(Grad.SARAJEVO,"123123");
        i.dodaj("Amar", (TelefonskiBroj) a);
        assertEquals("Amar",i.dajIme((TelefonskiBroj) a));
    }

    @Test
    void dajBroj() {
        Imenik i = new Imenik();
        FiksniBroj a = new FiksniBroj(Grad.SARAJEVO,"123123"), b = new FiksniBroj(Grad.SARAJEVO,"033111111");
        i.dodaj("Amar", (TelefonskiBroj) a);
        i.dodaj("Anes",(TelefonskiBroj)b);
        assertEquals("033/123123",i.dajBroj("Amar"));
    }

}