package org.xproce.projetartist.dao.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.xproce.projetartist.dao.entities.Artist;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ArtistRepository extends JpaRepository<Artist,Long> {
    Page<Artist> findByNameContains(String name, Pageable pageable);
}
