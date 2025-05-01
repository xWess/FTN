package ftn.alinfo.webapp.entity.contenu;
import ftn.alinfo.webapp.entity.securite.Admin;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "hero_slides")
@NoArgsConstructor
@AllArgsConstructor
public class HeroSlide {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private String subtitle;

    @Column(nullable = false)
    private String image;

    private String link;

    @ManyToOne
    @JoinColumn(name = "gestionnaire_id")
    private Admin gestionnaire;
}

