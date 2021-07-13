package finalExamModule2.services.employeeService;

import finalExamModule2.models.employee.Employee;
import finalExamModule2.services.Service;

public interface EmployeeService extends Service<Employee> {
    void remove();
}
