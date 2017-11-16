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
public class EmployeProduction extends Employe {
  
    
  public final static double multiplicateur=5.0;   
  private  int nombreUnite;
  
    
    //constructeur
   public EmployeProduction (String matriculeEmploye,String nomemploye,String prenomEmploye,int ageEmploi,String anneEmb,int nbreUnite ){
    super(matriculeEmploye,nomemploye,prenomEmploye,ageEmploi,anneEmb);
    nombreUnite=nbreUnite;
    
}
   
  @Override
   public String getType(){
       return ("Le Producteur: ");
   }
   
  @Override
   public double calculerSalaire(){
       
     return  nombreUnite*multiplicateur+salairebase;
     
   }
}
