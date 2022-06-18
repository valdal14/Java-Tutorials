package com.valdal14.SocketProgramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        try(Socket client = new Socket("localhost", 3001)) {
            DataInputStream dataInputStream = new DataInputStream(client.getInputStream());
            String message = dataInputStream.readUTF();
            System.out.print(message);
            String id = sc.next();
            DataOutputStream dataOutputStream = new DataOutputStream(client.getOutputStream());
            dataOutputStream.writeUTF(id);
            // pwd
            message = dataInputStream.readUTF();
            System.out.print(message);
            String pwd = sc.next();
            dataOutputStream.writeUTF(pwd);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
