/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entreprise;

//pour respecter la notion de Orienté Objet on créera plusieurs classes indépendantes interagissantes 

/**
 *
 * @author sony
 */
public  class ClasseTestEntreprise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          /*
        
         TPE:
         UE:POO
         Nom:VARMANTCHAONALA MOUDINA CHARLES
         MATRICULE:16B015FS
         
        */
        
        
        /*
        on mettra des personnels ou employés dans 
        notre tableau ou collection d'employés
        */
        Personnel p=new Personnel();
        p.ajouterEmploye(new EmployecommercialVendeur("AB125","Varmant","charles",27,"1996",3000));
        p.ajouterEmploye(new EmployecommercialRepresentation("AB126","Wati","mario",30,"1995",1000));
        p.ajouterEmploye(new EmployeProduction("AB127","Sajo","jean",25,"1999",1000));
        p.ajouterEmploye(new EmployeManutention("AB128","Petsou","jeani",28,"2000",200));
        p.ajouterEmploye(new Production("AB129","Alain","Moudina",45,"1985",1100));
        p.ajouterEmploye(new Manutention("AB130","Sara","Beatrice",38,"2001",100));
        
        //cette instruction nous permettra d'afficher les noms des personnels et leurs salaires
        p.afficherSalaire();
        //nous permet d'afficher le salaire moyen
        System.out.println("Le salaire moyen est "+p.salaireMoyen()+" francs ");
    }
    
}
