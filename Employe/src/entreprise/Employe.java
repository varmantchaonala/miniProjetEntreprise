/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entreprise;

/**
 *
 * @author sony
 */
public abstract class Employe {
    
    // declration des attributs necessaires pour la classe 
    
    public final static double salairebase=110000.0;
    private String matricule;
    private String nom;
    private String prenom;
    private int    age;
    private String   anneeDemboche;
    
    
    // definition du constructure de la classe prenant en parametre les attributs necessaire
    
    
    
    public Employe(String matriculeEmploye,String nomemploye,String prenomEmploye,int ageEmploi,String anneEmb ){
        
        
         matricule=matriculeEmploye;
         nom=nomemploye;
         prenom=prenomEmploye;
         age=ageEmploi;
         anneeDemboche=anneEmb;
         
         
         
    } 
    
    // declaration de la methode abstraite calculerSalaire();
    
    /**
     *
     * @return
     */
    public abstract double calculerSalaire();
    
    //declaration de la methode getNom();
    
    
    public String getType(){
        return ("L'employé:");
    }
    
    
    String getNom(){
        
        return (getType()+nom+" "+prenom);  
    }
}

