package nl.thedutchruben;

import java.io.File;
import java.io.FileInputStream;
import java.net.ServerSocket;

public class Server {


    public Server(File file){
        try (ServerSocket serverSocket = new ServerSocket(6666)){
            FileInputStream fileInputStream = new FileInputStream(file);
            if(serverSocket.isBound()){

            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
