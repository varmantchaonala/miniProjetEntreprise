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
public  class Production extends EmployeProduction implements Dangereux {
    
     
    
    
    //constructeur
     public Production (String matriculeEmploye,String nomemploye,String prenomEmploye,int ageEmploi,String anneEmb,int nbreUnite ){
    super(matriculeEmploye,nomemploye,prenomEmploye,ageEmploi,anneEmb,nbreUnite);
    
    
}
     
     //implemention de l'interface
     @Override
     public double calculerSalaire(){
         
         return super.calculerSalaire()+PRIME;
         
       
     }
    
}
