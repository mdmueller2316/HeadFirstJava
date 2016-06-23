package SerializationFileIO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by mm40 on 6/22/2016.
 */
public class ServerReadWrite {


    public void ServerRead() {
        try {
            Socket chatSocket = new Socket();
            InputStreamReader stream = new InputStreamReader(chatSocket.getInputStream());
            BufferedReader reader = new BufferedReader(stream);
            String message = reader.readLine();
        } catch (java.io.IOException ex) {
            ex.printStackTrace();
        }

    }

    public void ServerWrite() {

        try {
            Socket chatSocket = new Socket();
            PrintWriter writer = new PrintWriter(chatSocket.getOutputStream());
            writer.println("Test");
            writer.print("Test Take Two");
        }

        catch (java.io.IOException ex){
            ex.printStackTrace();
        }
    }
}
