
package Extra;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author bryan_bancroft
 */
public class MassPanel extends JPanel{
    protected JRadioButton ounces;
    protected JRadioButton pounds;
    protected JRadioButton grams;
    protected JRadioButton kilograms;
    protected ButtonGroup metricBtn;
    protected ButtonGroup englishBtn;
    protected JLabel metricLabel;
    protected JLabel englishLabel;
    protected JTextField english;
    protected JTextField metric;
    
    public MassPanel(){
        ounces = new JRadioButton("Ounces");
        pounds = new JRadioButton("Pounds");
        grams = new JRadioButton("Grams");
        kilograms = new JRadioButton("Kilograms");
        english = new JTextField(20);
        metric = new JTextField(20);
        englishLabel = new JLabel("English");
        metricLabel = new JLabel("Metric");
        metricBtn = new ButtonGroup();
        englishBtn = new ButtonGroup();
        metricBtn.add(grams);
        metricBtn.add(kilograms);
        englishBtn.add(ounces);
        englishBtn.add(pounds);
        
        //Set Layout
        setLayout(new GridLayout(8,1));
        
        //Set Border
        setBorder(BorderFactory.createTitledBorder("Mass"));
        
        //Add Components
        add(englishLabel);
        add(ounces);
        add(pounds);
        add(english);
        add(metricLabel);
        add(grams);
        add(kilograms);
        add(metric);
    }

    public void ClearAll(){
        englishBtn.clearSelection();
        english.setText("");
        metricBtn.clearSelection();
        metric.setText("");
    }
}
