package com.viking.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Shell;

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/4/2
 */
public class Exam012_Combo extends BaseExample {

    public static void main(String[] args){
        Exam012_Combo exam012_combo = new Exam012_Combo() ;
        exam012_combo.createBase();
    }

    protected void createWidget(Shell shell) {
        shell.setText("组合框");
        FillLayout layout = new FillLayout();
        layout.marginHeight = 20;
        layout.marginWidth = 20;
        shell.setLayout(layout);

//        final Combo combo = new Combo(shell, SWT.SIMPLE);
        final Combo combo = new Combo(shell, SWT.DROP_DOWN);
        String[] items = new String[4];
        for (int i = 0; i < items.length; i++)
            items[i] = "选项" + i;
        combo.setItems(items);
        // 注册键盘事件
        combo.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                // 如果单击了向左的箭头按键，则选中上一个选项
                if (e.keyCode == SWT.ARROW_LEFT)
                    combo.select(combo.getSelectionIndex() - 1);
                    // 如果单击了向右的箭头按键，则选中下一个选项
                else if (e.keyCode == SWT.ARROW_RIGHT)
                    combo.select(combo.getSelectionIndex() + 1);
            }
        });
        shell.setSize(200, 100);
    }
}
