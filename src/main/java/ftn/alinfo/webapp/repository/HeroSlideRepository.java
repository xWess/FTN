package ftn.alinfo.webapp.repository;

import ftn.alinfo.webapp.entity.HeroSlide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroSlideRepository extends JpaRepository<HeroSlide, Long> {
}