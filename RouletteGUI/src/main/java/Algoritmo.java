import java.util.Random;

public class Algoritmo extends User{
    public int numb[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36};
    public int numb_red_pos[] = {1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36};
    public int pos[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15},{16,17,18},{19,20,21},{22,23,24},{25,26,27},{28,29,30},{31,32,33},{34,35,36}};

    public Algoritmo() {
    }
    
    public int Algoritmo(int puntata_int, int tipo_puntata_int, int scommessa) {
        Random rand = new Random();
        int ball;
        int position;
        int buff = 0;
        int buff_2_0 = 0;
        
        ball = rand.nextInt(37);        // "gira" la ruota
        
        switch (tipo_puntata_int){
            case 1: //numero pieno
                System.out.println("la puntata prima dello spin= " + puntata_int);
                if(numero_int == numb[ball]){ 
                    puntata_int = puntata_int*36;
                    System.out.println("COMPLIMENTI! hai azzeccato il numero "+ numero_int);
                }
                else {
                    puntata_int = 0;
                }
            break;
            case 2: //rosso o nero
                buff_2_0 = 0;
                for(int i = 0; i < 36; i++){ 
                    if (scelta_int == 0){
                        if(numb_red_pos[i] == numb[ball]){
                            puntata_int = puntata_int*2;
                            buff_2_0 = 1;
                        }
                    }
                    
                    if (scelta_int == 1){
                        if(numb_red_pos[i] != numb[ball]){
                            puntata_int = puntata_int*2;
                            buff_2_0 = 1;
                        }
                    }
                }
                if(buff_2_0 == 0){
                    puntata_int = 0;  
                }
            break;
            case 3: //pari o dispari
                if (numb[ball]%2 == 0 && scelta_int == 0){
                    puntata_int = puntata_int*2;
                }
                else {
                    puntata_int = 0;
                }
                
                if (numb[ball]%2 != 0 && scelta_int == 1){
                    puntata_int = puntata_int*2;
                }
                else {
                    puntata_int = 0;
                }
            break;
            case 4: //dozzina
                if ((numb[ball] >= 1 && numb[ball] <= 12) && scelta_int == 0){
                    puntata_int = puntata_int*3;
                }
                else {
                    puntata_int = 0;
                }
                
                if ((numb[ball] >= 13 && numb[ball] <= 24) && scelta_int == 1){
                    puntata_int = puntata_int*3;
                }
                else {
                    puntata_int = 0;
                }
                
                if ((numb[ball] >= 25 && numb[ball] <= 36) && scelta_int == 2){
                    puntata_int = puntata_int*3;
                }
                else {
                    puntata_int = 0;
                }
            break;
            case 5: //meta'
                if ((numb[ball] >= 1 && numb[ball] <= 18) && scelta_int == 0){
                    puntata_int = puntata_int*3;
                }
                else {
                    puntata_int = 0;
                }
                
                if ((numb[ball] >= 19 && numb[ball] <= 36) && scelta_int == 1){
                    puntata_int = puntata_int*3;
                }
                else {
                    puntata_int = 0;
                }
            break;
            case 6: //colonna
                while (buff < 36){
                    buff_2_0 = 0;
                    for (int i = 0; i < 3; i++){
                        if (scelta_int == 0){
                            if (pos[buff][i] == numb[ball]){
                                puntata_int = puntata_int*3;    
                                buff_2_0 = 1;
                            }
                        }
                        
                        if (scelta_int == 1){
                            if (pos[buff][i] == numb[ball]){
                                puntata_int = puntata_int*3;
                                buff_2_0 = 1;
                            }
                        }
                        
                        if (scelta_int == 2){
                            if (pos[buff][i] == numb[ball]){
                                puntata_int = puntata_int*3;
                                buff_2_0 = 1;
                            }
                        }
                    }
                    if(buff_2_0 == 0){
                        puntata_int = 0;  
                    }
                }
            break;
        }
        return puntata_int;
    }
}
