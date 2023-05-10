import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        System.out.println("Port 12345 is open for connection...");
        try {
            ServerSocket serverSocket = new ServerSocket(1808);
            Socket socket = serverSocket.accept();

            OutputStream outputStream = socket .getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream,true);

            System.out.println("A new client connected");

            Scanner scanner = new Scanner(System.in);
            //printWriter.println("Hello world");

            while (true) {
                System.out.println("Enter words");
                String msg = scanner.nextLine();
                printWriter.println(msg);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}