public class ElGraficeDeBaza {
    private String culoare;
    private int dimensiune;

    public ElGraficeDeBaza(String culoare, int dimensiune) {
        this.culoare = culoare;
        this.dimensiune = dimensiune;
    }

    public String getCuloare(){return culoare;}
    public int getDimensiune(){return dimensiune;}
}
