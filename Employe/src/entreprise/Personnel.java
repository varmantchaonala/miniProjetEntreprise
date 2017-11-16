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
public class Personnel {
    
    private Employe[] collectionEmpl;
    private int nbreEmploye; // nombre des employés de l'entreprise
    private final static int nbremaxemploye=200;//nombre maximal d'employés que peut comtenir l'entreprise
    
    
    public Personnel(){
        //mon tableau est appelé colectionEmpl.
        
        collectionEmpl=new Employe[nbremaxemploye];
        nbreEmploye=0;
    }
    
    public void ajouterEmploye(Employe e){
        
        ++nbreEmploye;
        
        if(nbreEmploye<=nbremaxemploye)
        {
            collectionEmpl[nbreEmploye-1]=e;
        } 
        else 
            System.out.println("pas plus de "+nbremaxemploye+" employés ");
        
    }
    
    public double salaireMoyen(){
        double som=0.0;
        
        for(int i=0;i<nbreEmploye;i++){
            som+=collectionEmpl[i].calculerSalaire();
        }
        
        return som/nbreEmploye;
    }
    
    public void afficherSalaire(){
        
        for(int i=0;i<nbreEmploye;i++){
            System.out.println(collectionEmpl[i].getNom()+" gagne "+collectionEmpl[i].calculerSalaire()+" francs. ");
        }
    }
}
