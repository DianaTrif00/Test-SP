public class ElGraficeDeBaza {
    private String culoare;
    private int dimensiune;
    private int x;
    private int y;

    public ElGraficeDeBaza(String culoare, int dimensiune, int x, int y) {
        this.culoare = culoare;
        this.dimensiune = dimensiune;
        this.x = x;
        this.y = y;
    }

    public String getCuloare(){return culoare;}
    public int getDimensiune(){return dimensiune;}

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
