package dao.repositories;

import dao.entities.ArtPiece;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtPieceRepository extends JpaRepository<ArtPiece,Long> {
    Page<ArtPiece> findByDesignationContains(String keyword, PageRequest of);
}
