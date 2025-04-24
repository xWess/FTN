package ftn.alinfo.webapp.repository;

import ftn.alinfo.webapp.entity.NewsItem;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface NewsItemRepository extends JpaRepository<NewsItem, Long> {
    List<NewsItem> findAllByOrderByDateDesc(Pageable pageable);
}