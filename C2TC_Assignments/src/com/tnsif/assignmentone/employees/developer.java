package com.tnsif.assignmentone.employees;

public class developer extends employee {
    private String programmingLanguage;
    private String project;

    public developer(String name, int employeeId, double salary, String programmingLanguage, String project) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
        this.project = project;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Language: " + programmingLanguage + ", Project: " + project);
    }
}
