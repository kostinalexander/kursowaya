import java.util.concurrent.atomic.AtomicInteger;

public class Empolyee {
    public static int length;
    String fio;
    int departament;
    int salary;
    public static final AtomicInteger counter = new AtomicInteger(1);
    public int id;

    public Empolyee(String fio, int departament, int salary) {
        this.fio = fio;
        this.salary = salary;
        this.departament = departament;
        id = counter.getAndIncrement();
    }

    public String getFio() {
        return this.fio;
    }

    public int getDepartament() {
        return this.departament;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Empolyee{" +
                "fio='" + fio + '\'' +
                ", departament=" + departament +
                ", salary=" + salary +
                '}' + "id='" + id;

    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int sumAllSalaries(Empolyee[] summa) {
        int allSalary = 0;
        for (int i = 0; i < summa.length; i++) {
            allSalary += summa[i].getSalary();

        }
        return allSalary;
    }

    public static int minSalary(Empolyee[] empolye) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < empolye.length; i++) {
            int salary = empolye[i].getSalary();
            if (salary < min) {
                min = salary;
            }
        }
        return min;
    }

    public static int maxSalary(Empolyee[] empolye) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < empolye.length; i++) {
            int salary = empolye[i].getSalary();
            if (salary > max) {
                max = salary;
            }

        }
        return max;
    }

    public static double midSalary(Empolyee[] empolye) {
        int sumSalary = sumAllSalaries(empolye);
        int countEmploye = empolye.length;
        return (double) sumSalary / countEmploye;
    }

    public static void printFio(Empolyee[] empolye) {
        for (int i = 0; i < empolye.length; i++) {
            System.out.println(empolye[i].getFio());
        }
    }

    public static void uppSalary(Empolyee[] empolye, int addPercentage) {
        for (int i = 0; i < empolye.length; i++) {
            int salary = empolye[i].getSalary();
            double persont = salary * (addPercentage / 100.0);
            salary += persont;
            empolye[i].setSalary(salary);
        }

    }
    public static int minUserDepartment(Empolyee[] empolye, int departament) {
        int min = Integer.MAX_VALUE;
        for (Empolyee empolyee : empolye) {
            if (departament == empolyee.getDepartament()) {
                int salary = empolyee.getSalary();
                if (salary < min) {
                    min = salary;
                }
            }
        }
        return min;
    }

    public static int maxUserDepartment(Empolyee[] empolye, int departament) {
        int max = Integer.MIN_VALUE;
        for (Empolyee empolyee : empolye) {
            empolyee.getDepartament();
            if (departament == empolyee.getDepartament()) {
                int salary = empolyee.getSalary();
                if (salary>max){
                    max = salary;
                }
            }


        }return max;
    }

    public static int summUser(Empolyee[] empolye, int departament) {
        int allUserSalary = 0;
        for (Empolyee empolyee: empolye) {
            empolyee.getDepartament();
            if(departament==empolyee.getDepartament()) {
                allUserSalary += empolyee.getSalary();
            }
        }return allUserSalary;
    }
    public static double midSalaryDeparment(Empolyee[]empolye, int departament) {
        int summSalary = 0;
        int countEmploye = 0;
        for (Empolyee empolyee: empolye) {
            if(empolyee.getDepartament()==departament){
                summSalary += empolyee.getSalary();
                countEmploye++;
            }
        }
        if(countEmploye ==0){
            return 0;
        }else
        return (double) (summSalary / countEmploye);
    }

    public static void uppSalaryDepartment(Empolyee[]empolye, int departament, int dobavka) {
        for (Empolyee empolyee : empolye) {
            if (empolyee.getDepartament() == departament) {
                int salary = empolyee.getSalary();
                double persont = salary * (dobavka / 100.0);
                salary += persont;
                empolyee.setSalary(salary);
            }
        }
    }
    public static void printEmployeDepartment (Empolyee[]empolye, int departament){
        for (Empolyee empolyee : empolye) {
            if (empolyee.getDepartament() == departament) {
                System.out.println("ФИО " + empolyee.getFio()+ " Зарплата "+ empolyee.getSalary()+ " ID "+ empolyee.getId());
            }
        }
    }
    public static void printEmpolyLessSalary (Empolyee[]empolye, int salary1){
        for (Empolyee empolyee : empolye) {
            if (empolyee.getSalary() < salary1) {
                System.out.println("ФИО " + empolyee.getFio() + " Зарплата " + empolyee.getSalary() + " ID " + empolyee.getId());
            }

        }
    }
    public static void printEmpolyMoreSalary (Empolyee[]empolye, int salary2){
        for (Empolyee empolyee : empolye) {
            if (empolyee.getSalary() >= salary2) {
                System.out.println("ФИО " + empolyee.getFio() + " Зарплата " + empolyee.getSalary() + " ID " + empolyee.getId());
            }

        }
    }

}




