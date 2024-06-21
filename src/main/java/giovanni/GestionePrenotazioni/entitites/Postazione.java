package giovanni.GestionePrenotazioni.entitites;

import giovanni.GestionePrenotazioni.enums.TipoEnum;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;
    private String descrizione;
    @Enumerated(EnumType.STRING)
    private TipoEnum tipo;
    private int maxOccupanti;
    @ManyToOne
    @JoinColumn(name = "edificio_id")
    private Edificio edificio;

    @OneToMany(mappedBy = "postazione")
    private List<Prenotazione> prenotazioneList;

    public Postazione(Edificio edificio, int maxOccupanti, TipoEnum tipo, String descrizione) {
        this.edificio = edificio;
        this.maxOccupanti = maxOccupanti;
        this.tipo = tipo;
        this.descrizione = descrizione;
    }
}
