package pro.sky.Homework18.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//пустой отдел
@ResponseStatus(HttpStatus.FOUND)
public class ExceptionEmptySection extends RuntimeException{
}
