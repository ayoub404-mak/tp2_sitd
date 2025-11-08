public class Liver{
    private String titre;
    private String auteur;
    private double prix;

    public Liver(String titre,String auteur,double prix ){
        set_auteur(auteur);
        set_titre(titre);
        set_prix(prix);
    }

    public void afficher(){
        System.out.println("Liver : "+get_titre()+" | Autour : "+get_auteur()+" | prix : "+get_prix());
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


 //3LAX MAKATBRIX TRDAM ILA DRT MAIN F CLASS RERA O 9BILA AH


    public static void main(String[] args) {
        Liver [] l1 = new Liver[3];
        l1[0]=new Liver("my strugel", "hitler",10);
        l1[1]=new Liver("there will be blood", "master", 1000);
        l1[2]=new Liver("1984", "orwell", 1073);

        // is ir possible to do the for(int num : numbers)
        
        //for(Liver i: l1)
        //{l1.afficher();}

        for(int i=0 ; i<3; i++){
            l1[i].afficher();
        }
    }
   
    
}

