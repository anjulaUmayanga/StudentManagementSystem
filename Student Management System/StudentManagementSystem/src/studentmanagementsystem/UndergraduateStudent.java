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
public class UndergraduateStudent extends Student {
    private String major;

    public UndergraduateStudent(String studentId, String name, int age, String major) {
        super(studentId, name, age);
        this.major = major;
    }

    @Override
    public String getStudentInfo() {
        return "Undergraduate Student: " + getName() + " (ID: " + getStudentId() + ", Age: " + getAge() + ", Major: " + major + ")";
    }
}

