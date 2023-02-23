package Partie_Pratique_1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Boutique {
    ArrayList<Produit> produitalpha = new ArrayList<>();

    public int indiceDe(int code){
        int i=0;
        for (Produit p : produitalpha){
            if (p.code==code)
                return i;
            i++;
        }
        return -1;
    }
    public void ajouter(Produit p) throws IOException {
        if (produitalpha.contains(p))
            throw new IOException("Le produit appartient deja a la boutique");
        produitalpha.add(p);
    }
    public boolean supprimer(int code){
        for (Produit p : produitalpha){
            if (p.code==code){
                produitalpha.remove(p);
                return true;
            }
        }
        return false;
    }
    public boolean supprimer(Produit p){
        if (produitalpha.contains(p)){
            produitalpha.remove(p);
            return true;
        }
        return false;
    }
    public int nombreProduitsEnSolde(){

        return produitalpha.size();
    }
    public void enregister(String chemin) throws IOException {

        FileWriter fichier = new FileWriter(chemin);
        fichier.write(produitalpha.toString());
        fichier.close();
    }
}
