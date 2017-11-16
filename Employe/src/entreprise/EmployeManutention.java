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
public class EmployeManutention extends Employe {
    
   public final static double multiplicateurhoraire=65.0; 
   private int nombreHeureTravail;
    
    
    //constructeur
   public EmployeManutention (String matriculeEmploye,String nomemploye,String prenomEmploye,int ageEmploi,String anneEmb,int nbreHeure ){
    super(matriculeEmploye,nomemploye,prenomEmploye,ageEmploi,anneEmb);
    nombreHeureTravail=nbreHeure;
    
}
   
   @Override
   public String getType(){
       return("Le manutentionnaire: ");
   }
   
    @Override
   public double calculerSalaire(){
       return nombreHeureTravail*multiplicateurhoraire+salairebase;
       
   }
    
}
