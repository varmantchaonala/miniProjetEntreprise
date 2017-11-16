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
public class EmployecommercialRepresentation extends EmployeCommercial {
   
    /* declaration des variables necessaires à la classe
      ces variables sont utiles pour les objets de type vendeur
    */
    
    public final static double pourcentage=0.2;
    public final static int Bonus=200;
    
    
     //le contructeur de la classe fille pour les commerciaux de la représentation
    
   
    
    

   public EmployecommercialRepresentation (String matriculeEmploye,String nomemploye,String prenomEmploye,int ageEmploi,String anneEmb,double chifAffaire ){
    super(matriculeEmploye,nomemploye,prenomEmploye,ageEmploi,anneEmb,chifAffaire);
    
    
}
   
    @Override
   public String getType(){
       return ("Le représentateur: ");
   }
 
    @Override
    public double calculerSalaire() {
        
               
       return pourcentage*getChiffreDaffaire()+Bonus+salairebase;
         
    }
 
}
