/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
public class CourseDemo {
    public static void main(String []args){
Course c1, c2, c3, c4;
c1 = new EcoCourse("Macroeconomics", "Kiet A. Quach", "010", "The course introduces students to the foundations of macroeconomic analysis.");
c2 = new MathCourse("Calculus 2", "Sumitava Chatterjee","006", "In this course we shall learn about solving calculus probelms");
c3 = new EngCourse("English 112", "Benjamin Bever","032", "In this course we continue to develop college writing with increased emphasis on critical essays, argumentation, and research ");
c4 = new CscCourse("ComputerScience 201", "Tanes Kanchanawanchai", "002", "In this course we will learn about programming in Java");
c1.displayMessage();
c2.displayMessage();
c3.displayMessage();
c4.displayMessage();
}
}

