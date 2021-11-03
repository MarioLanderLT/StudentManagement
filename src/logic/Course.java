/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author Lander Lluvia
 */
public class Course {
    private int id;
    private String name;
    private String description;
    private Student[] students;

    public Course(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        students = new Student[100];
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course{" + "id=" + id + ", name=" + name + ", description=" + description + '}';
    }
    
    
    
    
}
