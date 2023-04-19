package Day7.HomeWork;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ConnectServerTelnet  {
    
    public static void main(String[] args) {
        try (var s = new ServerSocket(8189) ) {
            int i = 1;

            while (true) {
                Socket incoming = s.accept();
                System.out.println("Spwaning " + i );
                Runnable r = new ThreadedEchoHandler(incoming);
                var t = new Thread(r);
                t.start();
                i++;
            }

        } catch(IOException e) {
            e.printStackTrace();
        }


    }

}

class ThreadedEchoHandler implements Runnable {

    private Socket incoming;

    public ThreadedEchoHandler(Socket incomingSocket) {
        incoming = incomingSocket;
    }

    @Override
    public void run() {
        
    }

}