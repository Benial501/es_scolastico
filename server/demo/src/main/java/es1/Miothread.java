package es1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Miothread extends Thread {
    
private Socket s;

Miothread(Socket s){

    this.s = s;
}

@Override
public void run() {

    try {
        while(true){

            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            String myString = in.readLine();
           if(myString.equals("!")){
            break;
           }
           String s1 = myString.toUpperCase();
           out.println(s1);
        }
    } catch (Exception e) {
      
    }
   
}
}
