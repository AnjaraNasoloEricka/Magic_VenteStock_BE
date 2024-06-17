package mg.linformagique.magicventestockbe.services;

import mg.linformagique.magicventestockbe.models.Produit;
import mg.linformagique.magicventestockbe.repository.ProduitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService {
    private final ProduitRepository produitRepository;
    public ProduitService(
            ProduitRepository produitRepository
    ) {
        this.produitRepository = produitRepository;
    }

    public Produit getProduitDuJour() {
        return produitRepository.getProduitDuJour();
    }

    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }
}
