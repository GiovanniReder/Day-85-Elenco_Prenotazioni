package giovanni.GestionePrenotazioni.repository;

import giovanni.GestionePrenotazioni.entitites.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteRepository extends JpaRepository<Utente , Long> {

}
