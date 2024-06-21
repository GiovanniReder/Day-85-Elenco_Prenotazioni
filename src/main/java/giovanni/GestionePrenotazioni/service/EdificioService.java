package giovanni.GestionePrenotazioni.service;

import giovanni.GestionePrenotazioni.entitites.Edificio;
import giovanni.GestionePrenotazioni.entitites.Utente;
import giovanni.GestionePrenotazioni.repository.EdificioRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EdificioService {

    private final EdificioRepository edificioRepository;

    public EdificioService(EdificioRepository edificioRepository) {
        this.edificioRepository = edificioRepository;
    }

    public void saveEdificio(Edificio edificio) {

        edificioRepository.save(edificio);
        System.out.println("edificio " + edificio + " salvato ");
    }

}
