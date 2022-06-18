package com.valdal14.SocketProgramming.socketchat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

    public static void main(String[] args) {

        try(ServerSocket server = new ServerSocket(3001);
            Socket socket = server.accept();
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            String messageReceived = "", messageToSend = "";
            while (true){
                messageReceived = in.readUTF();
                System.out.println("Client: " + messageReceived);
                if(messageReceived.equals("close")){
                    break;
                }
                // in the message
                System.out.print(":> ");
                messageToSend = br.readLine();
                out.writeUTF(messageToSend);
                // buffering
                out.flush();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
