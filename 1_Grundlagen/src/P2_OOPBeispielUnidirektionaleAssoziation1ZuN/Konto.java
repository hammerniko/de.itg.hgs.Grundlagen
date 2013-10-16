package P2_OOPBeispielUnidirektionaleAssoziation1ZuN;

public class Konto {
    private int kontoNr;
    private double saldo;
    private double sollzins;
    private double guthabenZins;
    private double limit;
    private static int anzahlKonten =0;
    
    public Konto(double limit) {
        anzahlKonten++;
        kontoNr=anzahlKonten;
        this.limit = limit;
    }

    public Konto(double limit,double saldo) {
        this(limit);
        this.saldo = saldo;
    }

    public double getSollzins() {
        return sollzins;
    }

    public void setSollzins(double sollzins) {
        this.sollzins = sollzins;
    }

    public double getGuthabenZins() {
        return guthabenZins;
    }

    public void setGuthabenZins(double guthabenZins) {
        this.guthabenZins = guthabenZins;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public int getKontoNr() {
        return kontoNr;
    }

    @Override
    public String toString() {
        return "\nKonto [kontoNr=" + kontoNr + ", saldo=" + saldo + ", sollzins="
                + sollzins + ", guthabenZins=" + guthabenZins + ", limit="
                + limit + "]";
    }
    
    
    
    

}
