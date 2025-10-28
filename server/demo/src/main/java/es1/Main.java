package es1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws IOException {
    ServerSocket server = new ServerSocket(3000);

    while(true){

        Socket s = server.accept();
         Miothread s1 = new Miothread(s);
         s1.start();

    }
    
    










}

}