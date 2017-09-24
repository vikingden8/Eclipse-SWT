package inaction;

import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.*;

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/9/24
 */
public class EX02_HelloSWT_JFace extends ApplicationWindow {

    public EX02_HelloSWT_JFace() {
        super(null);
    }

    @Override
    protected Control createContents(Composite parent) {
        Text hello = new Text(parent, SWT.CENTER) ;
        hello.setText("Hello SWT JFace!");
        hello.pack();
        return parent;
    }

    public static void main(String[] args) {
        EX02_HelloSWT_JFace jface = new EX02_HelloSWT_JFace() ;
        jface.setBlockOnOpen(true);
        jface.open() ;
        Display.getCurrent().dispose();
    }
}
