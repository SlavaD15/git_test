package Fourteenth;

public class Main {
    public static void main(String[] args) {
        /*
    Employee employee1 = new Employee(1L, "1");
    Employee employee2 = new Employee(2L, "2");
    employee1.getInfo();
    employee2.getInfo();
    System.out.println(employee1.equalTo(employee2));
    SecurityGuard securityGuard1 = new SecurityGuard(3L, "3");
    Courier courier = new Courier(4L, "4");
    Office office = new Office(5L, "5");
    Computer computer = new Computer(6L, "6");
    securityGuard1.getInfo();
    courier.getInfo();
    office.getInfo();
    computer.getInfo();
*/
        Office office1 = new Office(41L, "off1");
        Office office2 = new Office(42L, "off2");
        Office office3 = new Office(43L, "off3");
        Office office4 = new Office(44L, "off4");
        Office office5 = new Office(45L, "off5");

        Computer computer1 = new Computer(51L, "comp1");
        Computer computer2 = new Computer(52L, "comp2");
        Computer computer3 = new Computer(53L, "comp3");
        Computer computer4 = new Computer(54L, "comp4");
        Computer computer5 = new Computer(55L, "comp5");

        Employee employee1 = new Employee(11L, "emp1", office1, computer1);
        Employee employee2 = new Employee(12L, "emp2", office1, computer1);
        Employee employee3 = new Employee(13L, "emp3", office2, computer2);
        Employee employee4 = new Employee(14L, "emp4", office2, computer2);
        SecurityGuard securityGuard1 = new SecurityGuard(21L, "grd1", office3, computer3);
        SecurityGuard securityGuard2 = new SecurityGuard(22L, "grd2", office4, computer3);
        SecurityGuard securityGuard3 = new SecurityGuard(23L, "grd3", office5, computer4);
        Courier courier1 = new Courier(31L, "cour1", computer4);
        Courier courier2 = new Courier(32L, "cour2", computer5);
        Courier courier3 = new Courier(33L, "cour3", computer5);

        OfficeSupportEntity[] array = {employee1, employee2, employee3, employee4, securityGuard1, securityGuard2, securityGuard3};

        findPeopleByOffice(office1, array);

    }
    public void sayHi(Person person){
        System.out.println(person);
    }

    public static void findPeopleByOffice(Office office, OfficeSupportEntity[] array){
        for (OfficeSupportEntity officeSupportEntity : array) {
            if (officeSupportEntity.getOffice() == office) {
                System.out.println(officeSupportEntity);
            }
        }
    }
}
