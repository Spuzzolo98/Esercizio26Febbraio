
package esercizio26febbraio;
import java.util.Scanner;
import java.util.Random;

public class Esercizio26Febbraio 
{
    
    static void  maggiore(int vettore[], int numeri)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<numeri; i++)
        {
            if(vettore[i]>max)
                max = vettore[i];
        }
        System.out.print("il numero maggiore è "+max);
    }
    
    
    static void minore(int vettore[], int numeri)
    {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<numeri; i++)
        {
            if(vettore[i]<min)
            {
                min = vettore[i];
            }
        }
        System.out.print("Il minore è "+min);
    }

    static void maxtinput(int vettore[], int numeri)
    {
        Scanner scannervar = new Scanner(System.in);
        int controllo=0, conta=0;
        System.out.print("quale numero vuoi controllare? ");
        controllo = scannervar.nextInt();
        for(int i=0; i<numeri; i++)
        {
            if(vettore[i]>controllo)
                conta++;
        }
        System.out.println("ci sono "+conta+" numeri maggiori di "+controllo);
    }
    
    
    
    
    static void eliminavett(int vettore[], int numeri)
    {
        Scanner scannervar = new Scanner(System.in);
        int eliminante =0;
        System.out.print("quale numero vuoi eliminare? ");
        eliminante = scannervar.nextInt();
        for(int i=0; i<numeri; i++)
        {
            if(vettore[i]==eliminante)
            {
                for(int j=i; j<numeri-i; j++)
                {
                    vettore[j] = vettore[j+1];
                }
            }
        }
        System.out.print("rimosso! ");
        for(int i=0; i<numeri; i++)
        {
            System.out.print(+vettore[i]+" ");
        }   
    }
    
    
    
    static void aggiungivett(int vettore[], int numeri)
    {
        Scanner scannervar = new Scanner(System.in);
        int aggiungente=0, posagg=0, appoggio1 =0, appoggio2=0;
        System.out.print("quale numero vuoi aggiungere? ");
        aggiungente = scannervar.nextInt();
        System.out.print("a che posizione? ");
        posagg = scannervar.nextInt();
        appoggio1 = vettore[posagg];
        vettore[posagg]=aggiungente;
        for(int i=posagg+1; i<numeri; i++)
        {
            appoggio2= vettore[i];
            vettore[i] = appoggio1;
            appoggio1 = vettore[i+1];
            vettore[i+1]=appoggio2;
        }
        for(int i=0; i<numeri; i++)
        {
            System.out.print(vettore[i]);
        }
    }
    
    
    
    
    public static void main(String[] args) 
    {
        Scanner scannervar = new Scanner(System.in);
        int vettore[] = new int[100], numeri=0;
        String scelta= "1";
        System.out.print("quanti numeri? ");
        numeri = scannervar.nextInt();
        for(int i=0; i<numeri; i++)
        {
            System.out.print("inserisci n ");
            vettore[i] = scannervar.nextInt();
        }
        scannervar.nextLine();
        System.out.print("Cosa vuoi fare?: \n Numero maggiore (1) \n Numero minore(2) \n Numeri maggiori di input (3) \n Elimnare un numero dal vettore (4) \n Aggiungere un numero al vettore (5) \n Percentuale dei positivi (6) \n Quanti numeri primi (7) \n Uscita (U)");
        scelta = scannervar.nextLine();
        switch (scelta)
        {
            case "1": maggiore(vettore,numeri);
            break;
            case "2": minore(vettore, numeri);
            break;
            case "3": maxtinput(vettore, numeri);
            break;
            case "4": eliminavett(vettore, numeri);
            break;
            case "5": aggiungivett(vettore, numeri);
            break;
            case "6": percentpositivi();
            break;
            case "7": quantitaprimi();
            break;
        }
    }
    
}
