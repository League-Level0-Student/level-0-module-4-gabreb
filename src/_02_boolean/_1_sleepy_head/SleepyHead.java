package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
        int x = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        System.out.println(x);
        int y = JOptionPane.showConfirmDialog(null, "Are you on vacation", "Vacation", JOptionPane.YES_NO_OPTION);
        if (x==0 && y ==0) {
        	JOptionPane.showMessageDialog(null, "Sleep In");
        }
        
        else if (x ==0) {
        	JOptionPane.showMessageDialog(null, "Get up Lazy bones!");
        }
        else {
        	JOptionPane.showMessageDialog(null, "Sleep In");
        }
        /*
         * Print “sleep in"? if it is a vacation or a weekend. 
         * If it’s a weekday, print “get up lazybones!"? 
         * If it is a weekday, but we are on vacation,  print “sleep in"?.
         */
    }
}
