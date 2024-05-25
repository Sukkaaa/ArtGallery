package org.xproce.projetartist.metier;

import org.xproce.projetartist.dao.entities.ArtPiece;
import org.xproce.projetartist.dao.entities.Inventory;
import org.xproce.projetartist.dao.repositories.ArtPieceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class ArtPieceManagerMetier implements ArtPieceManager{
    @Autowired
    private ArtPieceRepository artPieceRepository;

    @Override
    public ArtPiece addArtPiece(ArtPiece artPiece) {
        return artPieceRepository.save(artPiece);
    }


    @Override
    public Page<ArtPiece> getAllArtPieces(int page, int taille) {
        return artPieceRepository.findAll(PageRequest.of(page, taille));
    }

    @Override
    public Page<ArtPiece> searchArtPieces(String keyword, int page, int taille) {
        return artPieceRepository.findByTitleContains(keyword, PageRequest.of(page,taille));
    }

    @Override
    public ArtPiece update(ArtPiece artPiece) {
        return artPieceRepository.save(artPiece);

    }

    @Override
    public boolean deleteArtPiece(Long id) {
        try{
            artPieceRepository.deleteById(id);
            return true;
        }
        catch(Exception exception){
            return false;
        }
    }

}
