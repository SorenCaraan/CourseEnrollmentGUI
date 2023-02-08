import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CourseInterface extends JFrame {

    public static final int frameWidth = 500;
    public static final int frameHeight = 500;
    public static final int dimensions = 10;

    private JPanel coursePanel;
    private JComboBox selectCoursePanel;
    private ActionListener listener;
    private JRadioButton sectionA, sectionB;
    private JTextField courseField;

    public CourseInterface (){
        coursePanel = new JPanel();
        createCoursePanel();
        setSize(frameWidth, frameHeight);
        // listener = new CourseListener();
        add(coursePanel, BorderLayout.CENTER);
    }

    public void createCoursePanel(){
        //JPanel selectPanel = coursePanel();

        JPanel coursingPanel = new JPanel();
        coursingPanel.setLayout(new GridLayout(1,3));
        //coursingPanel.add(selectPanel);
        add(coursingPanel, BorderLayout.SOUTH);
    }

    /*
    class CourseListener implements ActionListener {
        addedCourse();
    }
    */
    public void addedCourse(){
        String courseName = (String) selectCoursePanel.getSelectedItem();
    }
}
