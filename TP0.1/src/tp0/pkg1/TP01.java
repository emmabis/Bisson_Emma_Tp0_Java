/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0.pkg1;

/**
 *
 * @author emmab
 */
public class TP01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaration des variables
        int nb; // nombre d'entiers a additionner
        int result; // resultat
        int ind; // indice
        nb=5; 
        result=0;
        
        // Addition des nb premiers entiers
        ind=1;
        while (ind <= nb ) {
            result=result+ind;
            ind++; // Augmente ind de 1 à chaque tour
        }
        
        //Affichage du résultat
        System.out.println();
        System.out.println("La somme des"+ nb +"entiers est: "+result);
    }
    
}
