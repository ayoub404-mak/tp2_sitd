
import java.util.HashSet;

public class mainPersonne {
    public static void main(String[] args) {
        HashSet<Personne> set1 =new HashSet<>();
        HashSet<Personne> set2 =new HashSet<>();
        Personne p1 = new Personne("hel","bel",12);
        Personne p2 = new Personne("hel","bel",12);
        Personne p3 = new Personne("hel","bel",12);
        Personne p4 = new Personne("bel","jhon",21);
        
        set1.add(p1);
        set1.add(p2);
        set2.add(p3);
        set2.add(p4);

        System.out.println(set1.equals(set2));

        System.out.println("liste 1; ");
        System.out.println(set1);
        System.out.println("liste 2; ");
        System.out.println(set2);

    }
}

