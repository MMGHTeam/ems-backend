package ir.mmghteam.ems.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE)
public class UpdateNotAllowedException extends RuntimeException {
    public UpdateNotAllowedException(String message){
        super(message);
    }
}
