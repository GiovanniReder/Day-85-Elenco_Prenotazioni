
package giovanni.GestionePrenotazioni;

import giovanni.GestionePrenotazioni.entitites.Edificio;
import giovanni.GestionePrenotazioni.entitites.Postazione;
import giovanni.GestionePrenotazioni.entitites.Prenotazione;
import giovanni.GestionePrenotazioni.entitites.Utente;
import giovanni.GestionePrenotazioni.enums.TipoEnum;
import giovanni.GestionePrenotazioni.service.EdificioService;
import giovanni.GestionePrenotazioni.service.PostazioneService;
import giovanni.GestionePrenotazioni.service.PrenotazioneService;
import giovanni.GestionePrenotazioni.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component
public class MyRunner implements CommandLineRunner {

@Autowired
private UtenteService utenteService;

@Autowired
private EdificioService edificioService;

@Autowired
private PostazioneService postazioneService;

@Autowired
private PrenotazioneService prenotazioneService;

    @Override

    public void run(String... args) throws Exception {
        System.out.println("runner");
        Utente utente1 = new Utente("Giacomino" , " giacomo miceli" , "giacomic@epi.it");
        Utente utente2 = new Utente("Peppino" , " peppino di capri" , "peppe@epi.it");
        Utente utente3 = new Utente("Franco" , " franchino " , "frank@epi.it");
        Utente utente4 = new Utente("Lucio" , "lucio dalla" , "lucino@epi.it");
        Utente utente5 = new Utente("Giulio" , " giuliothetop" , "eatgiulio@epi.it");

       utenteService.saveUtente(utente1);
     //  utenteService.saveUtente(utente3);
     //  utenteService.saveUtente(utente4);
     //  utenteService.saveUtente(utente5);


        Edificio edificio = new Edificio("Palazzo riunioni" , " via epici 22" , "Las Vegas");
        edificioService.saveEdificio(edificio);


        Postazione postazione = new Postazione(edificio , 20 , TipoEnum.SALA_RIUNIONI , "piccola sala riunioni situata al 5 piano");
      postazioneService.savePostazione(postazione);



        LocalDate prenotazione1 = LocalDate.ofEpochDay(2024-5-12);
        Prenotazione prenotazione = new Prenotazione(prenotazione1, utente1 ,postazione);
utenteService.prenotaSala(prenotazione , postazione);

        prenotazioneService.savePrenotazione(prenotazione);

    }
}
