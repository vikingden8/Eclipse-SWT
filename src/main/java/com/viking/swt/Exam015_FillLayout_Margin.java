package com.viking.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/4/2
 */
public class Exam015_FillLayout_Margin extends BaseExample {

    public static void main(String[] args){
        Exam015_FillLayout_Margin fillLayout = new Exam015_FillLayout_Margin() ;
        fillLayout.createBase();
    }

    protected void createWidget(Shell shell) {
        shell.setText("FillLayout Example");
        FillLayout fillLayout = new FillLayout(SWT.VERTICAL) ;
        fillLayout.marginHeight = 20 ;
        fillLayout.marginWidth = 10 ;
        fillLayout.spacing = 10 ;

        shell.setLayout(fillLayout);

        new Button(shell , SWT.NONE).setText("Button 01");
        new Button(shell , SWT.NONE).setText("Button 02");
        new Button(shell , SWT.NONE).setText("Button 03");

        shell.layout();
    }
}
