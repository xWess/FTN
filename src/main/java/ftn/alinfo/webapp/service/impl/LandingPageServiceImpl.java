package ftn.alinfo.webapp.service.impl;

import ftn.alinfo.webapp.dto.*;
import ftn.alinfo.webapp.repository.*;
import ftn.alinfo.webapp.mapper.LandingPageMapper;
import ftn.alinfo.webapp.service.LandingPageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class LandingPageServiceImpl implements LandingPageService {
    
    private final HeroSlideRepository heroSlideRepository;
    private final FeatureRepository featureRepository;
    private final NewsItemRepository newsItemRepository;
    private final EventRepository eventRepository;
    private final LandingPageMapper mapper;
    
    private static final int NEWS_LIMIT = 6;
    private static final int EVENTS_LIMIT = 6;
    
    @Override
    public List<HeroSlideDTO> getHeroSlides() {
        log.debug("Fetching hero slides from database");
        return heroSlideRepository.findAll().stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<FeatureDTO> getFeatures() {
        log.debug("Fetching features from database");
        return featureRepository.findAll().stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<NewsItemDTO> getLatestNews() {
        log.debug("Fetching latest news from database");
        return newsItemRepository.findAllByOrderByDateDesc(PageRequest.of(0, NEWS_LIMIT))
                .stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<EventDTO> getUpcomingEvents() {
        log.debug("Fetching upcoming events from database");
        return eventRepository.findByDateTimeAfterAndStatusOrderByDateTimeAsc(
                LocalDateTime.now(),
                ftn.alinfo.webapp.entity.evenements.Event.EventStatus.UPCOMING,
                PageRequest.of(0, EVENTS_LIMIT)
            )
            .stream()
            .map(mapper::toDTO)
            .collect(Collectors.toList());
    }
}