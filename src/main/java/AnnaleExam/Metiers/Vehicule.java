package AnnaleExam.Metiers;

import java.io.Serializable;

public class Vehicule implements Comparable<Vehicule>, Serializable{

    private String id;
    private String nom;
    public static int currentGeneratedID = 0;

    public Vehicule() {

    }

    public Vehicule(String nom) {
        this.nom = nom;
        this.id = getNextId();
    }

    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    private void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicule vehicule = (Vehicule) o;

        if (id != null ? !id.equals(vehicule.id) : vehicule.id != null) return false;
        return nom != null ? nom.equals(vehicule.nom) : vehicule.nom == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        return result;
    }

    private String getNextId(){
         String newID = "Vehicule" + currentGeneratedID;
         currentGeneratedID++;
         return newID;
    }

    public int compareTo(Vehicule o) {
        int intToReturn = this.nom.compareTo(o.getNom());
        return intToReturn == 0 ? this.nom.compareTo(o.getNom()) : intToReturn;
    }


}
