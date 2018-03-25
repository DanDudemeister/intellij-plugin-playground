import com.intellij.codeInspection.InspectionToolProvider;
import org.jetbrains.annotations.NotNull;

public class InspectClass implements InspectionToolProvider {


    @NotNull
    @Override
    public Class[] getInspectionClasses() {
        return new Class[]{ComparingReferencesInspection.class};
    }
}
