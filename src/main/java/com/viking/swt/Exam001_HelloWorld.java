package com.viking.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/3/30
 */
public class Exam001_HelloWorld extends BaseExample{

    public static void main(String[] args){
        Exam001_HelloWorld exam_001 = new Exam001_HelloWorld() ;
        exam_001.createBase();
    }

    @Override
    protected void createWidget(Shell shell) {
        shell.setText("Hello , Eclipse SWT.");

        Button button = new Button(shell , SWT.CENTER) ;
        button.setText("Welcome to Eclipse SWT world.");

        button.pack();
    }
}
