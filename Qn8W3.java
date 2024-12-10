package week3;
import java.io.*;

/* Create a class Student with private fields name, age, grade(A, B, C, D, E, F).
Then, write a program that stores student information(id, name, age, grade) into a .csv file. */

class Student5 {
    private String name;
    private int age;
    private char grade;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public char getGrade() {
        return this.grade;
    }
}

public class Qn8W3 {
    public static void main(String[] args) {
        try {
            Student5 S = new Student5();

            S.setName("Ram");
            S.setAge(20);
            S.setGrade('A');

            FileWriter fw = new FileWriter("C:\\Users\\ACER\\Desktop\\student.csv", true);

            File file = new File("C:\\Users\\ACER\\Desktop\\student.csv");
            if (file.length() == 0) {
                fw.write("ID,Name,Age,Grade\n"); // CSV header
            }

            fw.write("1," + S.getName() + "," + S.getAge() + "," + S.getGrade() + "\n" );

            fw.close();

            System.out.println("Student information has been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
