package mg.linformagique.magicventestockbe.controller;

import mg.linformagique.magicventestockbe.models.Client;
import mg.linformagique.magicventestockbe.services.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/client")
public class ClientController {
    private final ClientService clientService;
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/connexion")
    public ResponseEntity<Client> connexion(@RequestBody Client client) {
        Client result = clientService.connexionClient(client.getPseudo(), client.getMotDePasse());
        if (result == null) {
            return ResponseEntity.badRequest().body(null);
        }
        return ResponseEntity.ok(result);
    }
}
