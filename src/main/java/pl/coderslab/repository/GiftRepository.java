package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.model.Gift;

public interface GiftRepository extends JpaRepository<Gift, Long> {

}