package metier;

import dao.repositories.TagsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagManagerMetier implements TagManager{

    @Autowired
    private TagsRepository tagsRepository;
}
