package E3_Rekursion;

public class Fakultaet {
    public static void main (String []args){
      int n=2;
      System.out.println ("Fakultaet von " + n +": "+ faku (n));
      System.exit(0);
    }

    static int faku(int n){
      int wert=1;
      if (n>0){
        wert= n * faku (n-1);
      }
      return wert;
    }
  }