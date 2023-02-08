import javax.swing.*;
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
    }

    public void createCoursePanel(){

    }
}
