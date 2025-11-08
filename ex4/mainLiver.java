import java.util.ArrayList;
// wWHAY THE FUCK I CAN'T CREAT FUCKING  SIMPLE TYPES OF FUNCTION IN THIS FILE OF
import java.util.Scanner;

public class mainLiver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Liver> l1 = new ArrayList<>();

        Liver book1 = new Liver("mobydeck", "fin", 33);
        doubl_verifecation(book1,l1);
        Liver book2 = new Liver("bonjour", "frank", 88);
        doubl_verifecation(book2,l1);
        Liver book3 = new Liver("bonjour", "frank", 66);
        doubl_verifecation(book3,l1);

        System.out.println("Nombre total de livers :"+size_beb(l1));
        System.out.println("Liste des livers : ");
        afficher(l1);
        System.out.println("recherch dun auteur: ");
        System.out.print("entre nom de auteur: ");
        String search_autre=scanner.nextLine();
        System.out.println("Livers de cet auteur: ");
        search(search_autre, l1);
        scanner.close();


        



        
        

    }

    // WAY HERE DOESN'T NEED THE <Liver> BUT IN SECOND FCT IST MANDATORY OBLIGATIDE FOR CODE TO WORK

    static void doubl_verifecation( Liver a,ArrayList<Liver> lis){
            if  (fct_contain(a,lis)){
                lis.add(a);
            }
                
        }
        
    static boolean fct_contain(Liver a,ArrayList<Liver> h){
        boolean result =true;
        for(Liver b : h)
        {
            if(b.get_auteur().equals(a.get_auteur()) 
            && b.get_titre().equals(a.get_titre())){
                result= false;
                break;
            }
        }
        return result;
    }
    static void search(String a,ArrayList<Liver> h){
        
        for(Liver b :h)
        {
            if(b.get_auteur().equals(a)){
                System.out.println("- "+b.get_titre());
            }
        }
    }
    static void afficher(ArrayList<Liver> lis){
        int i=1;
        for(Liver b:lis){
            System.out.println(i+b.get_titre()+" | "+b.get_auteur()+" | "+b.get_prix()+" DH");
        }
    }
    static int  size_beb(ArrayList<Liver> list){
        return list.size();
    }
    
}/*
file Liver.java containe :
import java.util.ArrayList;

public class Liver{
    private String titre;
    private String auteur;
    private double prix;

    public Liver(String titre,String auteur,double prix ){
        set_auteur(auteur);
        set_titre(titre);
        set_prix(prix);
    }

    public void set_titre(String titre){
        this.titre=titre;
    }
    public void set_auteur(String auteur){
        this.auteur=auteur;
    }
    public void set_prix(double prix){
        this.prix=prix;
    }

    public String get_titre(){
        return titre;
    }
    public String get_auteur(){
        return auteur;
    }
    public double get_prix(){
        return prix;
    }  
    
}

 */

