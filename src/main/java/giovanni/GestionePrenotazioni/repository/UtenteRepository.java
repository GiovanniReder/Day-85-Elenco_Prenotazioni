package giovanni.GestionePrenotazioni.repository;

import giovanni.GestionePrenotazioni.entitites.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteRepository extends JpaRepository<Utente, Long> {
}
