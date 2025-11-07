import javax.print.DocFlavor.STRING;

public class Etudiant {
    private String nom;
    private double note;

    public Etudiant(String nom,double note){
        set_nom(nom);
        set_note(note);
    }
    public void set_nom(String nom){

        // 3LACH HNA MARADAMAX DIK NOM.ISEMTHY() [KAYNA WAHDA JDIDA NOM.ISBLANK()]
        
        if ( nom.equals("") || nom==null)
            System.out.println("nom vide invalide !");
        else this.nom=nom;

    }
    public void set_note(double note){
        if (note<=20 && note>=0 ){
            this.note=note;
        }
        else System.out.println("note invalide !"); 
    }
    public String get_nome(){
        return nom;
    }
    public double get_note(){
        return note;
    }
    public void afficher(){

        System.out.println("nom: "+nom+"| note : "+note);
    }

}
