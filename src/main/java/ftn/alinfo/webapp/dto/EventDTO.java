package ftn.alinfo.webapp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventDTO {
    private String id;
    private String title;
    private String date;
    private String time;
    private String location;
    private String type;
    private String status;
}