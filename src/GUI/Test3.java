package GUI;

import java.awt.BorderLayout;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.*;

public class Test3 extends JFrame{
	
	
	public Test3() {
		JFrame frame = new JFrame("Property Split");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
	    splitPane.setContinuousLayout(true);
	    splitPane.setOneTouchExpandable(true);

	    JComponent topComponent = new JButton("A");
	    splitPane.setTopComponent(topComponent);

	    JComponent bottomComponent = new JButton("B");
	    splitPane.setBottomComponent(bottomComponent);

	    PropertyChangeListener propertyChangeListener = new PropertyChangeListener() {
	      public void propertyChange(PropertyChangeEvent changeEvent) {
	        JSplitPane sourceSplitPane = (JSplitPane) changeEvent.getSource();
	        String propertyName = changeEvent.getPropertyName();
	        if (propertyName.equals(JSplitPane.LAST_DIVIDER_LOCATION_PROPERTY)) {
	          int current = sourceSplitPane.getDividerLocation();
	          System.out.println("Current: " + current);
	          Integer last = (Integer) changeEvent.getNewValue();
	          System.out.println("Last: " + last);
	          Integer priorLast = (Integer) changeEvent.getOldValue();
	          System.out.println("Prior last: " + priorLast);
	        }
	      }
	    };

	    splitPane.addPropertyChangeListener(propertyChangeListener);

	    frame.add(splitPane, BorderLayout.CENTER);
	    frame.setSize(300, 150);
	    frame.setVisible(true);
	
	}
	
	public static void main(String[] args) {
		new Test3();
	}
}
