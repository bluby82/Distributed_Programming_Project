/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server_gc;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.util.logging.resources.logging;

/**
 *
 * @author RYAN
 */
public class HandleSocket extends Thread {

    ChatGUI parent;
    Socket client;
    DataOutputStream out;
    BufferedReader in;

    public HandleSocket(ChatGUI _parent, Socket _client) {
        this.parent = _parent;
        this.client = _client;
        try {
            out = new DataOutputStream(
                    client.getOutputStream());
            in = new BufferedReader(
                    new InputStreamReader(client.getInputStream()));
        } catch (Exception e) {
            System.out.println("Error di handlesocket " + e);
        }
    }

    public void sendChat(String tmp) {
        try {
            out.writeBytes(tmp + "\n");
        } catch (Exception e) {
            Logger.getLogger("Error di sendChat " + e);
        }
    }

    public void run() {
        while (true) {
            try {
                String tmp = in.readLine();
                parent.showChat(tmp);
            } catch (Exception e) {
                System.out.println("Error di run HandleSocket " + e);
            }
        }
    }
}
