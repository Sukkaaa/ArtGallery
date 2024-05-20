package dao.repositories;

import dao.entities.Artist;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ArtistRepository extends JpaRepository<Artist,Long> {
}
