package ftn.alinfo.webapp.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "news_items")
@NoArgsConstructor
@AllArgsConstructor
public class NewsItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String title;
    
    @Column(length = 1000)
    private String excerpt;
    
    @Column(nullable = false)
    private LocalDateTime date;
    
    private String imageUrl;
    
    @Column(nullable = false)
    private String category;
}