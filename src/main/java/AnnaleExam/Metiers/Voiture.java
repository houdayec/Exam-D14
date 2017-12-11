package AnnaleExam.Metiers;

import AnnaleExam.Interfaces.iMotorise;

public class Voiture extends Vehicule implements iMotorise {

    public Voiture(String nom) {
        super(nom);
    }


    public double getPuissance() {
        return 0;
    }
}
