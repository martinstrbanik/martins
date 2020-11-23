package com.appslab;
import com.appslab.model.*;
import java.util.List;

public interface EmployeeService {

    float getTotalSalary(List<Worker> employees);
    int getTotalBonus(List<Worker> employees);

}