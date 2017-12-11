package AnnaleExam.Metiers;

import AnnaleExam.Interfaces.iVolant;

public class Planeur extends Vehicule implements iVolant {

    public Planeur(String nom) {
        super(nom);
    }


    public double getAltitudeMax() {
        return 0;
    }
}
