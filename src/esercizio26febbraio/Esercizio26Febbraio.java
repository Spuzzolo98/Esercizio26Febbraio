
package esercizio26febbraio;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Esercizio26Febbraio 
{
    
    
    
    
    /**funzione maggiore
     * 
     * calcola l'oggetto maggiore di un array
     * confrontandolo con il maggiore trovato
     * in precedenza
     * 
     * @param vettore
     * @param numeri 
     */
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
    
    
    
    /**funzione minore
     * 
     * calcola l'oggetto minore in un array
     * confrontandolo con l'oggetto ritenuto
     * minore in precedenza
     * 
     * @param vettore
     * @param numeri 
     */
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

    
    
    /**funzione maxinput
     * 
     * determina quanti oggetti sono maggiori di un 
     * determinato input dell'utente, tramite una
     * variabile di controllo
     * 
     * @param vettore
     * @param numeri 
     */
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
    
    
    
    /**funzione eliminavett
     * 
     * elimina un dato valore da un vettore, scalando
     * tutti i successivi per rimpiazzarlo
     * 
     * @param vettore
     * @param numeri 
     */
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
                for(int j=i; j<numeri; j++)
                {
                    vettore[j] = 0;
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
    
    
    
    /**funzione aggiungivett
     * 
     * aggiunge un determinato valore ad un vettore, spostando 
     * tutti i valori successivi per fare spazio
     * 
     * @param vettore
     * @param numeri 
     */
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
        for(int i=posagg+1; i<numeri+1; i++)
        {
            appoggio2= vettore[i];
            vettore[i] = appoggio1;
            appoggio1 = vettore[i+1];
            vettore[(i+1)] = appoggio2;
            System.out.println();
        }
        for(int i=0; i<numeri+1; i++)
        {
            System.out.print(vettore[i]);
        }
    }
    
    
    
    /**funzione percentpositivi
     * 
     * calcola la percentuale di numeri >=0 sul
     * totale di oggetti del vettore
     * 
     * @param vettore
     * @param numeri 
     */
    static void percentpositivi(int vettore[], int numeri)
    {
        double percentuale=0;
        for(int i=0; i<numeri; i++)
        {
            if(vettore[i]>=0)
            {
                percentuale ++;
            }
        }
        percentuale = ((percentuale/numeri)*100);
        System.out.println("la percentuale di positivi è "+percentuale+"%");
    }
    
    
    
    /**funzione quantiprimi
     * 
     * determina se e quanti oggetti sono primi all'interno di un
     * array
     * 
     * @param vettore
     * @param numeri 
     */
    static void quantiprimi(int vettore[], int numeri)
    {
        double controllato=0;
        int controllore=1, fallimento=0, nprimi=0;
        for(int i=0; i<numeri; i++)
        {               
            if(vettore[i]!=1&&vettore[i]!=0&&vettore[i]!=2) //0, 1 e 2 sono dei bastardi, li escludo subito
            {
                controllato = ((int)Math.sqrt(vettore[i])+1);//calcolo radice quadrata del valore in esame         
                for(int j=0; j<controllato; j++) //è inutile controllare un valore più alto della rdqdt.
                {
                    controllore++; //controllore parte sempre da due
                    if(vettore[i]%controllore==0&&controllore!=vettore[i]) //controlla se il numero è divisibile per 2 o più (fino alla propria radice quadrata)
                    {
                        j=((int)controllato+1);
                        fallimento=1;
                    }
                }
                controllore=1;//reset variabili di controllo
                if(fallimento==0)
                {
                    nprimi ++;   
                }
                fallimento=0;//reset variabili di controllo
            }
            if(vettore[i]==0||vettore[i]==1||vettore[i]==2)
            {
                nprimi++;
            }
        }
        System.out.println("i numeri primi sono " +nprimi);
        
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
            case "6": percentpositivi(vettore, numeri);
            break;
            case "7": quantiprimi(vettore,numeri);
            break;
        }
    }
    
}
