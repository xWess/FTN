package ftn.alinfo.webapp.controller;

import ftn.alinfo.webapp.dto.*;
import ftn.alinfo.webapp.service.LandingPageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class LandingpageController {

    private final LandingPageService landingPageService;

    @GetMapping("/hero-slides")
    public ResponseEntity<List<HeroSlideDTO>> getHeroSlides() {
        log.debug("REST request to get hero slides");
        return ResponseEntity.ok(landingPageService.getHeroSlides());
    }

    @GetMapping("/features")
    public ResponseEntity<List<FeatureDTO>> getFeatures() {
        log.debug("REST request to get features");
        return ResponseEntity.ok(landingPageService.getFeatures());
    }

    @GetMapping("/news/latest")
    public ResponseEntity<List<NewsItemDTO>> getLatestNews() {
        log.debug("REST request to get latest news");
        return ResponseEntity.ok(landingPageService.getLatestNews());
    }

    @GetMapping("/events/upcoming")
    public ResponseEntity<List<EventDTO>> getUpcomingEvents() {
        log.debug("REST request to get upcoming events");
        return ResponseEntity.ok(landingPageService.getUpcomingEvents());
    }
}
