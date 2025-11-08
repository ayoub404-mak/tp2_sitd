package ex5;
import java.util.*;
public class Personne {
    private String nom;
    private String prenom;
    private int age;

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
        return nom.equals(autre.nom) &&
               prenom.equals(autre.prenom);
    }
    

}

 class mainPersonne {
    public static void main(String[] args) {
        Personne p1 = new Personne("jack","fin",12);
        Personne p2 = new Personne("jack","fin",12);

        System.out.println("p1.equals(p2)  "+p1.equals(p2));
        p2.set_age(4);
        System.out.println("apre modif age  "+p1.equals(p2));
                p2.set_age(12);
        System.out.println("apre surcharge equals(personne)  "+p1.equals(p2));
        
        var  list1 = new ArrayList<Personne>();

        list1.add(p1);
        list1.add(p2);

        ArrayList<Personne> list2 = new ArrayList<>(
            List.of(
                new Personne("jack","fin",12),
                new Personne("jack","fin",13)
                )
            );
        
        System.out.println("list1.equals(list2) "+list1.equals(list2));
        System.out.println("apres equals(object ) sur nom et prenom "+list1.equals(list2));

        // OR YOU CAN DO 
        /*ArrayList<Person> list = new ArrayList<>(List.of(
    new Person("Ayoub", 20),
    new Person("Sara", 22)));*/

        

    }

  /*  the best what my brean comme with it -----hands up
  
  static boolean equals(ArrayList<Personne> autre2,ArrayList<Personne> autre1){
        boolean result=true;
            for(Personne h : autre2){
                if(!autre1.contains(h))
                        {result =false;break;}
        }
        
        return result;
    }
*/
     

   
}
 