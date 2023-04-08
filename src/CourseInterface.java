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
    private JRadioButton sectionButtonA, sectionButtinB;
    private JTextField courseFielding;

    public CourseInterface ()
    {
        coursePanel = new JPanel();
        createCoursePanel();
        setSize(frameWidth, frameHeight);
        // listener = new CourseListener();
        add(coursePanel, BorderLayout.CENTER);
    }

    public void createCoursePanel()
    {
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

    public JPanel comboCoursePanel()
    {
        selectCoursePanel = new JComboBox();

        selectCoursePanel.addItem("ITEC1000");
        selectCoursePanel.addItem("ITEC1010");
        selectCoursePanel.addItem("ITEC1620");
        selectCoursePanel.addItem("ITEC2610");

        selectCoursePanel.addActionListener(listener);
        JPanel panel = new JPanel();
        panel.add(selectCoursePanel);
        return panel;
    }

    public void createCourseField()
    {
        final int fieldWidth = 10;
        courseFielding = new JTextField();
        // courseFielding.setText("Courses You Selected:" + \n + selectCoursePanel.getNextFocusableComponent());

    }
    public void addedCourse(){
        String courseName = (String) selectCoursePanel.getSelectedItem();

        // if (sectionButtonA.isSelected()) {courseName + " A"}
    }
}
