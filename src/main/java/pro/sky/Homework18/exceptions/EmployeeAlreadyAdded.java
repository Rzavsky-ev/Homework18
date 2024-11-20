package pro.sky.Homework18.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//Исключение Сотрудник уже добавлен
@ResponseStatus(HttpStatus.CONFLICT)
public class EmployeeAlreadyAdded extends RuntimeException{
}
