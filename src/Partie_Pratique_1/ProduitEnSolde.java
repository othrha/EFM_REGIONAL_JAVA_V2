package Partie_Pratique_1;


import java.io.IOException;

public class ProduitEnSolde extends Produit{
    private int remise;


    public int getRemise() {
        return remise;
    }
    public void setRemise(int remise) throws IOException {
        if (remise<0 || remise>90)
            this.remise=remise;
            throw new IOException("La remise doit etre comprise dans l'intervalle [0,90]");
    }

    public ProduitEnSolde(int code, double prix_origine, int remise) throws IOException {
        super(code, prix_origine);


        if (remise<0 || remise>90)
            throw new IOException("La remise doit etre comprise dans l'intervalle [0,90]");
        this.remise=remise;


    }

    @Override
    public String toString() {
        return super.toString() + "; remise = " + remise ;
    }

    @Override
    public double prixProduit() {

        return getPrix()*(remise/100);
    }


}
