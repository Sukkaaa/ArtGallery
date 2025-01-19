package org.xproce.projetartist.dao.repositories;

import org.springframework.data.domain.Pageable;
import org.xproce.projetartist.dao.entities.ArtPiece;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtPieceRepository extends JpaRepository<ArtPiece,Long> {
        Page<ArtPiece> findByTitleContains(String title, Pageable pageable);


}
