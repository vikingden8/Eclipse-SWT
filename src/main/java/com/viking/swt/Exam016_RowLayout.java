package com.viking.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/4/2
 */
public class Exam016_RowLayout extends BaseExample {

    public static void main(String[] args){
        Exam016_RowLayout fillLayout = new Exam016_RowLayout() ;
        fillLayout.createBase();
    }

    protected void createWidget(Shell shell) {
        shell.setText("RowLayout Example");
//        RowLayout rowLayout = new RowLayout(SWT.HORIZONTAL) ;
        RowLayout rowLayout = new RowLayout(SWT.VERTICAL) ;
        rowLayout.marginHeight = 20 ;
        rowLayout.marginWidth = 10 ;
        rowLayout.spacing = 10 ;

        shell.setLayout(rowLayout);

        new Button(shell , SWT.NONE).setText("B01");
        new Button(shell , SWT.NONE).setText("Button 02");
        new Button(shell , SWT.NONE).setText("Long Text Button 03");
        new Button(shell , SWT.NONE).setText("B04");

        shell.layout();
    }
}
