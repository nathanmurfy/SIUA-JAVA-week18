package com.goanna;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lists {
    public static class EmployeeComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee e1, Employee e2) {

            return e1.getName().compareTo(e2.getName());
        }
    }
    public static void listPlay() {
        Employee emp1 = new Employee(1, "Mohit", 22);
        Employee emp2 = new Employee(2, "Rahul", 42);
        Employee emp3 = new Employee(3, "Shyam", 24);
        Employee emp4 = new Employee(4, "Mohit", 36);
        Employee emp5 = new Employee(5, "Swaraj", 60);
        Employee emp6 = new Employee(3, "Shyam", 18);
        Employee emp7 = new Employee(7, "Anish", 28);

        List<Employee> empList = new ArrayList<>(10);

        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        empList.add(emp6);
        empList.add(emp7);


        // find all employees older than 60
        Adults(empList);




        // Sort The empList
        sortEmpByName(empList);



        // Removing employee with Id Number 4
        removeById(empList, 4);


    }


    /**
     * This Will loop through the list and print out every employee with age greater than 60
     *
     * @param empList
     *
     *
     */
    private static void Adults(List<Employee> empList) {
        for(int i = 0; i < empList.size(); i++){
            if(empList.get(i).age > 60){
                System.out.println(empList.get(i));
            }
        }

    }


    /**
     * This will remove element based on i
     *
     * @param empList
     *
     * @param empId
     *
     */
    private static void removeById(List<Employee> empList, int empId) {
        //empList.remove(empId);
        for(int i = 0; i < empList.size(); i++){
            if(empList.get(i).id == empId){
                empList.remove(empList.get(i));
            }
        }
        System.out.println(empList);

    }





    /**
     * Use comparator class, sort the list by employee name.
     *
     * @param empList
     * @return
     */
    private static void sortEmpByName(List<Employee> empList) {
        empList.sort(new EmployeeComparator());
        System.out.println("New Sorted List: " + empList);

    }

}
