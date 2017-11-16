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
abstract class EmployeCommercial extends Employe {
    
  double chiffreDaffaire;
  
  //le constructeur de notre classe
    
    public EmployeCommercial(String matriculeEmploye,String nomemploye,String prenomEmploye,int ageEmploi,String anneEmb,double chifAffaire ){
        
         super(matriculeEmploye,nomemploye,prenomEmploye,ageEmploi,anneEmb);
         chiffreDaffaire=chifAffaire;
    }
    
    /*notre attribut chiffreAffaire est declaré privé 
    dont on a besoin d'un accesseur pour pouvoir l'utiliser plutard à l'exterieur de classe
    */
    
    public double getChiffreDaffaire(){
        return chiffreDaffaire;
    }
    
}
