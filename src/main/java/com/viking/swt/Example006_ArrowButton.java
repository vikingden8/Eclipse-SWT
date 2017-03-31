package com.viking.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/3/31
 */
public class Example006_ArrowButton extends BaseExample {

    public static void main(String[] args){
        Example006_ArrowButton exam006 = new Example006_ArrowButton() ;
        exam006.createBase();
    }


    protected void createWidget(Shell shell) {
        shell.setLayout(new FillLayout(SWT.VERTICAL));

        Button left = new Button(shell , SWT.ARROW|SWT.LEFT) ;
        left.setText("Arrow Left") ;

        Button right = new Button(shell , SWT.ARROW|SWT.RIGHT) ;
        right.setText("Arrow Right") ;

        Button up = new Button(shell , SWT.ARROW|SWT.UP) ;
        up.setText("Arrow Up") ;

        Button down = new Button(shell , SWT.ARROW|SWT.DOWN) ;
        down.setText("Arrow Down") ;

        Button border = new Button(shell , SWT.ARROW|SWT.BORDER) ;
        border.setText("Arrow Border") ;

        Button flat = new Button(shell , SWT.ARROW|SWT.FLAT) ;
        flat.setText("Arrow Flat") ;

        shell.layout();

    }
}
