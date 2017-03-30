package com.viking.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/3/30
 */
public class Example001 {

    public static void main(String[] args){
        Display display = new Display() ;
        Shell shell = new Shell(display) ;

        shell.setText("Hello , Eclipse SWT.");

        Button button = new Button(shell , SWT.CENTER) ;
        button.setText("Welcome to Eclipse SWT world.");

        button.pack();

        shell.pack();
        shell.open();

        while(!shell.isDisposed()){
            if (!display.readAndDispatch()){
                display.sleep() ;
            }
        }
        display.dispose();
    }
}
