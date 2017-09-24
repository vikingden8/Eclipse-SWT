package inaction;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/9/24
 */
public class EX01_HelloSWT {

    public static void main(String[] args) {
        Display display = new Display() ;
        Shell shell = new Shell(display) ;

        Text hello = new Text(shell, SWT.CENTER) ;
        hello.setText("Hello SWT!");
        hello.pack();

        shell.pack();
        shell.open();
        while (!shell.isDisposed()){
            if (!display.readAndDispatch()){
                display.sleep() ;
            }
        }
        display.dispose();
    }
}
