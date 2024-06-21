package giovanni.GestionePrenotazioni.repository;

import giovanni.GestionePrenotazioni.entitites.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EdificioRepository extends JpaRepository<Edificio , Long> {
}
