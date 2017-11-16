

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
public class Manutention extends EmployeManutention implements Dangereux {
    
    //constructeur
     public Manutention (String matriculeEmploye,String nomemploye,String prenomEmploye,int ageEmploi,String anneEmb,int nbreHeure ){
    super(matriculeEmploye,nomemploye,prenomEmploye,ageEmploi,anneEmb,nbreHeure);
    
    
}
     
     
     
    // implementation de l'interface
     
     @Override
     public double calculerSalaire(){
      
         return super.calculerSalaire()+PRIME;
     
     }

}