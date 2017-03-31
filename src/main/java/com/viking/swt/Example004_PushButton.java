package com.viking.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/3/31
 */
public class Example004_PushButton extends BaseExample{

    public static void main(String[] args){
        Example004_PushButton pushButton = new Example004_PushButton();
        pushButton.createBase();
    }


    protected void createWidget(Shell shell) {
        shell.setLayout(new FillLayout(SWT.VERTICAL));

        Button left = new Button(shell , SWT.PUSH|SWT.LEFT) ;
        left.setText("Left");
        left.setToolTipText("Tiptext Left");

        Button right = new Button(shell , SWT.PUSH|SWT.RIGHT) ;
        right.setText("Right");
        right.setToolTipText("Tiptext Right");

        Button center = new Button(shell , SWT.PUSH|SWT.CENTER) ;
        center.setText("Center");
        center.setToolTipText("Tiptext Center");

        Button border = new Button(shell , SWT.PUSH|SWT.BORDER) ;
        border.setText("Border");
        border.setToolTipText("Tiptext Border");

        shell.layout();
    }
}
