import java.util.Arrays;
public class Main {






    public static void main(String[] args) {
        Empolyee[] empolyees  = new Empolyee[10];
        empolyees[0] = new Empolyee("Комов Геннадий Максимович", 1, 19000);
        empolyees[1] = new Empolyee("Пьяных Алексей Александрович", 1, 22000);
        empolyees[2] = new Empolyee("Поляков Игорь Петрович", 5, 40000);
        empolyees[3] = new Empolyee("Васильев Геннадий Денисович", 4, 35000);
        empolyees[4] = new Empolyee("Святов Валентин Егорович", 2, 28000);
        empolyees[5] = new Empolyee("Козлов Виктор Леонидович", 3, 20000);
        empolyees[6] = new Empolyee("Светлов Андрей Артёмович", 5, 21000);
        empolyees[7] = new Empolyee("Горшков Эдуард Васильевич", 4, 23000);
        empolyees[8] = new Empolyee("Андрее Антон Геннадьевич", 2, 24000);
        empolyees[9] = new Empolyee("Рухлов Денис Валерьевич", 1, 28000) ;
        for( Empolyee e: empolyees){
            System.out.println(e);
        }

        System.out.println("Cумма всех зарплат= "+ Empolyee.sumAllSalaries(empolyees));
        System.out.println("Минимальная зарплата = "+ Empolyee.minSalary(empolyees));
        System.out.println("Максимальная зарплата = "+ Empolyee.maxSalary(empolyees));
        System.out.println("Средняя зарплата = "+ Empolyee.midSalary(empolyees));
        Empolyee.printFio(empolyees);
        int dobavka = 20;
        Empolyee.uppSalary(empolyees, dobavka);
        for( Empolyee e: empolyees){
            System.out.println(e);
        }
        int departament =4;
        System.out.println("Минимальное значение зарплату сотрудника из отдела, я выбрал отдел 4=  "+ Empolyee.minUserDepartment(empolyees, departament));
        int departamen = 1;
        System.out.println("Максимальное значние зарплаты сотрудника из отдела 1= "+ Empolyee.maxUserDepartment(empolyees,departamen));

        int department = 2;
        System.out.println("Сумма зарплат всех сотрудников по отделу 2= "+ Empolyee.summUser(empolyees,department));

        int depar = 1;
        System.out.println("Средняя зарплата по отделу 1= " + Empolyee.midSalaryDeparment( empolyees, depar));

        int dep = 2;
        dobavka = 10;
        System.out.println("Увеличенная зарплата отдела 2");
        Empolyee.uppSalaryDepartment(empolyees, dep, dobavka);
        for( Empolyee e: empolyees){
            System.out.println(e);
        }
        int dem = 3;
        System.out.println("Напечатать всех сотрудников отдела кроме отдела");
        Empolyee.printEmployeDepartment(empolyees, dem);

        int checkSalary = 26000;
        System.out.println("Зарплаты меньше 26000");
        Empolyee.printEmpolyLessSalary(empolyees,checkSalary);

        int checkingSalary = 29000;
        System.out.println("Зарплаты больше 29000");
        Empolyee.printEmpolyMoreSalary(empolyees, checkingSalary);
    }



}




















//main(String[] args)