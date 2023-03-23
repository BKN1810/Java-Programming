//JTabbedPaneExample.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TabbedPane extends JFrame {
    JTabbedPane tabs;    CoursePanel cource;   SelectCoursePanel selectCourse;

    TabbedPane() {
		super("Tabbed Pane Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Setting the JTabbedPane Position and Layout as Wrap
        tabs = new JTabbedPane(JTabbedPane.RIGHT, JTabbedPane.WRAP_TAB_LAYOUT);
		//tabs = new JTabbedPane(JTabbedPane.TOP,JTabbedPane.SCROLL_TAB_LAYOUT);
		//tabs = new JTabbedPane(JTabbedPane.LEFT,JTabbedPane.WRAP_TAB_LAYOUT);
        
		cource = new CoursePanel();
        selectCourse = new SelectCoursePanel();
        // Adding user defined pannels to JTabbedPane
        tabs.addTab("Cources", cource);
        tabs.addTab("Select Course", selectCourse);
        // Adding JPanels to JTabbedPane
        tabs.addTab("Listing", new JPanel());
        tabs.addTab("Comment", new JTextArea(10, 40));
        tabs.addTab("Register", new JPanel());
        tabs.addTab("Contact Us", new JPanel());
        tabs.addTab("More..", new JPanel());
        getContentPane().add(tabs);
    }
}
class CoursePanel extends JPanel {
    JButton addCourse, clear;
    CoursePanel() {
        addCourse = new JButton("Add Course");
        clear = new JButton("Clear");
        setLayout(new FlowLayout());
        add(addCourse);
        add(clear);
    }
}
class SelectCoursePanel extends JPanel {
    JCheckBox java, swing, hibernate;
    SelectCoursePanel() {
        java = new JCheckBox("Java");
        swing = new JCheckBox("Spring");
        hibernate = new JCheckBox("Hibernate");
        setLayout(new FlowLayout());
        add(java);
        add(swing);
        add(hibernate);
    }
}
class JTabbedPaneExample {
    public static void main(String args[]) throws Exception {
        TabbedPane frame = new TabbedPane();
        frame.setSize(450, 150);
        frame.setVisible(true);
    }// end of main function
}// end of class
