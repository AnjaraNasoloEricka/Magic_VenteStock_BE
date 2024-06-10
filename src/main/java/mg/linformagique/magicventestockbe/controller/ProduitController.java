package mg.linformagique.magicventestockbe.controller;

import mg.linformagique.magicventestockbe.models.Produit;
import mg.linformagique.magicventestockbe.services.ProduitService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produit")
public class ProduitController {
    private final ProduitService produitService;

    public ProduitController(
            ProduitService produitService
    ) {
        this.produitService = produitService;
    }

    @GetMapping("/produit-du-jour")
    public Produit getProduitDuJour() {
        return produitService.getProduitDuJour();
    }
}
