package MainPackage;
public class ClassA {
    public int V1 = 1;
    private int V2 = 2;
    protected int V3 = 3;
    int V4 = 4;
    // Réponse Question 5 : V2 étant privé, on y accède avec un accesseur public (getter).
    public int getV2() {
        return V2;
    }
    // Réponse Question 6 : on modifie V2 avec un mutateur public (setter).
    public void setV2(int v2) {
        this.V2 = v2;
    }
    public int add() {
        return V2 + V4;
    }
    // Réponse Question 8 : Oui, on peut définir une méthode add avec une liste de
    // paramètres différente dans la même classe. Ce phénomène s'appelle la SURCHARGE (overloading).
    public int add(int x) {
        return x + V3;
    }
}
