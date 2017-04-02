package com.viking.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/4/2
 */
public class Exam017_GridLayout extends BaseExample {

    public static void main(String[] args){
        Exam017_GridLayout gridLayout = new Exam017_GridLayout() ;
        gridLayout.createBase();
    }

    protected void createWidget(Shell shell) {
        shell.setText("GridLayout Example");
        GridLayout gridLayout = new GridLayout() ;
        gridLayout.marginHeight = 20 ;
        gridLayout.marginWidth = 10 ;
        gridLayout.numColumns = 3 ;
        //add each item width equal
        gridLayout.horizontalSpacing = 10 ;
        gridLayout.verticalSpacing = 10 ;
        gridLayout.makeColumnsEqualWidth = true ;

        shell.setLayout(gridLayout);

        Button btn = new Button(shell , SWT.NONE) ;
        btn.setText("B01");
        GridData gridData = new GridData(100, 30) ;
        gridData.horizontalSpan = 2 ;
        btn.setLayoutData(gridData);


//        new Button(shell , SWT.NONE).setText("Button 02");
        new Button(shell , SWT.NONE).setText("Long Text Button 03");
        new Button(shell , SWT.NONE).setText("B04");

        new Button(shell , SWT.NONE).setText("Long Text Button 05");
        new Button(shell , SWT.NONE).setText("B06");

        shell.layout();
    }
}
