package pro.sky.Homework18.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//Хранилище сотрудников — полное
@ResponseStatus(HttpStatus.CONFLICT)
public class ArrayIsFull extends RuntimeException{
}
