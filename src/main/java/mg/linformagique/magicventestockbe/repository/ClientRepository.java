package mg.linformagique.magicventestockbe.repository;

import mg.linformagique.magicventestockbe.models.Client;
import org.springframework.data.repository.Repository;

public interface ClientRepository extends Repository<Client, Integer> {
    Client getClientByPseudoAndMotDePasse(String pseudo, String motDePasse);
}
