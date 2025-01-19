package org.xproce.projetartist.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.xproce.projetartist.dao.entities.ArtPiece;
import org.xproce.projetartist.metier.ArtPieceManager;

@Controller
public class ArtPieceController {
    @Autowired
    private ArtPieceManager artPieceManager;
    @GetMapping("/gallery")
    public String artPieces(Model model,  @RequestParam(name="search",defaultValue = "")String search,//keyword
                                         @RequestParam(name="page",defaultValue="0") int page,//page
                                         @RequestParam(name="size",defaultValue = "3") int size)//taille
    {
        Page<ArtPiece> pageart=artPieceManager.searchArtPieces(search,page,size);
        model.addAttribute("listArtPieces",pageart.getContent());
        model.addAttribute("pages",new int[pageart.getTotalPages()]);
        model.addAttribute("search", search);
        model.addAttribute("page",page);
        model.addAttribute("currentPage",page);

        return "gallery";
    }

    @GetMapping("/newart")
    public String newArtist(Model model)
    {
        model.addAttribute("art", new ArtPiece());
        return "gallery";
    }



}
