package ftn.alinfo.webapp.entity.securite;

import ftn.alinfo.webapp.entity.contenu.NewsItem;
import ftn.alinfo.webapp.entity.contenu.HeroSlide;
import ftn.alinfo.webapp.entity.evenements.Event;
import ftn.alinfo.webapp.entity.membres.ReservationPiste;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;



/**
 * Entité représentant un administrateur du système.
 * Hérite de Utilisateur.
 */
@Entity
@DiscriminatorValue("ADMIN") // Valeur pour cette sous-classe dans la colonne user_type
@Data
@EqualsAndHashCode(callSuper = true) // Inclut les champs de la superclasse dans equals/hashCode
@NoArgsConstructor
public class Admin extends Utilisateur {

    @OneToMany(mappedBy = "auteur")
    private Set<NewsItem> newsItemsRediges = new HashSet<>();

    @OneToMany(mappedBy = "gestionnaire")
    private Set<HeroSlide> slidesGeres = new HashSet<>();

    @OneToMany(mappedBy = "createur")
    private Set<Event> eventsCrees = new HashSet<>();

    @OneToMany(mappedBy = "gestionnaireReservation")
    private Set<ReservationPiste> reservationsGerees = new HashSet<>();

    // Les méthodes métier (creerUtilisateur, etc.) sont dans les services, pas l'entité.
}

