package mg.linformagique.magicventestockbe.repository;

import mg.linformagique.magicventestockbe.models.Produit;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface ProduitRepository extends Repository<Produit, Integer> {
    @Query("select p from Produit p where p.estDuJour = true")
    Produit getProduitDuJour();

    List<Produit> findAll();
}
