package com.viking.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/3/31
 */
public class Exam003_ComplexShell extends BaseExample{

    public static void main(String[] args){
        Exam003_ComplexShell exam003 = new Exam003_ComplexShell() ;
        exam003.createBase();
    }

    @Override
    protected void createWidget(Shell shell) {
        shell.setSize(300 , 200);
        shell.setText("Complex Shell");
        shell.setLayout(new FillLayout(SWT.VERTICAL));

        Group group = new Group(shell , SWT.SHADOW_ETCHED_OUT) ;
        group.setText("Widget Group 1");
        group.setLayout(new FillLayout(SWT.VERTICAL));

        Button btn_01 = new Button(group , SWT.RADIO) ;
        btn_01.setText("Radio Button One");

        Button btn_02 = new Button(group , SWT.RADIO) ;
        btn_02.setText("Radio Button Two");

        Button btn_03 = new Button(shell , SWT.RADIO) ;
        btn_03.setText("Button One");

        group.layout();

        shell.layout();
    }
}
