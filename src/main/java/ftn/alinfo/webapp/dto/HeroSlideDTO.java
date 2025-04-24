package ftn.alinfo.webapp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HeroSlideDTO {
    private String id;
    private String title;
    private String subtitle;
    private String image;
    private String link;
}