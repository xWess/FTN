package ftn.alinfo.webapp.repository;

import ftn.alinfo.webapp.entity.contenu.Feature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeatureRepository extends JpaRepository<Feature, Long> {
}