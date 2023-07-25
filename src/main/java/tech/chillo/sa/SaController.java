package tech.chillo.sa;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "sa", produces = MediaType.APPLICATION_JSON_VALUE)
public class SaController {

    @GetMapping
    public List<Object> search(){
        return List.of(new Sa(1, "Belle formation", 1));
    }

    @GetMapping(path= "{id}")
    public Sa read(@PathVariable int id){
        // Lire dans la BDD
        return new Sa(1, "Belle formation", 1);
    }
}
