package MainPackage;
import Package1.ClassB;
import Package1.ClassC;
public class MainClass {
    public static void main(String[] args) {
        partieA();
        System.out.println();
        partieB();
    }
    private static void partieA() {
        // Question 3
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        // Question 4
        System.out.println("=== Partie A - Question 4 ===");
        System.out.println("a.V1 = " + a.V1);
        // System.out.println(a.V2);
        System.out.println("a.V3 = " + a.V3);
        System.out.println("a.V4 = " + a.V4);
        System.out.println("b.V1 = " + b.V1);
        // System.out.println(b.V2);
        // System.out.println(b.V3);
        // System.out.println(b.V4);
        // Réponse Question 4 : V2 (privé) est inaccessible dans les deux classes.
        // Pour ClassA (même package que MainClass) : V1, V3 et V4 sont accessibles.
        // Pour ClassB (autre package) : seul V1 (publique) est accessible ; V2, V3 et V4
        // provoquent une erreur de compilation.
        // Question 5
        System.out.println("\n=== Question 5 ===");
        System.out.println("a.getV2() = " + a.getV2());
        System.out.println("b.getV2() = " + b.getV2());
        // Question 6
        System.out.println("\n=== Question 6 ===");
        a.setV2(20);
        b.setV2(30);
        System.out.println("a.getV2() = " + a.getV2());
        System.out.println("b.getV2() = " + b.getV2());
        // Question 7
        System.out.println("\n=== Question 7 ===");
        System.out.println("a.add() = " + a.add());
        // Question 8
        System.out.println("\n=== Question 8 ===");
        System.out.println("a.add(10) = " + a.add(10));
        // Question 9
        System.out.println("\n=== Question 9 ===");
        ClassC c = new ClassC();
        System.out.println("c.add() = " + c.add());
    }
    private static void partieB() {
        // Question d
        System.out.println("=== Partie B - Question d ===");
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        animal.sound();
        cat.sound();
        dog.sound();
        // Réponse d : chaque objet affiche son propre message. Cat et Dog redéfinissent (override)
        // la méthode sound() héritée de Animal : la version de la classe fille remplace celle de
        // la classe mère (polymorphisme).
        // Question e
        System.out.println("\n=== Question e ===");
        cat.displayName();
        dog.displayName();
        // Réponse e : Cat affiche "Cat" et Dog affiche "Dog". Cat et Dog ne redéclarent pas
        // l'attribut Name : il n'existe qu'un seul Name par objet, hérité de Animal, donc
        // this.Name et super.Name désignent la même variable, dont la valeur a été changée par
        // le constructeur.
        // Question f
        System.out.println("\n=== Question f ===");
        Animal A = new Cat();
        A.sound();
        // Réponse f : c'est l'UPCASTING (surclassement) : un objet Cat est référencé par une
        // variable de type Animal.
        // Question g
        // A.displayName();
        // Réponse g : erreur de compilation. Le compilateur se base sur le type déclaré (Animal),
        // qui ne possède pas de méthode displayName().
        // Question h
        System.out.println("\n=== Question h ===");
        ((Cat) A).displayName();
        // Réponse h : le DOWNCASTING (cast explicite de Animal vers Cat) : ((Cat) A).displayName();
    }
}
