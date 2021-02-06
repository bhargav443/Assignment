
package com.AutomateEmployee.employe;

import java.util.Scanner;

    public class Project  {
        private String projectName;
        private int startDate;
        private int EndDate;
        private String TechnologiesUsed;

        @Override
        public String toString() {
            return "Project{" +
                    "projectName='" + projectName + '\'' +
                    ", startDate=" + startDate +
                    ", EndDate=" + EndDate +
                    ", TechnologiesUsed='" + TechnologiesUsed + '\'' +
                    '}';
        }
        public Project(String projectName, int endDate, String technologiesUsed) {
            this.projectName = projectName;
            this.startDate = 23;
            this.EndDate = endDate;
            this.TechnologiesUsed = technologiesUsed;
        }
        public Project(){

        }
        public Project addProject(){
            Scanner scanner=new Scanner(System.in);

            String projectName = getProjectName(scanner);

            getStartDate(scanner);


            int endDate = getEndDate(scanner, "enter endDate");

            String technologies = getString("enter technologies", scanner.next());


            Project project1=new Project(projectName,endDate,technologies);

            return project1;
        }

        public String getString(String s, String next) {
            System.out.println(s);
            return next;
        }

        public int getEndDate(Scanner scanner, String s) {
            System.out.println(s);
            return scanner.nextInt();
        }

        private void getStartDate(Scanner scanner) {
            int startDate = getEndDate(scanner, "enter start date");
        }

        private String getProjectName(Scanner scanner) {
            String projectName = getString("enter project name", scanner.nextLine());
            return projectName;
        }

    }



