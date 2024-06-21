package giovanni.GestionePrenotazioni.entitites;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Utente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;
    private String username;
    private String nomeCompleto;
    private String mail;

    @OneToMany(mappedBy = "utente")
    private List<Prenotazione> prenotazioneList;


    public Utente(String username, String nomeCompleto, String mail) {
        this.username = username;
        this.nomeCompleto = nomeCompleto;
        this.mail = mail;
    }
}

