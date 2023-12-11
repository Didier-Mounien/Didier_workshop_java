/*
** EPITECH PROJECT, 2023
** training classes
** File description:
** workshop 11/12/23
*/

public class Vehicule {
    String Brand;
    String Modele;
    int Annee;

    public Vehicule(String brand, String modele, int annee) {
        Brand = brand;
        Modele = modele;
        Annee = annee;
    }
    public void accelerate() {
        System.out.println("I'm putting the pedal to the metal");
    }

    public void brake() {
    System.out.println("Woah! Slow down boy!");
    }

    public void describe() {
        System.out.println("The model : " + Brand + " " + Modele + " the year of construction " + Annee);
    }
}
