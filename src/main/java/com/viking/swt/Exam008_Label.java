package com.viking.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/4/2
 */
public class Exam008_Label extends BaseExample {


    public static void main(String[] args)
    {
        Exam008_Label label = new Exam008_Label() ;
        label.createBase();
    }

    protected void createWidget(Shell shell) {
        shell.setLayout(new FillLayout(SWT.VERTICAL));
        shell.setText("Label Widget");

        Group normalLabel = new Group(shell , SWT.SHADOW_ETCHED_OUT) ;
        normalLabel.setLayout(new FillLayout(SWT.VERTICAL));
        normalLabel.setText("Normal Label");

        Label left = new Label(normalLabel , SWT.LEFT) ;
        left.setText("Label Left");

        Label center = new Label(normalLabel , SWT.CENTER) ;
        center.setText("Label Center");

        Label right = new Label(normalLabel , SWT.RIGHT) ;
        right.setText("Label Right");

        Group label_h = new Group(shell , SWT.SHADOW_ETCHED_OUT) ;
        label_h.setLayout(new FillLayout(SWT.VERTICAL));
        label_h.setText("Label horizontal");

        Label label_h_1 = new Label(label_h , SWT.NONE) ;
        label_h_1.setText("Horizontal Out");
        new Label(label_h , SWT.SEPARATOR|SWT.HORIZONTAL|SWT.SHADOW_OUT) ;

        Label label_h_2 = new Label(label_h , SWT.NONE) ;
        label_h_2.setText("Horizontal None");
        new Label(label_h , SWT.SEPARATOR|SWT.HORIZONTAL|SWT.SHADOW_NONE) ;

        Label label_h_3 = new Label(label_h , SWT.NONE) ;
        label_h_3.setText("Horizontal In");
        new Label(label_h , SWT.SEPARATOR|SWT.HORIZONTAL|SWT.SHADOW_IN) ;

        Group label_v = new Group(shell , SWT.SHADOW_ETCHED_OUT) ;
        label_v.setLayout(new FillLayout(SWT.HORIZONTAL));
        label_v.setText("Label vertical");

        new Label(label_v , SWT.SEPARATOR|SWT.VERTICAL|SWT.SHADOW_OUT) ;

        shell.layout();

    }
}
