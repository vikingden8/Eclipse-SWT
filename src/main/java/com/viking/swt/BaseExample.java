package com.viking.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/3/30
 */
public abstract class BaseExample {

    protected void createBase(){
        Display display = new Display() ;
        Shell shell = new Shell(display , SWT.SHELL_TRIM) ;


        createWidget(shell) ;

        shell.pack();
        shell.open();

        while (!shell.isDisposed()){
            if (!display.readAndDispatch()){
                display.sleep() ;
            }
        }
        display.dispose();
    }

    protected abstract void createWidget(Shell shell) ;
}
