package com.valdal14.SocketProgramming.socketchat;

import java.io.*;
import java.net.Socket;


public class ChatClient {

    public static void main(String[] args) {

        try(Socket client = new Socket("localhost", 3001);
            DataInputStream in = new DataInputStream(client.getInputStream());
            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            System.out.println("Server is up and running");

            String messageReceived = "", messageToSend = "";

            while (true){
                System.out.print(":> ");
                messageToSend = br.readLine();
                out.writeUTF(messageToSend);
                out.flush();
                if(messageToSend.equals("close")){
                    break;
                }
                // Read
                messageReceived = in.readUTF();
                System.out.println("Server: " + messageReceived);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
