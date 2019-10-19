package Application.Controlers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class IndexControler{

    @GetMapping("/searchArtist")
    public String searchArtist(){
        return "searchArtist";
    }
    @GetMapping("/searchSong")
    public String searchSong(){
        return "searchSong";
    }
    @GetMapping("/showFavourites")
    public String showFavourites(){
        return "showFavourites";
    }

}
