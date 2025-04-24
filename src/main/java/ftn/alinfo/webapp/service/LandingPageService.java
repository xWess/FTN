package ftn.alinfo.webapp.service;

import ftn.alinfo.webapp.dto.*;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface LandingPageService {
    List<HeroSlideDTO> getHeroSlides();
    List<FeatureDTO> getFeatures();
    List<NewsItemDTO> getLatestNews();
    List<EventDTO> getUpcomingEvents();
}