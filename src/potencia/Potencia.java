package potencia;

import java.util.Scanner;

public class Potencia 
{

    
    public static void main(String[] args) 
    {
     Scanner leia = new Scanner(System.in);
     double num, result; 
     System.out.println("Digite o valor da base:");
     num = leia.nextDouble();
     
     int pot = 0;
     int cont = 15;
     System.out.println("O valor das potências até a 15° = ");   
     
     for(int i = 1; i <= cont ; i++)
     {
      pot = 1+pot; 
      result = Math.pow(num, pot);
      System.out.println(i + "- "+ result);
     }
    }
    
}
