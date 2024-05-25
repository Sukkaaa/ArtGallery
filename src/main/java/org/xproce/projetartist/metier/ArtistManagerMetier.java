package org.xproce.projetartist.metier;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.xproce.projetartist.dao.entities.Artist;
import org.xproce.projetartist.dao.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistManagerMetier implements ArtistManager
{
    //couplage faible instantiation de l'interface
    @Autowired
    private ArtistRepository artistRepository;
    @Override
    public Artist createArtist(Artist artist){
        return artistRepository.save(artist);
    }
    @Override
    public Artist updateArtist(Artist artist) {
        return artistRepository.save(artist);
    }

    @Override
    public boolean deleteArtist(Long id) {
        try {
            artistRepository.deleteById(id);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    @Override
    public List<Artist> findAll() {
        return artistRepository.findAll();
    }

    @Override
    public Page<Artist> searchArtist(String name, int page, int size) {
        return artistRepository.findByNameContains(name, PageRequest.of(page,size));
    }

}
