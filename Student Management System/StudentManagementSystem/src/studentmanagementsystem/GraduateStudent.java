/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

/**
 *
 * @author Anjula
 */
public class GraduateStudent extends Student {
    private String researchArea;

    public GraduateStudent(String studentId, String name, int age, String researchArea) {
        super(studentId, name, age);
        this.researchArea = researchArea;
    }

    @Override
    public String getStudentInfo() {
        return "Graduate Student: " + getName() + " (ID: " + getStudentId() + ", Age: " + getAge() + ", Research Area: " + researchArea + ")";
    }
}

