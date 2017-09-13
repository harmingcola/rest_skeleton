package skeleton.api.exceptions;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@CrossOrigin
@ControllerAdvice
public class ExceptionHandlingController {

    @Autowired
    private ObjectMapper objectMapper;

    @ResponseBody
    @ResponseStatus(BAD_REQUEST)
    @ExceptionHandler(IllegalStateException.class)
    public String handleIllegalStateException(IllegalStateException e) {
        return buildResponse(e.getMessage());
    }


    private String buildResponse(String message) {
        Map<String, String> response = new HashMap<>();
        response.put("message", message);
        try {
            return objectMapper.writeValueAsString(response);
        } catch (IOException e) {
            throw new IllegalStateException("Problem converting error message to JSON", e);
        }
    }
}
