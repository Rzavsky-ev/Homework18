package pro.sky.Homework18.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//не хватает данных
@ResponseStatus(HttpStatus.CONFLICT)
public class ExceptionMissingData extends RuntimeException{
}
