package Partie_Pratique_1;


public class Main {
    public static void main(String[] args) throws Exception {
        Produit p1 = new Produit(1,200);
        Produit p2 = new Produit(2,180);

        ProduitEnSolde pa1 = new ProduitEnSolde(1,200,30);
        ProduitEnSolde ps2 = new ProduitEnSolde(2,180,20);

       Boutique m = new Boutique();

        pa1.setRemise(40);
        System.out.println(pa1.getRemise());

        System.out.println(p1.equals(p2));
        m.ajouter(pa1);

    }
}
