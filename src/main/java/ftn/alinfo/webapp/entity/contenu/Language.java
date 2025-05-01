package ftn.alinfo.webapp.entity.contenu;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Language {

    @Id
    @Column(length = 5) // ex: "fr", "ar", "en"
    private String code;

    @Column(nullable = false, length = 50)
    private String nom;
}

