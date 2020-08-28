package payroll;

// When an employeeNotFoundException is thrown, this Spring MVC configuration is used to render an http 404
public class OrderNotFoundException extends RuntimeException {
    OrderNotFoundException(Long id) {
        super("Could not find order " + id);
    }
}
