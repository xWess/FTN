package ftn.alinfo.webapp.mapper;

import ftn.alinfo.webapp.dto.*;
import ftn.alinfo.webapp.entity.contenu.Feature;
import ftn.alinfo.webapp.entity.contenu.HeroSlide;
import ftn.alinfo.webapp.entity.contenu.NewsItem;
import ftn.alinfo.webapp.entity.evenements.Event;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.time.format.DateTimeFormatter;

@Component
@RequiredArgsConstructor
public class LandingPageMapper {
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm");

    public HeroSlideDTO toDTO(HeroSlide entity) {
        if (entity == null) return null;
        return new HeroSlideDTO(
            entity.getId().toString(),
            entity.getTitle(),
            entity.getSubtitle(),
            entity.getImage(),
            entity.getLink()
        );
    }

    public NewsItemDTO toDTO(NewsItem entity) {
        if (entity == null) return null;
        return new NewsItemDTO(
            entity.getId().toString(),
            entity.getTitle(),
            entity.getExcerpt(),
            entity.getDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")),
            entity.getImageUrl(),
            entity.getCategory()
        );
    }

    public EventDTO toDTO(Event entity) {
        if (entity == null) return null;
        return new EventDTO(
            entity.getId().toString(),
            entity.getTitle(),
            entity.getDateTime().format(DATE_FORMATTER),
            entity.getDateTime().format(TIME_FORMATTER),
            entity.getLocation(),
            entity.getType().toString().toLowerCase(),
            entity.getStatus().toString().toLowerCase()
        );
    }

    public FeatureDTO toDTO(Feature entity) {
        if (entity == null) return null;
        return new FeatureDTO(
            entity.getId().toString(),
            entity.getTitle(),
            entity.getDescription(),
            entity.getLink()
        );
    }
}