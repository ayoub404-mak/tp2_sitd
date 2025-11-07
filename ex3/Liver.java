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
        System.out.println("Liver : "+titre+" | Autour : "+auteur+" | prix : "+prix);
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
