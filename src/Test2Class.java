import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.ui.Messages;

public class Test2Class extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Object navigatable = e.getData(CommonDataKeys.NAVIGATABLE);
//        if (navigatable != null) {
            Messages.showDialog("message", "Selected Element:", new String[]{"OK"}, -1, null);
//        }
    }
}
