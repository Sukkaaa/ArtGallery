package org.xproce.projetartist.metier;

import org.xproce.projetartist.dao.entities.Tags;
import org.xproce.projetartist.dao.repositories.TagsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagManagerMetier implements TagManager{

    @Autowired
    private TagsRepository tagsRepository;

    @Override
    public List<Tags> getAllTags() {
        return tagsRepository.findAll();
    }

    @Override
    public Tags saveTag(Tags tags) {

         tagsRepository.save(tags);
         return tags;
    }

    @Override
    public Tags findTagById(Long id) {
        return tagsRepository.findById(id).orElse(null);
    }
}
