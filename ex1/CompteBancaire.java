
public class CompteBancaire{
    private String numeroCompte;
    private double solde;

    public CompteBancaire(){
        numeroCompte="";
        solde=0;
    }


    public void deposer(double montant){
        if (montant>=0) {
            set_solde(montant);
            System.out.println("dep de "+ montant + " DH effectu.");
            }
        else            System.out.println("Invalide operation ");
    }


    public void retirer(double montant){
        if (montant>=0 && solde>=montant)   {
            set_solde(-montant);
            System.out.println("Detrai de "+ montant + " DH effectu.");}
        else                                
            System.out.println("Invalide operation ");
    }                                         
    public void affivherInfos(){
        System.out.println("Compte: "+get_numeroCompte()+"| Solde: "+get_solde());
    }


    public void set_solde(double solde){
        this.solde+=solde;
       
    }
    public void set_compt(String numeroCompte){
        this.numeroCompte = numeroCompte ;

    }
    public double get_solde(){
        return solde;
    }
    public String get_numeroCompte(){
        return numeroCompte;
    }
}
