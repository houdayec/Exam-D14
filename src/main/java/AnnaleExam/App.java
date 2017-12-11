package AnnaleExam;

import AnnaleExam.Metiers.Planeur;
import AnnaleExam.Metiers.Vehicule;
import AnnaleExam.Metiers.Voiture;

import java.io.*;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException {
        /**
         * Iterate and display object
         */
        Set<Vehicule> treeSetVehicules = new TreeSet<Vehicule>();

        Voiture v1 = new Voiture("Peugeot 2056");
        Voiture v2 = new Voiture("Renault Megane");

        Planeur p1 = new Planeur("Albatros");
        Planeur p2 = new Planeur("Zorg");

        treeSetVehicules.add(v1);
        treeSetVehicules.add(v2);
        treeSetVehicules.add(p1);
        treeSetVehicules.add(p2);

        System.out.println("Elements of treeSetVehicules");
        Iterator<Vehicule> listIterator = treeSetVehicules.iterator();
        while (listIterator.hasNext()){
            Vehicule vehiculeToDisplay = listIterator.next();
            System.out.println(vehiculeToDisplay.toString());
        }
        System.out.println("-------------");

        /**
         * Store objects in file
         */
        try {
            //Declare outputs streams
            FileOutputStream fileOutputStream = new FileOutputStream(new File("data.txt"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            //Write objects
            for (Vehicule vehi : treeSetVehicules ) {
                objectOutputStream.writeObject(vehi);
            }

            System.out.println("Objects written in file data.txt");
            //Close outputs
            objectOutputStream.close();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("-------------");

        /**
         * Read objects from file
         */
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("data.txt"));
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            if(objectInputStream != null){
                Vehicule vehi;
                while((vehi = (Vehicule) objectInputStream.readObject()) != null){
                    System.out.println("Retrieved data from file :");
                    System.out.println(vehi);
                }
                objectInputStream.close();
                fileInputStream.close();
            }else{
                System.out.println("ObjectInput null");
            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("-------------");


    }

}
