package org.xproce.projetartist.metier;

import org.xproce.projetartist.dao.entities.ArtPiece;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

@Component
public interface ArtPieceManager {
    public ArtPiece addArtPiece(ArtPiece artPiece);
    public Page<ArtPiece> getAllArtPieces(int page, int taille);
    public Page<ArtPiece> searchArtPieces(String keyword, int page, int taille);
    public ArtPiece update(ArtPiece artPiece);
    public boolean deleteArtPiece(Long id);
}
