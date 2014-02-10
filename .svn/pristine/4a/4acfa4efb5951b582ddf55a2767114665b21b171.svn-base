package algoritmo.lz.demo.gui;

import java.io.File;
import javax.swing.filechooser.FileFilter;

public class CustomFilter extends FileFilter{

     @Override
        public boolean accept(File file) {
            // Allow only directories, or files with ".txt" extension
            return file.isDirectory() || file.getAbsolutePath().endsWith(".txt");
        }
        @Override
        public String getDescription() {
            // This description will be displayed in the dialog,
            // hard-coded = ugly, should be done via I18N
            return "Text documents (*.txt)";
        }

    
}
