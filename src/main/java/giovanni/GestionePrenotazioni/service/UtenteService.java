package giovanni.GestionePrenotazioni.service;

import giovanni.GestionePrenotazioni.entitites.Utente;
import giovanni.GestionePrenotazioni.repository.UtenteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UtenteService {

    private UtenteRepository utenteRepository;

    public void saveUtente(Utente utente) {

        utenteRepository.save(utente);
        System.out.println();
    }
     
}
