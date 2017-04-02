package com.viking.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/3/31
 */
public class Exam005_ToggleButton extends BaseExample{

    public static void main(String[] args){
        Exam005_ToggleButton exam005 = new Exam005_ToggleButton() ;
        exam005.createBase();
    }


    protected void createWidget(Shell shell) {
        shell.setLayout(new FillLayout(SWT.VERTICAL));

        Button toggle1 = new Button(shell , SWT.TOGGLE|SWT.LEFT) ;
        toggle1.setText("Toggle Left");

        Button toggle2 = new Button(shell , SWT.TOGGLE|SWT.FLAT) ;
        toggle2.setText("Toggle Flat");

        Button toggle3 = new Button(shell , SWT.TOGGLE|SWT.RIGHT) ;
        toggle3.setText("Toggle Right");
    }
}
