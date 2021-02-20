package TCS;

import java.util.Scanner;

public class XP1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        Faculty[] faculties = new Faculty[size];

        for (int i = 0; i < size; i++) {
            int id = scanner.nextInt();
            scanner.nextLine();
            String name = scanner.nextLine();
            double salary = scanner.nextDouble();
            scanner.nextLine();
            String des = scanner.nextLine();
            int age = scanner.nextInt();
            scanner.nextLine();
            String stream = scanner.nextLine();
            faculties[i] = new Faculty(id, name, salary, des, age, stream);
        }

        for (Faculty f :
                faculties) {
            System.out.println(f.getId() + " " + f.getName() + " " + f.getSalary() + " " + f.getDesignation() + " " + f.getAge() + " " + f.getStream());
        }


        System.out.println("Avg Age = " + findAverageAgeOfFaculty(faculties));
        System.out.println("MinSal = " + findFacultyWithMinimumSalary(faculties).getName());
    }

    private static double findAverageAgeOfFaculty(Faculty[] faculties) {
        if (faculties == null) {
            return 0;
        }
        double sum = 0;
        for (Faculty faculty :
                faculties) {
            sum += faculty.getAge();
        }
        return sum / faculties.length;
    }

    private static Faculty findFacultyWithMinimumSalary(Faculty[] faculties) {
        if (faculties == null) {
            return null;
        }
        int item = -1;
        double minSalary = 999999999;
        for (int i = 0; i < faculties.length; i++) {
            if (minSalary > faculties[i].getSalary())
                item = i;
        }
        return faculties[item];
    }

}

class Faculty {
    private final int id;
    private final String name;
    private final double salary;
    private final String designation;
    private final int age;
    private final String stream;

    public Faculty(int id, String name, double salary, String designation, int age, String stream) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.age = age;
        this.stream = stream;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    public int getAge() {
        return age;
    }

    public String getStream() {
        return stream;
    }
}