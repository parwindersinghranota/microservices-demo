package singh.parwinder.departmentservice.client;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import singh.parwinder.departmentservice.model.Employee;


import java.util.List;

@HttpExchange
public interface EmployeeClient {
    @GetExchange("/employee/department/{departmentId}")
    public List<Employee> findByDepartmentId(@PathVariable Long departmentId);
}
