package giovanni.GestionePrenotazioni.repository;

import giovanni.GestionePrenotazioni.entitites.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UtenteRepository extends JpaRepository<Utente , Long> {
    @Query("SELECT u FROM postazione WHERE u.tipo = 'SALA_RIUNIONI'")
    List<Utente> filterBySalaRiunioni();

}
