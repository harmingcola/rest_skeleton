package skeleton.api.health;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class HealthController {

    @RequestMapping(value = "/health", method = GET)
    @ResponseStatus(value = OK)
    public Map<String, String> health() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "healthy");
        return response;
    }
}
