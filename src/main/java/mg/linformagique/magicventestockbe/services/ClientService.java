package mg.linformagique.magicventestockbe.services;

import mg.linformagique.magicventestockbe.models.Client;
import mg.linformagique.magicventestockbe.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client connexionClient(String pseudo, String password) {
        return clientRepository.getClientByPseudoAndMotDePasse(pseudo, password);
    }
}
