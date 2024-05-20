package metier;

import dao.entities.ArtPiece;
import dao.entities.Artist;
import dao.repositories.ArtistRepository;
import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
