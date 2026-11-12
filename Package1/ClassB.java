package Package1;
public class ClassB {
    public int V1 = 1;
    private int V2 = 2;
    protected int V3 = 3;
    int V4 = 4;
    // Réponse Question 5 : accesseur public (getter) pour lire V2.
    public int getV2() {
        return V2;
    }
    // Réponse Question 6 : mutateur public (setter) pour modifier V2.
    public void setV2(int v2) {
        this.V2 = v2;
    }
}
