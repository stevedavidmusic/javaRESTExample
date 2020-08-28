package payroll;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class EmployeeNotFoundAdvice {
    // signals that this advice is rendered straight into the response body
    @ResponseBody
    // configures the advice to only respond if an EmployeeNotFoundExcept is thrown
    @ExceptionHandler(EmployeeNotFoundException.class)
    // says to issue an HTTPStatus.NOT_FOUND, aka HTTP 404
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFoundHandler(EmployeeNotFoundException ex) {
        return ex.getMessage();
    }
}
