package Task3;

public class EmployeeTest{
    public static void main (String[] args){
        Employee[] staff = new Employee[3];
        staff[2] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[0] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
        
        System.out.println("Before sort");
        staff[0].print();
        staff[1].print();
        staff[2].print();
        
        Sortable.shell_sort(staff);
        
        System.out.println("After sort");
        staff[0].print();
        staff[1].print();
        staff[2].print();
       }
}
