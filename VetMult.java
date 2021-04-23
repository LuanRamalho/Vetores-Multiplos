import java.util.*;
import java.lang.*;

public class VetMult 
{
    Scanner ler = new Scanner(System.in);
        
    int i;
    int numInt [] = new int[10000000];
    float numReal [] = new float[10000000];
    String dado [] = new String[10000000]; 
    int z;
    int x;
    

    void Inteiro()
    {
        System.out.println("Digite a quantidade de vetores a serem utilizados");
        z = ler.nextInt();
        i = 1;
        x = 0;
        while(i!=0 && x<z)
        {
            System.out.println("");
            System.out.println("");
            System.out.println("Digite um número inteiro: ");
            numInt[x] = ler.nextInt();
            
            x = x + 1;
            i = i + 1;
            System.out.println("");
  
        }
    }
    
    
    void Real()
    {
        System.out.println("");
        System.out.println("");
        
        System.out.println("Digite a quantidade de vetores a serem utilizados");
        z = ler.nextInt();
        i = 1;
        x = 0;
        while(i!=0 && x<z)
        {
            System.out.println("");
            System.out.println("");
            System.out.println("Digite um número real: ");
            numReal[x] = ler.nextFloat();
            
            x = x + 1;
            i = i + 1;
            System.out.println("");
  
        }
    }
    
    void Dado()
    {
        System.out.println("");
        System.out.println("");
        
        System.out.println("Digite a quantidade de vetores a serem utilizados");
        z = ler.nextInt();
        i = 1;
        x = 0;
        while(i!=0 && x<z)
        {
            System.out.println("");
            System.out.println("");
            System.out.println("Digite um dado: ");
            dado[x] = ler.next();
            
            x = x + 1;
            i = i + 1;
            System.out.println("");
  
        }
    }
    
    void ExibeInformação()
    {
        System.out.println("");
        System.out.println("");
        
        
        i = 0;
        System.out.println("Números Inteiros ");
        while(i<x)
        {
            System.out.println(""+numInt[i]);
            
            i = i + 1;
        }
        
        System.out.println("");
        System.out.println("");
        
        i = 0;
        System.out.println("Números Reais ");
        while(i<x)
        {
            System.out.println(""+numReal[i]);
            
            i = i + 1;
        }
        
        System.out.println("");
        System.out.println("");
        
        i = 0;
        System.out.println("Dados");
        while(i<x)
        {
            System.out.println(""+dado[i]);

            
            i = i + 1;
        }
        
    }
    

    public static void main(String[] args) 
    {
        VetMult v = new VetMult();
        
        v.Inteiro();
        v.Real();
        v.Dado();
        v.ExibeInformação();
    } 
}
