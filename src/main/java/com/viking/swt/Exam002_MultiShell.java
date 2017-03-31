package com.viking.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/3/30
 */
public class Exam002_MultiShell extends BaseExample{

    public static void main(String[] args){
        Exam002_MultiShell exam_002 = new Exam002_MultiShell() ;
        exam_002.createBase();
    }

    @Override
    protected void createWidget(final Shell shell) {
        shell.setText("Multi-Shell Window");
        shell.setSize(300, 200);

        Button addBtn = new Button(shell , SWT.CENTER) ;
        addBtn.setText("Add Shell Window");
        addBtn.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent selectionEvent) {
                super.widgetSelected(selectionEvent);
                createChildShell(shell) ;
            }
        });
        addBtn.pack();
    }

    private Shell createChildShell(Shell shell) {
        Shell child = new Shell(shell , SWT.DIALOG_TRIM) ;
        child.setText("Dialog Shell Window");
        child.setSize(150 , 100);

        child.pack();
        child.open();
        return child ;
    }
}
