import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",1808);

            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

            //print whole sentence
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            while (true) {
                System.out.println(bufferedReader.readLine());
            }

            //One character at a time
            //System.out.println((char) inputStreamReader.read());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
