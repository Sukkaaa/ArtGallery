package org.xproce.projetartist.metier;

import org.xproce.projetartist.dao.entities.Tags;

import javax.swing.text.html.HTML;
import java.util.List;

public interface TagManager {
    public List<Tags> getAllTags();
    public Tags saveTag(Tags tags);
    public Tags findTagById(Long id);

}
