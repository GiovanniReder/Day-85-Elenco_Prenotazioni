
package giovanni.GestionePrenotazioni;

import giovanni.GestionePrenotazioni.entitites.Utente;
import giovanni.GestionePrenotazioni.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
@Autowired
private UtenteService utenteService;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("runner");
     /*   Utente utente1 = new Utente("Giacomino" , " giacomo miceli" , "giacomic@epi.it");
        Utente utente2 = new Utente("Peppino" , " peppino di capri" , "peppe@epi.it");
        Utente utente3 = new Utente("Franco" , " franchino " , "frank@epi.it");
        Utente utente4 = new Utente("Lucio" , "lucio dalla" , "lucino@epi.it");
        Utente utente5 = new Utente("Giulio" , " giuliothetop" , "eatgiulio@epi.it");

       utenteService.saveUtente(utente2);
       utenteService.saveUtente(utente3);
       utenteService.saveUtente(utente4);
       utenteService.saveUtente(utente5);


      */

    }
}


