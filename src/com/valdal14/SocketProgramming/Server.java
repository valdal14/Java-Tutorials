package com.valdal14.SocketProgramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private static final String ID = "0001";
    private static final String PWD = "123456";

    public static void main(String[] args) {
        Server.connect();
    }

    private static void connect(){
        try(ServerSocket server = new ServerSocket(3001)) {
            System.out.println("Waiting for the client to connect....");
            // start listening
            Socket socket = server.accept();
            System.out.println("Connection established");

            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            dataOutputStream.writeUTF("Please Enter your ID: ");

            // Read data
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            String id = inputStream.readUTF();
            System.out.println("Data Received: " + id);

            // Ask for password
            dataOutputStream.writeUTF("Please Enter your PWD: ");
            // check password
            String pwd = inputStream.readUTF();
            System.out.println("Data Received: " + pwd);

            if(Server.authenticate(id, pwd)){
                dataOutputStream.writeUTF("Welcome to this server");
            } else {
                dataOutputStream.writeUTF("Invalid credentials, the session will be closed");
                dataOutputStream.close();
                inputStream.close();
                server.close();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean authenticate(String id, String pwd){
        return id.equals(Server.ID) && pwd.equals(Server.PWD);
    }
}
