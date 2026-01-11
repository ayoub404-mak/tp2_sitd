
/*public class CompteBancaire{
    private String numeroCompte;
    private double solde;

    public CompteBancaire(){
        numeroCompte="0000";
        solde=0;
    }
    public CompteBancaire( String numeroCompte,double solde){
        set_compt(numeroCompte);
        set_solde(solde);
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
            set_solde(-montant);// faire attention a la moin(-)
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
   

 class Bancaire {
     //3lax mni kandiklaret mes variable hna publice mn9drx n9rahom f file bancaire
    public static void main(String[] args) {
        CompteBancaire c1= new CompteBancaire();
        c1.set_solde(1000);
        c1.set_compt("abc123");
        c1.affivherInfos();
        c1.deposer(5000);
        c1.retirer(3000);
        System.out.println("final solde : "+c1.get_solde());
   
    }

    
}

     
*/

public class CompteBancaire {

    private String numeroCompte;
    private double solde;

    CompteBancaire(){

    }
    CompteBancaire(String numeroCompte,double solde){
        this.numeroCompte=numeroCompte;
        this.solde=solde;
    }
    public void deposer(double montant){
        if(montant >0)
        {solde+=montant;System.out.println("depo de "+montant+"effectue");}

        else 
            errur();
        
    }
    public void retirer (double montant){
        if(montant>0)
        {solde-=montant;System.out.println("retrais de "+montant+"effectue");}
        else 
            errur();
    }
    public void errur(){
        System.out.println("montont invalide");
    }
    public void affich(){
        System.out.println("compt: "+numeroCompte+"|solde : "+solde);
    }
    public void  set_solde(double solde){
        this.solde=solde;
    }
    public void set_compt(String numeroCompte){
        this.numeroCompte=numeroCompte;
    }
    public double get_solde(){
        return solde;
    }

}
 
class test {
    public static void main(String[] args) {
        CompteBancaire c1= new CompteBancaire();
        c1.set_solde(1000);
        c1.set_compt("abc123");
        c1.affich();
        c1.deposer(5000);
        c1.retirer(3000);
        System.out.println("final solde : "+c1.get_solde());
   
    }

    
}