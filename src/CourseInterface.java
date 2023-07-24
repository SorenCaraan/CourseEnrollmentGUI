import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CourseInterface extends JFrame {

    public static final int frameWidth = 500;
    public static final int frameHeight = 500;
    public static final int dimensions = 10;

    private JPanel coursePanel;
    private JComboBox selectCoursePanel;
    private ActionListener listener;
    private JRadioButton sectionButtonA, sectionButtonB;
    private JTextField courseFielding;
    private String course1000 = "ITEC1000", course1010 = "ITEC1010", course1620 = "ITEC1620", course2610 = "ITEC2610";

    public CourseInterface ()
    {
        coursePanel = new JPanel();
        createCoursePanel();
        setSize(frameWidth, frameHeight);
        listener = new CourseListener();
    }

    public void createCoursePanel()
    {

        JPanel coursingPanel = new JPanel();
        coursingPanel.add(comboCoursePanel());
        coursingPanel.add(radioCoursePanel());
        add(coursingPanel);
    }


    class CourseListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            addedCourse();
        }
    }


    public JPanel comboCoursePanel()
    {
        selectCoursePanel = new JComboBox();

        selectCoursePanel.addItem(course1000);
        selectCoursePanel.addItem(course1010);
        selectCoursePanel.addItem(course1620);
        selectCoursePanel.addItem(course2610);

        selectCoursePanel.addActionListener(listener);
        JPanel panel = new JPanel();
        panel.add(selectCoursePanel);
        return panel;
    }

    public JPanel radioCoursePanel(){
        sectionButtonA = new JRadioButton("Section A");
        sectionButtonA.addActionListener(listener);
        sectionButtonA.setSelected(true);

        sectionButtonB = new JRadioButton("Section B");
        sectionButtonB.addActionListener(listener);

        ButtonGroup sectionGroup = new ButtonGroup();
        sectionGroup.add(sectionButtonA);
        sectionGroup.add(sectionButtonB);

        JPanel panel = new JPanel();
        panel.add(sectionButtonA);
        panel.add(sectionButtonB);
        panel.setBorder(new TitledBorder(new EtchedBorder(),"Section"));
        return panel;
    }

    public void createCourseField()
    {
        final int fieldWidth = 10;
        courseFielding = new JTextField();
        courseFielding.setText("Courses You Selected:" + "\n" + selectCoursePanel.getNextFocusableComponent());

    }
    public void addedCourse(){
        String courseName = (String) selectCoursePanel.getSelectedItem();

        /*if (sectionButtonA.isSelected()) {courseName + " A"}
        else if (sectionButtonB.isSelected()) {courseName + " B"}*/


        JPanel panel = new JPanel();
        String rcourse = selectCoursePanel.getName();
        JScrollPane scrollPane = new JScrollPane();
        panel.add(scrollPane);
        add(panel);
    }
}
