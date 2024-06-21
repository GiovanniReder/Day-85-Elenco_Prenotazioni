package giovanni.GestionePrenotazioni.repository;

import giovanni.GestionePrenotazioni.entitites.Postazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione , Long> {


}
