package Problem4_;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String line = br.readLine();
            while (line != null) {
                String[] data = line.split(",");
                employeeList.add(new Employee(data[0], Double.parseDouble(data[1])));
                line = br.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.printf("%-10s%s\n", "Name", "Salary");
        for (Employee employee : employeeList) {
            System.out.printf("%-10s%s\n", employee.getName(), employee.getSalary());
        }
    }