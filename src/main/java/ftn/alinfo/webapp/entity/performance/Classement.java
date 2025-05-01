package ftn.alinfo.webapp.entity.performance;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Classement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classementId;

    @Column(nullable = false, length = 20) // Ex: "2024-2025"
    private String saison;

    @Column(length = 100) // Ex: "100m Nage Libre Hommes 17+"
    private String typeEpreuve; // Combinaison d'infos


}


