package giovanni.GestionePrenotazioni.service;

import giovanni.GestionePrenotazioni.entitites.Postazione;
import giovanni.GestionePrenotazioni.entitites.Prenotazione;
import giovanni.GestionePrenotazioni.repository.PrenotazioneRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PrenotazioneService {

    private PrenotazioneRepository prenotazioneRepository;

    public PrenotazioneService(PrenotazioneRepository prenotazioneRepository) {
        this.prenotazioneRepository = prenotazioneRepository;
    }

    public void savePrenotazione(Prenotazione prenotazione) {

        prenotazioneRepository.save(prenotazione);
        System.out.println("prenotazione " + prenotazione + " salvata ");
    }
}
