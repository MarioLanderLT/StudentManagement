/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;

/**
 *
 * @author Lander Lluvia
 */
public class Student {
    private String id;
    private String name;
    private String surname;
    private ArrayList<Course> courses;

    public Student(String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        courses = new ArrayList<Course>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return id +  ", " + surname;
    }
    
    
    
    
}
