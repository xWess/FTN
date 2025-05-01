package ftn.alinfo.webapp.entity.membres;


import ftn.alinfo.webapp.entity.contenu.MediaFile;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class CritereSelection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long critereId;

    @Lob
    @Column(nullable = false)
    private String description;

    @Column(length = 20) // Ex: "2025", "Paris 2024"
    private String saisonApplicable;

    // Relations
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "equipe_id", nullable = false)
    private EquipeNationale equipeNationale;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "media_file_id") // Document PDF lié
    private MediaFile documentLie;
}

