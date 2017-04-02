package com.viking.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Shell;

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/4/2
 */
public class Exam009_CLabel extends BaseExample {

    public static void main(String[] args){
        Exam009_CLabel exam009_cLabel = new Exam009_CLabel() ;
        exam009_cLabel.createBase();
    }

    protected void createWidget(Shell shell) {
        shell.setLayout(new FillLayout(SWT.VERTICAL));
        shell.setText("CLabel Widget");

        CLabel cLabel = new CLabel(shell , SWT.LEFT) ;
        cLabel.setText("This is a CLabel Widget");
        cLabel.setImage(display.getSystemImage(SWT.ICON_INFORMATION));

        shell.layout();


    }
}
