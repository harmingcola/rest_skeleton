package skeleton.api.skull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import skeleton.model.Skull;
import skeleton.service.SkullService;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(value = "/skull")
public class SkullController {

    @Autowired
    private SkullService skullService;


    @ResponseBody
    @RequestMapping(value = "/{id}", method = GET)
    public Skull read(@PathVariable Integer id) {
        return skullService.read(id);
    }
}
