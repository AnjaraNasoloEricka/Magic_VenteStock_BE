package mg.linformagique.magicventestockbe.controller;

import mg.linformagique.magicventestockbe.models.Produit;
import mg.linformagique.magicventestockbe.services.ProduitService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/produits")
public class ProduitController {
    private final ProduitService produitService;

    public ProduitController(
            ProduitService produitService
    ) {
        this.produitService = produitService;
    }

    @GetMapping("/produit-du-jour")
    public ResponseEntity<Produit> getProduitDuJour() {
        return ResponseEntity.ok(produitService.getProduitDuJour());
    }

    @GetMapping
    public ResponseEntity<List<Produit>> getProduits() {
        return ResponseEntity.ok(produitService.getAllProduits());
    }
}
