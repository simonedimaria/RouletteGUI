public class User{
    public String puntata = "";
    public int puntata_int = 2;
    
    public String numero = "";
    public int numero_int = 5;
    
    public String tipo_puntata;
    public int tipo_puntata_int = 1;
    
    public String scelta;
    public int scelta_int;
    
    public void user(String bet, String number){        
        puntata = bet;
        puntata_int = Integer.parseInt(puntata);
        
        numero = number;
        numero_int = Integer.parseInt(numero);
    }
}
