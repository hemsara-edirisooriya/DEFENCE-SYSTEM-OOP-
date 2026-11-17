/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defencesystem;

/**
 *
 * @author TECH YARD
 */
public interface Observer {
    public void msgSet(String msg, String ui);
    
    public void areaCleared(boolean status);
    
    int getSoldierCount();
    
   
    
    public void enebleButton(boolean s1, boolean s2, boolean s3, boolean s4);

    public void setVisible(boolean b);

    public void setMainController(MainController aThis);

    public void setEnabled(boolean b);
    
}
