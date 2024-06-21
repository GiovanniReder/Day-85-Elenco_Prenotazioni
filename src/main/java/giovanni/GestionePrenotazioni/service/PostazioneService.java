package giovanni.GestionePrenotazioni.service;

import giovanni.GestionePrenotazioni.entitites.Postazione;
import giovanni.GestionePrenotazioni.entitites.Utente;
import giovanni.GestionePrenotazioni.repository.PostazioneRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PostazioneService {

    private final PostazioneRepository postazioneRepository;

    public PostazioneService(PostazioneRepository postazioneRepository) {
        this.postazioneRepository = postazioneRepository;
    }

    public void savePostazione(Postazione postazione) {

        postazioneRepository.save(postazione);
        System.out.println("postazione " + postazione + " salvata ");
    }
}
