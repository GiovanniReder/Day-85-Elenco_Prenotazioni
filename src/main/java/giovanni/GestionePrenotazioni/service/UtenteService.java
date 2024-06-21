package giovanni.GestionePrenotazioni.service;

import giovanni.GestionePrenotazioni.entitites.Postazione;
import giovanni.GestionePrenotazioni.entitites.Prenotazione;
import giovanni.GestionePrenotazioni.entitites.Utente;
import giovanni.GestionePrenotazioni.repository.UtenteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UtenteService {

    private final UtenteRepository utenteRepository;

    public UtenteService(UtenteRepository utenteRepository) {
        this.utenteRepository = utenteRepository;
    }

    public void saveUtente(Utente utente) {

        utenteRepository.save(utente);
        System.out.println("utente " + utente + " salvato ");
    }

public void prenotaSala(Prenotazione prenotazione , Postazione postazione){
        prenotazione.setPostazione(postazione);
    System.out.println("Hai prenotato correttamente la sala: " + postazione);
}

}
/*
* un utente può ricercare le postazioni indicando il tipo di postazione e la città
*
*implementare metodo per prenotare, si possono avere più prenotazioni ma solo una prenotazione al giorno
*
* */