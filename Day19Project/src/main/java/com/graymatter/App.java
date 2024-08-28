package com.graymatter;
 
import java.sql.SQLException;
import java.util.List;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.graymatter.dao.EmployeeDao;
import com.graymatter.model.Employee;
 
/**
* Hello world!
*
*/
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc-bean.xml");
        EmployeeDao dao = (EmployeeDao) context.getBean("empdao");

//        int i = dao.addEmployee(new Employee("Harsh", 133, 67800));
//        System.out.println("Row inserted.");

        List<Employee> empList = dao.getAllEmployees();
        for(Employee emp: empList)
        	System.out.println(emp);

        dao.updateEmployee(new Employee("Divyanshu", 123, 80000));
        System.out.println("Record updated successfully");

        dao.deleteEmployee(new Employee("Priya", 125, 45000));
        System.out.println("Record deleted successfully");
        
        dao.selectById(129);
//        
//        for(Employee emp: empList)
//        	System.out.println(emp);
        System.out.println("EMployee by Id: "+dao.selectById(123));
        
    }
}