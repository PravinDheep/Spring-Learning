package com.corejava;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Pradeep
 */
public class InputStreamToString {
    
    public static void main(String[] args) throws IOException {
        InputStream is = new ByteArrayInputStream("This is a text book".getBytes());
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader bf = new BufferedReader(isr);
        StringBuilder sb = new StringBuilder();
        String content;
        while((content = bf.readLine()) != null){
            sb.append(content);
        }
        System.out.println("Content: \t" + sb.toString());
    }
}
