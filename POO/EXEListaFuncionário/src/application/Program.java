package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <Employee> list = new ArrayList<>();//sempre instanciar a lista.

        System.out.printf("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){ // este for serve para mostrar todos os funcionários, então depois de colocar quantos funcionários eu quero, o for mostrara todos até que acabe.

            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.printf("Name: ");
            sc.nextLine();//Para limpar o buffered para a proxima entrada.
            String name = sc.nextLine();
            System.out.printf("Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary); // instacio o novo empregado

            list.add(emp);//add o empregado a lista.
        }

        System.out.printf("Enter the employee id that have salary increase : ");
        int idSalary = sc.nextInt();

        System.out.println();

        Integer pos = position(list, idSalary);

        if(pos == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.printf("Enter the percentage: ");
            double percent =sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees");
        for (Employee emp : list){
            System.out.println(emp);
        }

        sc.close();
    }

    public static Integer position(List<Employee> list, int id){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}
