//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Q1)

//        Account account = new Account("1" , "Fahad" , 10000000);
//        Account account1 = new Account("2" , "Sara" , 1000);
//        Account account2 = new Account("3" , "Mohammed");
//
//        account2.transfer(500 , account1);
//        System.out.println(account1.toString());
//        System.out.println("----------------------------");
//
//
//        System.out.println(account.toString());
//        System.out.println(account1.toString());
//        System.out.println(account2.toString());
//        System.out.println("----------------------------");
//
//        account.transfer(5000 , account1);
//        System.out.println(account1.toString());
//
//        System.out.println("----------------------------");
//
//        System.out.println(account2.getBalance());
//        account2.credit(2000);
//        account2.debit(500);
//        System.out.println(account2.toString());
//        System.out.println("----------------------------");
//
//        account.debit(30000);
//        System.out.println(account.toString());
//        System.out.println("----------------------------");


        Employee employee = new Employee("Fahad" , "1" , 45000);
        Employee employee2 = new Employee("Ali" , "2" , 25000);
        Employee employee3 = new Employee("Abdullah" , "3" , 3000);

        System.out.println(employee.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());

        System.out.println("------------------------------------");
        System.out.println("Your yearly salary is : "+employee3.getAnnualSalary(employee3.getSalary()));
        System.out.println("------------------------------------");

        System.out.println("After raise salary : " + employee2.raiseSalary(employee2.getSalary()));
        System.out.println(employee2.toString());
        System.out.println("------------------------------------");



    }
}