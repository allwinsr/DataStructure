/**
 * 
 */
package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author allwin.raj
 *
 */
public class ModifySequence {

	/**
	 * 
	 */
	public ModifySequence() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        line = br.readLine();
        int[] nos = new int[100];
        for (int i = 0; i < N; i++) {
        	nos[i] = Integer.parseInt(line, br.read());
            System.out.println(line);
        }
		
	}

}
