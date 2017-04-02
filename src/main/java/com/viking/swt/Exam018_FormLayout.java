package com.viking.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;
import sun.text.resources.FormatData;

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/4/2
 */
public class Exam018_FormLayout extends BaseExample {

    public static void main(String[] args){
        Exam018_FormLayout formLayout = new Exam018_FormLayout() ;
        formLayout.createBase();
    }

    protected void createWidget(Shell shell) {
        shell.setText("FormLayout Example");

        FormLayout formLayout = new FormLayout() ;
        formLayout.marginHeight = 10 ;
        formLayout.marginWidth = 10 ;
        shell.setLayout(formLayout);

        Button btn = new Button(shell , SWT.NONE) ;
        btn.setText("Button 01");
        FormData formData = new FormData() ;
        formData.top = new FormAttachment(20 , 0) ;
        formData.left = new FormAttachment(10 , 0) ;
        btn.setLayoutData(formData);

        Button btn02 = new Button(shell , SWT.NONE) ;
        btn02.setText("Button 02");
        FormData formData1 = new FormData() ;
        formData1.top = new FormAttachment(20 , 0) ;
        formData1.left = new FormAttachment(btn , 10 , 0) ;
        btn02.setLayoutData(formData1);

        shell.layout();
    }
}
