package ftn.alinfo.webapp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewsItemDTO {
    private String id;
    private String title;
    private String excerpt;
    private String date;
    private String imageUrl;
    private String category;
}