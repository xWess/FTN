package ftn.alinfo.webapp.entity.evenements;

import ftn.alinfo.webapp.entity.securite.Admin;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "events")
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String title;
    
    @Column(nullable = false)
    private LocalDateTime dateTime;
    
    @Column(nullable = false)
    private String location;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EventType type;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EventStatus status;
    
    public enum EventType {
        COMPETITION,
        MEETING,
        TRAINING
    }

    public enum EventStatus {
        UPCOMING,
        ONGOING,
        COMPLETED
    }

    @ManyToOne
    @JoinColumn(name = "createur_id")
    private Admin createur;
}
