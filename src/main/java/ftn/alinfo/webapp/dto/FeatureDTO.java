package ftn.alinfo.webapp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeatureDTO {
    private String id;
    private String title;
    private String description;
    private String link;
}