package com.viking.swt;

import com.sun.org.apache.bcel.internal.generic.SWAP;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/4/2
 */
public class Exam013_SashForm extends BaseExample {

    public static void main(String[] args){
        Exam013_SashForm sashForm = new Exam013_SashForm();
        sashForm.createBase();
    }

    protected void createWidget(Shell shell) {
        shell.setLayout(new FillLayout());
        shell.setText("SashForm Example");

        SashForm sashForm = new SashForm(shell , SWT.HORIZONTAL|SWT.BORDER) ;
        sashForm.setLayout(new FillLayout());

        Composite child1 = new Composite(sashForm , SWT.NONE) ;
        child1.setLayout(new FillLayout());
        new Text(child1 , SWT.MULTI).setText("Window 01");

        Composite child2 = new Composite(sashForm , SWT.NONE) ;
        child2.setLayout(new FillLayout());
        new Text(child2 , SWT.MULTI).setText("Window 02");

        sashForm.setWeights(new int[]{30, 70});

//        sashForm.setMaximizedControl(child2);

        shell.setSize( 200,150);
        shell.layout();

    }
}
