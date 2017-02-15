
package Extra;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author bryan_bancroft
 */
public class LengthPanel extends JPanel{
    protected JRadioButton inches;
    protected JRadioButton feet;
    protected JRadioButton yards;
    protected JRadioButton miles;
    protected JRadioButton millimeters;
    protected JRadioButton centimeters;
    protected JRadioButton meters;
    protected JRadioButton kilometers;
    protected JTextField metric;
    protected JTextField english;
    protected JLabel metricLabel;
    protected JLabel englishLabel;
    protected ButtonGroup englishBtn;
    protected ButtonGroup metricBtn;
    
    public LengthPanel(){
        //Initialize Components
        inches = new JRadioButton("Inches");
        feet = new JRadioButton("Feet");
        yards = new JRadioButton("Yards");
        miles = new JRadioButton("Miles");
        millimeters = new JRadioButton("Millimeters");
        centimeters = new JRadioButton("Centimeters");
        meters = new JRadioButton("Meters");
        kilometers = new JRadioButton("Kilometers");
        metric = new JTextField(20);
        english = new JTextField(20);
        metricLabel = new JLabel("Metric");
        englishLabel = new JLabel("English");
        englishBtn = new ButtonGroup();
        metricBtn = new ButtonGroup();
        englishBtn.add(inches);
        englishBtn.add(feet);
        englishBtn.add(yards);
        englishBtn.add(miles);
        metricBtn.add(millimeters);
        metricBtn.add(centimeters);
        metricBtn.add(meters);
        metricBtn.add(kilometers);
        
        //GridLayout manager
        setLayout(new GridLayout(12,1));
        
        //Border
        setBorder(BorderFactory.createTitledBorder("Length"));
        
        //Add components
        add(englishLabel);
        add(inches);
        add(feet);
        add(yards);
        add(miles);
        add(english);
        add(metricLabel);
        add(millimeters);
        add(centimeters);
        add(meters);
        add(kilometers);
        add(metric);
    }
    
    public void ClearAll(){
        englishBtn.clearSelection();
        english.setText("");
        metricBtn.clearSelection();
        metric.setText("");
    }
}
