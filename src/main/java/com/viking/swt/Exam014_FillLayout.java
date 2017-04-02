package com.viking.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/4/2
 */
public class Exam014_FillLayout extends BaseExample {

    public static void main(String[] args){
        Exam014_FillLayout fillLayout = new Exam014_FillLayout() ;
        fillLayout.createBase();
    }

    protected void createWidget(Shell shell) {
        shell.setText("FillLayout Example");
        shell.setLayout(new FillLayout());
//        shell.setLayout(new FillLayout(SWT.VERTICAL));

        new Button(shell , SWT.NONE).setText("Button 01");
        new Button(shell , SWT.NONE).setText("Button 02");
        new Button(shell , SWT.NONE).setText("Button 03");

        shell.layout();
    }
}
