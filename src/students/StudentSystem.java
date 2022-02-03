package students;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentSystem {
    private Map<String, Student> repository;

    public StudentSystem() {
        this.repository = new HashMap<>();
    }

    private Map<String, Student> getRepository() {
        return this.repository;
    }

    public void create(String[] data) {
        String name = data[1];
        int age = Integer.parseInt(data[2]);
        double grade =Double.parseDouble(data[3]);
        if (!this.getRepository().containsKey(name))
        {
            Student student = new Student(name, age, grade);
            this.getRepository().put(name,student);
        }
    }

    public String show(String[] data) {
        String name = data[1];

        StringBuilder sb = new StringBuilder();

        if (this.getRepository().containsKey(name))
        {
            Student student = this.getRepository().get(name);
            sb.append(String.format("%s is %s years old.",student.getName(),student.getAge()));

            if (student.getGrade() >= 5.00)
            {
                sb.append(" Excellent student.");
            }
            else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50)
            {
                sb.append(" Average student.");
            }
            else
            {
                sb.append(" Very nice person.") ;
            }
        }
        return sb.toString();
    }
}
