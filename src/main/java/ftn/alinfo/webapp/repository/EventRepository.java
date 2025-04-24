package ftn.alinfo.webapp.repository;

import ftn.alinfo.webapp.entity.Event;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByDateTimeAfterAndStatusOrderByDateTimeAsc(LocalDateTime date, Event.EventStatus status, Pageable pageable);
}