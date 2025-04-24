package ftn.alinfo.webapp.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

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
}