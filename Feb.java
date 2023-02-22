/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package feb;
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Feb {
    public static void main(String[] args) {
        //kopapirollo
        Scanner x = new Scanner(System.in);
        Integer korok;
        System.out.println("Hány kört szeretnél játszani: ");
        korok = x.nextInt();
            
        String userValasz;
        Integer userTippSzam;
        int kor = 0;
        for(int i = 0; i < korok; i++){
            System.out.println(i+1+ ". kör");
                
            boolean igazE;
            do
            {
                System.out.println("Írd be a választásod Kő(1), Papír(2), Olló(3): ");
                Scanner tipp = new Scanner(System.in);
                
                userValasz = tipp.next();
                igazE = helyesE(userValasz);
            }
            while (igazE!=true);                
             
                
            System.out.println("User választása: " + userValasz); 
                
            int min = 1;
            int max = 3;
            int rand = (int)(Math.random()*(max-min+1)+min);  
            System.out.println("Gép mutat: " + rand);
            
            if(userValasz=="ko")userTippSzam=1;
            else if(userValasz=="papir")userTippSzam=2;
            else userTippSzam=3;
            System.out.println(Feb.kopapirollo(korok, userTippSzam, rand));
            }
            
    }
    public static String kopapirollo(Integer korok,Integer userValasz, Integer rand){
        if(rand == userValasz)
        {
            return String.format("Döntetlen!");
        }
        else if(rand==0 && userValasz==1 || rand==1 && userValasz==2 || rand==2 && userValasz==0)
        {
            return String.format("User nyert!");
        } 
        else
        {
            return String.format("Gép nyert!");
        }        
    }
    public static Boolean helyesE(String x){
        if(x.equals("ko") || x.equals("papir") || x.equals("ollo")) return true;
        
        else return false;
        
    }
    
}
