import javax.swing.*;

public class CourseViewer {
    public static void main(String[] args)
    {
        JFrame courseGUI = new CourseInterface();
        courseGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        courseGUI.setTitle("Course Enrollment Module");
        courseGUI.setVisible(true);

    }
}