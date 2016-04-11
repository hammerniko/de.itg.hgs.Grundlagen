package E3_Rekursion;

public class Fakultaet {
    public static void main (String []args){
      int n=5;
      System.out.println ("Fakultaet von " + n +": "+ gibFakultaet (n));
      System.exit(0);
    }

    static int gibFakultaet(int n){
      int wert=1;
      if (n>1){
        wert= n * gibFakultaet (n-1);
      }
      return wert;
    }
  }