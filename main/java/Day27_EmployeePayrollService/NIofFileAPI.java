package Day27_EmployeePayrollService;

import java.io.File;

public class NIofFileAPI {

    /* This method is implemented to delete the existing files */
    public static boolean deleteFiles(File contentsToDelete) {
        File[] allContents = contentsToDelete.listFiles();
        if (allContents != null) {
            for (File file : allContents) {
                deleteFiles(file);
            }
        }
        return contentsToDelete.delete();
    }
}
