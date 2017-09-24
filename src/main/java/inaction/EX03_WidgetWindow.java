package inaction;

import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/9/24
 */
public class EX03_WidgetWindow  extends ApplicationWindow
{
    public EX03_WidgetWindow()
    {
        super(null);
    }
    protected Control createContents(Composite parent)
    {
        getShell().setText("Widget Window");
        parent.setSize(400,250);
        return parent;
    }
    public static void main(String[] args)
    {
        EX03_WidgetWindow wwin = new EX03_WidgetWindow();
        wwin.setBlockOnOpen(true);
        wwin.open();
        Display.getCurrent().dispose();
    }
}
