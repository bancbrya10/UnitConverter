
package Extra;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;

/**
 *
 * @author bryan_bancroft
 */
public class UnitConverterGUI extends JFrame{
    private LengthPanel lengthPanel;
    private MassPanel massPanel;
    
    private JPanel buttonPanel;
    private JButton calculateBtn;
    private JButton clearBtn;
    private double length;
    private double mass;
    private double conversion;
    private DecimalFormat df = new DecimalFormat("#,###,###,##0.00##");
    
    private static final double IN_TO_CM = 2.54;
    private static final double FT_TO_CM = 30.48;
    private static final double YD_TO_M = 0.9144;
    private static final double MI_TO_KM = 1.609344;
    private static final double MM_TO_IN = 0.039370079;
    private static final double CM_TO_IN = 0.39370079;
    private static final double M_TO_FT = 3.2808399;
    private static final double M_TO_YD = 1.0936133 ;
    private static final double KM_TO_MI = 0.62137119;
    private static final double OZ_TO_G = 28.349523;
    private static final double LB_TO_KG = 0.45359237;
    private static final double G_TO_OZ = 0.035273962;
    private static final double KG_TO_LB = 2.2046226;
    
    public static void main(String[] args){
        UnitConverterGUI gui = new UnitConverterGUI();
        gui.setSize(350,600);
        gui.setResizable(false);
        gui.setVisible(true);
        gui.setTitle("Unit Converter");
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public UnitConverterGUI(){
        //Initialize panels
        lengthPanel = new LengthPanel();
        massPanel = new MassPanel();
        buttonPanel = new JPanel();
        calculateBtn = new JButton("Calculate");
        clearBtn = new JButton("Clear");
        
        //Add buttons to button panel
        buttonPanel.add(calculateBtn);
        buttonPanel.add(clearBtn);
        
        //Add panels
        add(lengthPanel, BorderLayout.NORTH);
        add(massPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        
        //Add action listeners for buttons
        calculateBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(lengthPanel.inches.isSelected() && lengthPanel.millimeters.isSelected() && !lengthPanel.english.getText().equals("")){
                    length = Double.parseDouble(lengthPanel.english.getText());
                    conversion = length * IN_TO_CM * 10;
                    lengthPanel.metric.setText(df.format(conversion));
                }
                else if(lengthPanel.inches.isSelected() && lengthPanel.centimeters.isSelected() && !lengthPanel.english.getText().equals("")){
                    length = Double.parseDouble(lengthPanel.english.getText());
                    conversion = length * IN_TO_CM;
                    lengthPanel.metric.setText(df.format(conversion));
                }
                else if(lengthPanel.inches.isSelected() && lengthPanel.meters.isSelected() && !lengthPanel.english.getText().equals("")){
                    length = Double.parseDouble(lengthPanel.english.getText());
                    conversion = length * IN_TO_CM / 100;
                    lengthPanel.metric.setText(df.format(conversion));
                }
                else if(lengthPanel.inches.isSelected() && lengthPanel.kilometers.isSelected() && !lengthPanel.english.getText().equals("")){
                    length = Double.parseDouble(lengthPanel.english.getText());
                    conversion = length * IN_TO_CM / 100000;
                    lengthPanel.metric.setText(df.format(conversion));
                }
                else if(lengthPanel.feet.isSelected() && lengthPanel.millimeters.isSelected() && !lengthPanel.english.getText().equals("")){
                    length = Double.parseDouble(lengthPanel.english.getText());
                    conversion = length * FT_TO_CM * 10;
                    lengthPanel.metric.setText(df.format(conversion));
                }
                else if(lengthPanel.feet.isSelected() && lengthPanel.centimeters.isSelected() && !lengthPanel.english.getText().equals("")){
                    length = Double.parseDouble(lengthPanel.english.getText());
                    conversion = length * FT_TO_CM;
                    lengthPanel.metric.setText(df.format(conversion));
                }
                else if(lengthPanel.feet.isSelected() && lengthPanel.meters.isSelected() && !lengthPanel.english.getText().equals("")){
                    length = Double.parseDouble(lengthPanel.english.getText());
                    conversion = length * FT_TO_CM / 100;
                    lengthPanel.metric.setText(df.format(conversion));
                }
                else if(lengthPanel.feet.isSelected() && lengthPanel.kilometers.isSelected() && !lengthPanel.english.getText().equals("")){
                    length = Double.parseDouble(lengthPanel.english.getText());
                    conversion = length * FT_TO_CM / 100000;
                    lengthPanel.metric.setText(df.format(conversion));
                }
                else if(lengthPanel.yards.isSelected() && lengthPanel.millimeters.isSelected() && !lengthPanel.english.getText().equals("")){
                    length = Double.parseDouble(lengthPanel.english.getText());
                    conversion = length * YD_TO_M * 1000;
                    lengthPanel.metric.setText(df.format(conversion));
                }
                else if(lengthPanel.yards.isSelected() && lengthPanel.centimeters.isSelected() && !lengthPanel.english.getText().equals("")){
                    length = Double.parseDouble(lengthPanel.english.getText());
                    conversion = length * YD_TO_M * 100;
                    lengthPanel.metric.setText(df.format(conversion));
                }
                else if(lengthPanel.yards.isSelected() && lengthPanel.meters.isSelected() && !lengthPanel.english.getText().equals("")){
                    length = Double.parseDouble(lengthPanel.english.getText());
                    conversion = length * YD_TO_M;
                    lengthPanel.metric.setText(df.format(conversion));
                }
                else if(lengthPanel.yards.isSelected() && lengthPanel.kilometers.isSelected() && !lengthPanel.english.getText().equals("")){
                    length = Double.parseDouble(lengthPanel.english.getText());
                    conversion = length * YD_TO_M / 1000;
                    lengthPanel.metric.setText(df.format(conversion));
                }
                else if(lengthPanel.miles.isSelected() && lengthPanel.millimeters.isSelected() && !lengthPanel.english.getText().equals("")){
                    length = Double.parseDouble(lengthPanel.english.getText());
                    conversion = length * MI_TO_KM * 1000000;
                    lengthPanel.metric.setText(df.format(conversion));
                }
                else if(lengthPanel.miles.isSelected() && lengthPanel.centimeters.isSelected() && !lengthPanel.english.getText().equals("")){
                    length = Double.parseDouble(lengthPanel.english.getText());
                    conversion = length * MI_TO_KM * 100000;
                    lengthPanel.metric.setText(df.format(conversion));
                }
                else if(lengthPanel.miles.isSelected() && lengthPanel.meters.isSelected() && !lengthPanel.english.getText().equals("")){
                    length = Double.parseDouble(lengthPanel.english.getText());
                    conversion = length * MI_TO_KM * 1000;
                    lengthPanel.metric.setText(df.format(conversion));
                }
                else if(lengthPanel.miles.isSelected() && lengthPanel.kilometers.isSelected() && !lengthPanel.english.getText().equals("")){
                    length = Double.parseDouble(lengthPanel.english.getText());
                    conversion = length * MI_TO_KM;
                    lengthPanel.metric.setText(df.format(conversion));
                }
                else if(lengthPanel.inches.isSelected() && lengthPanel.millimeters.isSelected() && !lengthPanel.metric.getText().equals("")){
                    length = Double.parseDouble(lengthPanel.metric.getText());
                    conversion = length * MM_TO_IN;
                    lengthPanel.english.setText(df.format(conversion));
                }
                else if(lengthPanel.feet.isSelected() && lengthPanel.millimeters.isSelected() && !lengthPanel.metric.getText().equals("")){
                    length = Double.parseDouble(lengthPanel.metric.getText());
                    conversion = length * MM_TO_IN / 12;
                    lengthPanel.english.setText(df.format(conversion));
                }
                else if(lengthPanel.yards.isSelected() && lengthPanel.millimeters.isSelected() && !lengthPanel.metric.getText().equals("")){
                    length = Double.parseDouble(lengthPanel.metric.getText());
                    conversion = length * MM_TO_IN / 36;
                    lengthPanel.english.setText(df.format(conversion));
                }
                else if(lengthPanel.miles.isSelected() && lengthPanel.millimeters.isSelected() && !lengthPanel.metric.getText().equals("")){
                    length = Double.parseDouble(lengthPanel.metric.getText());
                    conversion = (length * MM_TO_IN / 12) / 5280;
                    lengthPanel.english.setText(df.format(conversion));
                }
                else if(lengthPanel.inches.isSelected() && lengthPanel.centimeters.isSelected() && !lengthPanel.metric.getText().equals("")){
                    length = Double.parseDouble(lengthPanel.metric.getText());
                    conversion = length * CM_TO_IN;
                    lengthPanel.english.setText(df.format(conversion));
                }
                else if(lengthPanel.feet.isSelected() && lengthPanel.centimeters.isSelected() && !lengthPanel.metric.getText().equals("")){
                    length = Double.parseDouble(lengthPanel.metric.getText());
                    conversion = length * CM_TO_IN / 12;
                    lengthPanel.english.setText(df.format(conversion));
                }
                else if(lengthPanel.yards.isSelected() && lengthPanel.centimeters.isSelected() && !lengthPanel.metric.getText().equals("")){
                    length = Double.parseDouble(lengthPanel.metric.getText());
                    conversion = length * CM_TO_IN / 36;
                    lengthPanel.english.setText(df.format(conversion));
                }
                else if(lengthPanel.miles.isSelected() && lengthPanel.centimeters.isSelected() && !lengthPanel.metric.getText().equals("")){
                    length = Double.parseDouble(lengthPanel.metric.getText());
                    conversion = (length * CM_TO_IN / 12) / 5280;
                    lengthPanel.english.setText(df.format(conversion));
                }
                else if(lengthPanel.inches.isSelected() && lengthPanel.meters.isSelected() && !lengthPanel.metric.getText().equals("")){
                    length = Double.parseDouble(lengthPanel.metric.getText());
                    conversion = length * M_TO_FT * 12;
                    lengthPanel.english.setText(df.format(conversion));
                }
                else if(lengthPanel.feet.isSelected() && lengthPanel.meters.isSelected() && !lengthPanel.metric.getText().equals("")){
                    length = Double.parseDouble(lengthPanel.metric.getText());
                    conversion = length * M_TO_FT;
                    lengthPanel.english.setText(df.format(conversion));
                }
                else if(lengthPanel.yards.isSelected() && lengthPanel.meters.isSelected() && !lengthPanel.metric.getText().equals("")){
                    length = Double.parseDouble(lengthPanel.metric.getText());
                    conversion = length * M_TO_YD;
                    lengthPanel.english.setText(df.format(conversion));
                }
                else if(lengthPanel.miles.isSelected() && lengthPanel.meters.isSelected() && !lengthPanel.metric.getText().equals("")){
                    length = Double.parseDouble(lengthPanel.metric.getText());
                    conversion = length * M_TO_FT / 5280;
                    lengthPanel.english.setText(df.format(conversion));
                }
                else if(lengthPanel.inches.isSelected() && lengthPanel.kilometers.isSelected() && !lengthPanel.metric.getText().equals("")){
                    length = Double.parseDouble(lengthPanel.metric.getText());
                    conversion = length * KM_TO_MI * 5280 * 12;
                    lengthPanel.english.setText(df.format(conversion));
                }
                else if(lengthPanel.feet.isSelected() && lengthPanel.kilometers.isSelected() && !lengthPanel.metric.getText().equals("")){
                    length = Double.parseDouble(lengthPanel.metric.getText());
                    conversion = length * KM_TO_MI * 5280;
                    lengthPanel.english.setText(df.format(conversion));
                }
                else if(lengthPanel.yards.isSelected() && lengthPanel.kilometers.isSelected() && !lengthPanel.metric.getText().equals("")){
                    length = Double.parseDouble(lengthPanel.metric.getText());
                    conversion = (length * KM_TO_MI * 5280) / 3;
                    lengthPanel.english.setText(df.format(conversion));
                }
                else if(lengthPanel.miles.isSelected() && lengthPanel.kilometers.isSelected() && !lengthPanel.metric.getText().equals("")){
                    length = Double.parseDouble(lengthPanel.metric.getText());
                    conversion = length * KM_TO_MI;
                    lengthPanel.english.setText(df.format(conversion));
                }
                else if(massPanel.ounces.isSelected() && massPanel.grams.isSelected() && !massPanel.english.getText().equals("")){
                    mass = Double.parseDouble(massPanel.english.getText());
                    conversion = mass * OZ_TO_G;
                    massPanel.metric.setText(df.format(conversion));
                }
                else if(massPanel.ounces.isSelected() && massPanel.kilograms.isSelected() && !massPanel.english.getText().equals("")){
                    mass = Double.parseDouble(massPanel.english.getText());
                    conversion = (mass * OZ_TO_G) / 1000;
                    massPanel.metric.setText(df.format(conversion));
                }
                else if(massPanel.pounds.isSelected() && massPanel.grams.isSelected() && !massPanel.english.getText().equals("")){
                    mass = Double.parseDouble(massPanel.english.getText());
                    conversion = mass * LB_TO_KG * 1000;
                    massPanel.metric.setText(df.format(conversion));
                }
                else if(massPanel.pounds.isSelected() && massPanel.kilograms.isSelected() && !massPanel.english.getText().equals("")){
                    mass = Double.parseDouble(massPanel.english.getText());
                    conversion = mass * LB_TO_KG;
                    massPanel.metric.setText(df.format(conversion));
                }
                else if(massPanel.ounces.isSelected() && massPanel.grams.isSelected() && !massPanel.metric.getText().equals("")){
                    mass = Double.parseDouble(massPanel.metric.getText());
                    conversion = mass * G_TO_OZ;
                    massPanel.english.setText(df.format(conversion));
                }
                else if(massPanel.pounds.isSelected() && massPanel.grams.isSelected() && !massPanel.metric.getText().equals("")){
                    mass = Double.parseDouble(massPanel.metric.getText());
                    conversion = (mass * G_TO_OZ) / 16;
                    massPanel.english.setText(df.format(conversion));
                }
                else if(massPanel.ounces.isSelected() && massPanel.kilograms.isSelected() && !massPanel.metric.getText().equals("")){
                    mass = Double.parseDouble(massPanel.metric.getText());
                    conversion = mass * KG_TO_LB * 16;
                    massPanel.english.setText(df.format(conversion));
                }
                else if(massPanel.pounds.isSelected() && massPanel.kilograms.isSelected() && !massPanel.metric.getText().equals("")){
                    mass = Double.parseDouble(massPanel.metric.getText());
                    conversion = mass * G_TO_OZ;
                    massPanel.english.setText(df.format(conversion));
                }
            }
        });
        
        clearBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                lengthPanel.ClearAll();
                massPanel.ClearAll();
            }
        });
    }
}
