package Package1;
import MainPackage.ClassA;
public class ClassC extends ClassA {
    // Réponse Question 9 : Oui, on peut redéfinir add() dans la classe fille (même signature,
    // nouveau corps). Ce phénomène s'appelle la REDEFINITION (overriding).
    @Override
    public int add() {
        return V1 + V3;
    }
}
