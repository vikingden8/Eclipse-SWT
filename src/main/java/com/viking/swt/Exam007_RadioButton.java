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
public class Exam007_RadioButton extends BaseExample {

    public static void main(String[] args){
        Exam007_RadioButton exam007 = new Exam007_RadioButton() ;
        exam007.createBase();
    }

    protected void createWidget(Shell shell) {
        shell.setLayout(new FillLayout(SWT.VERTICAL));

        Group group1 = new Group(shell , SWT.SHADOW_ETCHED_OUT) ;
        group1.setText("Group 1");
        group1.setLayout(new FillLayout(SWT.VERTICAL));

        Button btn1 = new Button(group1 , SWT.RADIO|SWT.LEFT) ;
        btn1.setText("Radio Left");

        Button btn2 = new Button(group1 , SWT.RADIO|SWT.CENTER) ;
        btn2.setText("Radio Center");

        Button btn3 = new Button(group1 , SWT.RADIO|SWT.RIGHT) ;
        btn3.setText("Radio Right");

        group1.layout();

        Group group2 = new Group(shell , SWT.SHADOW_ETCHED_IN) ;
        group2.setLayout(new FillLayout(SWT.VERTICAL));
        group2.setText("Group 2");

        Button btn4 = new Button(group2 , SWT.RADIO|SWT.BORDER) ;
        btn4.setText("Radio Border");

        Button btn5 = new Button(group2 , SWT.RADIO|SWT.FLAT) ;
        btn5.setText("Radio Flat");

        group2.layout();

        shell.layout();

    }
}
