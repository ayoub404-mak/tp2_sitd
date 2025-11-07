package ex5;

import java.util.ArrayList;
import java.util.List;

public class mainPersonne {
    public static void main(String[] args) {
        Personne p1 = new Personne("jack","fin",12);
        

        Personne p2 = new Personne("bel","com",12);
        
        p2.set_age(4);

        System.out.println(p1.equals(p2));
        p2.set_age(12);
        System.out.println(p1.equals(p2));
        
        var  list1 = new ArrayList<Personne>();

        list1.add(p1);
        list1.add(p2);

        ArrayList<Personne> list2 = new ArrayList<>(
            List.of(
                new Personne("jack","fin",12),
                new Personne("bel","com",12)
                )
            );
        
        System.out.println(list1.equals(list2));
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
 