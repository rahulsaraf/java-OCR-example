/**
 * 
 */
package ocr.using.tesseract;
import java.io.File;
import java.io.IOException;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

/**
 * @author Rahul
 *
 */
public class MyOCR {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		File file = new File("C:/Users/Rahul/workspaceJava/OCRProject/schedule_test1.png");
		Tesseract instance = Tesseract.getInstance();
		
		try {
            String result = instance.doOCR(file);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
	}
}
