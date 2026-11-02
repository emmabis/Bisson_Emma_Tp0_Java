/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author emmab
 */
public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Affichage du menu
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");

        // Saisie de l'opérateur
        int operateur = sc.nextInt();

        // Exercice 8 : vérification avant de demander les nombres
        if (operateur < 1 || operateur > 5) {
            System.out.println("Erreur : choisissez un opérateur entre 1 et 5.");
            System.exit(0);
        }

        // Saisie du premier nombre
        System.out.println("Please enter the first number:");
        int operande1 = sc.nextInt();

        // Saisie du deuxième nombre
        System.out.println("Please enter the second number:");
        int operande2 = sc.nextInt();

        // Calcul selon l'opérateur choisi
        switch (operateur) {
            case 1:
                System.out.println("The result is: " + (operande1 + operande2));
                break;

            case 2:
                System.out.println("The result is: " + (operande1 - operande2));
                break;

            case 3:
                System.out.println("The result is: " + (operande1 * operande2));
                break;

            case 4:
                if (operande2 == 0) {
                    System.out.println("Erreur : division par zéro impossible.");
                } else {
                    System.out.println("The result is: " + ((double) operande1 / operande2));
                }
                break;

            case 5:
                if (operande2 == 0) {
                    System.out.println("Erreur : modulo par zéro impossible.");
                } else {
                    System.out.println("The result is: " + (operande1 % operande2));
                }
                break;

            default:
                System.out.println("Erreur : choisissez un opérateur entre 1 et 5.");
                break;
        }

        sc.close();
    }
}
