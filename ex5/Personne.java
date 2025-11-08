package ex5;

import java.util.ArrayList;

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

    public boolean equals(Personne autre){
        return (autre.get_nom().equals(get_nom()) 
        &&      autre.get_prenom().equals(get_prenom()) 
        &&      autre.get_age()==get_age());  
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


}
