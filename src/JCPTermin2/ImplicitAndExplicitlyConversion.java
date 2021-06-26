package JCPTermin2;


public class ImplicitAndExplicitlyConversion {
    public static void main(String[] args) {
        //Implicitna konverzija
        // 4 bajta (int) smestamo u sobu od 8 bajtova(double).
        int x = 10;
        double y = x;
        System.out.println(y);
        
        //Eksplicitna konverzija
        //Pokusavamo da 8 bajtova smestimo u 4 sto nije moguce. Gubimo podatke
        //Kastvanje: Konvertovali smo double z u int.
        double z = 15.0;
        int u = (int)z;
        System.out.println(u);
        
        // String je niz karaktera
        // Objekat tipa String
        String s = "Ja sam Luka";
        //Neinicijalizovani String
        String t = null;
        System.out.println(s);
    }
    
}
