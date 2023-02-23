package Partie_Pratique_1;

import java.util.Objects;

public class Produit {
    int code;
    double prix;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Produit(int code, double prix) {
        this.code = code;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "code=" + code +
                "; prix_origine=" + prix +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Produit produit)) return false;
        return code == produit.code;
    }
    public double prixProduit(){
        return prix;
    }
}
