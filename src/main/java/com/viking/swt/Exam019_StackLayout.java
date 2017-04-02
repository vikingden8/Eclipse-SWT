package com.viking.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/4/2
 */
public class Exam019_StackLayout extends BaseExample {

    public static void main(String[] args){
        Exam019_StackLayout stackLayout = new Exam019_StackLayout() ;
        stackLayout.createBase();
    }

    protected void createWidget(Shell shell) {
        shell.setText("StackLayout Example");
        shell.setLayout(new GridLayout());

        final Composite parent = new Composite(shell, SWT.NONE) ;
        parent.setLayoutData(new GridData(GridData.FILL_BOTH));

        final StackLayout stackLayout = new StackLayout() ;
        parent.setLayout(stackLayout);

        final Text[] textArrays = new Text[10] ;

        for (int i = 0 ; i < 10 ; i++){
            textArrays[i] = new Text(parent , SWT.MULTI) ;
            textArrays[i].setText("Current Text Index : " + (i+1));
        }

        stackLayout.topControl = textArrays[0] ;

        Button change = new Button(shell , SWT.NONE) ;
        change.setText("Change");
        final int[] index  = new int[1] ;
        change.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent selectionEvent) {
                super.widgetSelected(selectionEvent);
                index[0] = (index[0] + 1) % 10 ;
                stackLayout.topControl = textArrays[index[0]] ;
                parent.layout();

            }
        });
        shell.setSize(300 , 200);
        shell.layout();
    }
}
