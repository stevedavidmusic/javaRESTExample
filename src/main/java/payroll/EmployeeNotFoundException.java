package payroll;

// When an employeeNotFoundException is thrown, this Spring MVC configuration is used to render an http 404
public class EmployeeNotFoundException extends RuntimeException {
    EmployeeNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
