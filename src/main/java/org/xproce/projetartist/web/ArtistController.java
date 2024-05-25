package org.xproce.projetartist.web;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.xproce.projetartist.dao.entities.Artist;
import org.xproce.projetartist.dao.repositories.ArtistRepository;
import org.xproce.projetartist.metier.ArtistManager;

@Controller
public class ArtistController {
    @Autowired
    private ArtistManager artistManager;
    @Autowired
    private ArtistRepository artistRepository;

    @GetMapping("/artists")
    public String artists(Model model, @RequestParam(name="search",defaultValue = "")String search,//keyword
                                        @RequestParam(name="page",defaultValue="0") int page,//page
                                        @RequestParam(name="size",defaultValue = "5") int size//taille


    ){
        //String searchName="";
        //int pageNumber=0;
        //int pageSize=5;
        Page<Artist> pageartists= artistManager.searchArtist(search,page,size);
        model.addAttribute("listArtists",pageartists.getContent());
        int[] pages=new int[pageartists.getTotalPages()];
        model.addAttribute("pages",new int[pageartists.getTotalPages()]);//pages //nombre de page stocké dans le model
        model.addAttribute("search",search);//keyword
        model.addAttribute("page",page);//page
        model.addAttribute("currentPage",page);
        return "artists"; //artists is the name of the View
    }

    @GetMapping("/delete")
    public String delete(Long id)
    {
        artistManager.deleteArtist(id);
        return "redirect:/artists";
    }
    @GetMapping("/index")
    public String home() {
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/newartists")
    public String newArtist(Model model)
    {
        model.addAttribute("artist", new Artist());
        return "saveartist";
    }
    @PostMapping("/saveartist")
    public String saveArtist(@Valid Artist artist, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
        {return "saveartist";}
        artistRepository.save(artist);
        return "saveartist";
    }
}
