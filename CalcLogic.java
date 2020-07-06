
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.*;

public class CalcLogic implements ActionListener{
    
        tutorial2  parent;
        char selectedAction = ' '; // +, -, /, или *
        int counter=0;
        int counter2=0;
        double currentResult =0;
        CalcLogic(tutorial2 parent){
            this.parent = parent;
        }
        public void actionPerformed(ActionEvent e){
            try{
            JButton clickedButton = (JButton) e.getSource();
            double displayValue=0;
            String dispFieldText=parent.displayField.getText();
            if (!"".equals(dispFieldText)){
                displayValue= Double.parseDouble(parent.displayField.getText());
            }
            Object src = e.getSource();

            if (src == parent.bPlus){

                parent.displayField.setText("");
                if (counter==0){
                    currentResult=displayValue;
                    counter=1;
                }else{
                    if(selectedAction=='*'){
                        currentResult*=displayValue;
                    }else if(selectedAction=='+'){
                        currentResult+=displayValue;
                    }
                    else if(selectedAction=='-'){
                        currentResult-=displayValue;
                    }
                    else if(selectedAction=='/'){
                        currentResult/=displayValue;
                    }
                    String a=String.valueOf(currentResult);

                    parent.displayField.setText(a);

                }
                selectedAction='+';
                counter2=1;
            }else if (src==parent.bC){
                parent.displayField.setText("0");
                displayValue=0;
                selectedAction = ' ';
                currentResult =0;
                counter=0;
                counter2=0;
            }
            else if (src == parent.bMin){

                parent.displayField.setText("");
                if (counter==0){
                    currentResult=displayValue;
                    counter=1;
                }else{
                    if(selectedAction=='*'){
                        currentResult*=displayValue;
                    }else if(selectedAction=='+'){
                        currentResult+=displayValue;
                    }
                    else if(selectedAction=='-'){
                        currentResult-=displayValue;
                    }
                    else if(selectedAction=='/'){
                        currentResult/=displayValue;
                    }
                    String a=String.valueOf(currentResult);

                    parent.displayField.setText(a);

                }
                selectedAction='-';
                counter2=1;
            }else if (src == parent.bDivi){

                parent.displayField.setText("");
                if (counter==0){
                    currentResult=displayValue;
                    counter=1;
                }else{
                    if(selectedAction=='*'){
                        currentResult*=displayValue;
                    }else if(selectedAction=='+'){
                        currentResult+=displayValue;
                    }
                    else if(selectedAction=='-'){
                        currentResult-=displayValue;
                    }
                    else if(selectedAction=='/'){
                        currentResult/=displayValue;
                    }
                    String a=String.valueOf(currentResult);

                    parent.displayField.setText(a);

                }
                selectedAction='/';
                counter2=1;
            }else if (src == parent.bMulti){

                parent.displayField.setText("");
                if (counter==0){
                    currentResult=displayValue;
                    counter=1;
                }else{
                    if(selectedAction=='*'){
                        currentResult*=displayValue;
                    }else if(selectedAction=='+'){
                        currentResult+=displayValue;
                    }
                    else if(selectedAction=='-'){
                        currentResult-=displayValue;
                    }
                    else if(selectedAction=='/'){
                        currentResult/=displayValue;
                    }
                    String a=String.valueOf(currentResult);

                    parent.displayField.setText(a);

                }
                selectedAction = '*';
                counter2=1;
            } else if (src == parent.bE){
                counter=0;
                if (selectedAction=='+'){
                    currentResult+=displayValue;
                    parent.displayField.setText(""+currentResult);
                }else if (selectedAction=='-'){
                    currentResult -=displayValue;
                    parent.displayField.setText(""+currentResult);
                }else if (selectedAction=='/'){
                    currentResult /=displayValue;
                    parent.displayField.setText(""+currentResult);
                }else if (selectedAction=='*'){
                    currentResult*=displayValue;
                    parent.displayField.setText(""+currentResult);
                }
            } else{
                System.out.println(dispFieldText);
                if (counter==1 & counter2==1){
                    parent.displayField.setText("");
                    dispFieldText="";
                    String clickedButtonLabel= clickedButton.getText();
                    parent.displayField.setText(dispFieldText +clickedButtonLabel);
                    counter2=0;
                }
                else if (dispFieldText.equals("0") & src != parent.bP){
                    parent.displayField.setText("");
                    dispFieldText="";
                    String clickedButtonLabel= clickedButton.getText();
                    parent.displayField.setText(dispFieldText +clickedButtonLabel);
                }else if(dispFieldText.equals("0") & src == parent.bP){
                    String clickedButtonLabel= clickedButton.getText();
                    parent.displayField.setText(dispFieldText +clickedButtonLabel);
                }else{
                    String clickedButtonLabel= clickedButton.getText();
                    parent.displayField.setText(dispFieldText +clickedButtonLabel);
                }
            }  
        }catch(Exception er){
             parent.displayField.setText("Error");
        }
    
    }
}

