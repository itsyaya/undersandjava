

/** Variablen.java
    Ergaenzen Sie nach jedem Kommentar jeweils den Quellcode.
    @author
    @version
*/
public class Variablen {
  /**
   * @param args
   */
  public static void main(String [] args){
  
  // BEISPIEL: //
    
  /* -2. Eine Variable soll speichern, ob ein Schueler fleißig wahr
          oder nicht. Vereinbaren Sie eine geeignete Variable */
  boolean schuelerWarFleissig;
    
  /* -1. Weisen Sie der Variable den Wert "wahr" (true) zu */
    schuelerWarFleissig = true; 
  
  /* 0. Geben Sie die Variable auf dem Bildschirm aus. */
  System.out.println(schuelerWarFleissig);
    
  // AB HIER SIND SIE DRAN: //  
  
    /* 1. Ein Zaehler soll die Anzahl der Tage bis zum Endes des Schuljahres
      zaehlen. Deklarieren Sie eine geeignete Variable */
    short zaehler;

    /* 2. Weisen Sie dem Zaehler den Wert 25 zu
          und geben Sie ihn auf dem Bildschirm aus.*/
    zaehler = 22 + 3;
    System.out.println("Hier ist die Tag anzahl: "+ zaehler);


    /* 3. Durch die Eingabe eines Buchstabens soll ein Menuepunkt
          eines Programms ausgewaehlt werden.
          Deklarieren Sie eine geeignete Variable */
    char menupunkt;

    /* 4. Weisen Sie dem Buchstaben aus Aufgabe 3 
      den Wert 'C' zu und geben Sie ihn auf dem Bildschirm aus.*/
    menupunkt = 'C';
    System.out.println("Buchstaben ein Menuepunkt: " + menupunkt +"\n");


    /* 5. Fuer eine genaue astronomische Berechnung sind grosse Zahlenwert
          notwendig.
          Deklarieren Sie eine geeignete Variable */
    double lichtgeschwindigkeit;
   /* 6. Weisen Sie der Zahl den Wert der Lichtgeschwindigkeit [1] in m/s zu
          und geben Sie diese auf dem Bildschirm aus.
      [1]Lichtgeschwindigkeit: https://googlethatforyou.com?q=lichtgeschwindigkeit%20km%2Fs
  */
    lichtgeschwindigkeit = 299_000.999;
    System.out.println("Die licht geschwindigkeit betraegt "+ lichtgeschwindigkeit +" km/s");


    /* 7. Sieben Personen gruenden einen Verein. Fuer eine Vereinsverwaltung
          soll die Anzahl der Mitglieder erfasst werden.
          Deklarieren Sie eine geeignete Variable und initialisieren sie
          diese sinnvoll.*/ 
          byte mitgliederAnzahl;
    /* 8. Geben Sie die Anzahl der Mitglieder auf dem Bildschirm aus.*/
          mitgliederAnzahl = 7;
          System.out.println("\n Die Anzahl der Miglieder ist: "+ mitgliederAnzahl);


    /* 9. Fuer eine Berechnung im ET-Rechentrainer wird die elektrische 
      Elementarladung[2] benoetigt 
      
      [2] Elektrische Elementarladung: 
      https://googlethatforyou.com?q=elektrische%20elementarladung
      
          Initialisieren Sie eine geeignete Variable und geben Sie es auf
          dem Bildschirm aus. Der Wert soll in der Einheit Coulomb C angegeben werden*/
          double elektrischeElementarladung;
          elektrischeElementarladung = 0.00000000000000000034;
          System.out.println("Die elektrische Elementarladung betraegt: "+ elektrischeElementarladung +" C");


    /*10. Ein Buchhaltungsprogramm soll festhalten, ob eine Zahlung erfolgt ist.
          Deklarieren Sie eine geeignete Variable. */
          boolean zahlerfolgt;

    /*11. Die Zahlung ist erfolgt.
          Weisen Sie der Variablen den entsprechenden Wert zu
          und geben Sie die Variable auf dem Bildschirm aus.*/
          zahlerfolgt = true;
          System.out.println("\n Die Zahlung ist erfolgt: " + zahlerfolgt);
  }//main
}// Variablen