
public class Personne {

    private String nom;
    private String prenom;
    private int age;

    public Personne(){
        
    }
    public Personne(String nom,String prenom,int age){
        set_age(age);
        set_nom(nom);
        set_prenom(prenom);
    }

    public void set_nom(String nom){
        this.nom=nom;
    }
    public void set_prenom(String prenom){
        this.prenom=prenom;
    }
    public void set_age(int age){
        this.age=age;
    }

    public String get_nom(){
        return nom;
    }
    public String get_prenom(){
        return prenom;
    }
    public double get_age(){
        return age;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Personne autre = (Personne) obj;
        return age == autre.age &&
               nom.equals(autre.nom) &&
               prenom.equals(autre.prenom);
    }

    @Override
        public int hashCode() {
        return nom.hashCode() + prenom.hashCode() + age;
        }

    @Override
    public String toString(){
        return "personne[nom="+get_nom()+" prenom="+get_prenom()+" age="+get_age()+"]";
    }
}

/*

//-----FILE : mainPersonne.java


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


 */
