package Apr6Lab;

import java.io.*;
import java.util.Arrays;

public class ReadFileIntoByteArray {
    public static void main(String[] args) {
        byte[] arr = null;
        try {
            File file = new File("D:\\stuff\\demo.txt");
            FileInputStream fis = new FileInputStream(file);
            arr = new byte[(int)file.length()];
            fis.read(arr);
            fis.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("File content as byte array:");
        System.out.println(Arrays.toString(arr));
    }
}
