package ba.unsa.etf.rpr;

import java.util.*;

public class Imenik {
    private HashMap<String,TelefonskiBroj> imenik = new HashMap<>();
    void dodaj(String ime, TelefonskiBroj broj){
        imenik.put(ime, broj);
    }
    String dajBroj(String ime){
        return imenik.get(ime).ispisi();
    }
    String dajIme(TelefonskiBroj broj){
        for(Map.Entry<String, TelefonskiBroj> clan: imenik.entrySet()){
            if(clan.getValue().equals(broj)) return clan.getKey();
        }
        return null;
    }
    String naSlovo(char s){
        String tekst = new String();
        int brojac = 0;
        for(Map.Entry<String, TelefonskiBroj> clan: imenik.entrySet()){
            if(clan.getKey().charAt(0)==s){
                brojac++;
                tekst.concat(brojac+". "+clan.getKey()+" - "+clan.getValue().ispisi()+"\n");
            }
        }
        return tekst;
    }
    Set<String> izGrada(Grad g){
        Set<String> imena = new TreeSet<String>();
        for(Map.Entry<String, TelefonskiBroj> clan: imenik.entrySet()){
            if(clan.getValue() instanceof FiksniBroj){
                if(((FiksniBroj) clan.getValue()).dajGrad() == g) imena.add(clan.getKey()) ;
            }
        }
        return imena;
    }
    Set<TelefonskiBroj> izGradaBrojevi(Grad g){
        Set<TelefonskiBroj> brojevi = new LinkedHashSet<>();
        for(Map.Entry<String, TelefonskiBroj> clan: imenik.entrySet()){
            if(clan.getValue() instanceof FiksniBroj){
                if(((FiksniBroj) clan.getValue()).dajGrad() == g) {
                    brojevi.add(clan.getValue());
                }
            }
        }
        return brojevi;
    }
}
