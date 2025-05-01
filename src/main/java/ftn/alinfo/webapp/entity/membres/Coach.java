package ftn.alinfo.webapp.entity.membres;

import ftn.alinfo.webapp.entity.securite.Utilisateur;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;


@Entity
@DiscriminatorValue("COACH")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Coach extends Utilisateur {

    @Column(length = 50)
    private String niveauCertification;

    // Relations
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "club_id")
    private Club clubAffilie;

    @OneToMany(mappedBy = "coach")
    private Set<ReservationPiste> reservationsFaites = new HashSet<>();

}

