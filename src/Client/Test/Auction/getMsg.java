package Client.Test.Auction;

import base.DIYClass.Message;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class getMsg extends Thread {
    Socket socket;
    ObjectInputStream objectInputStream;

    public getMsg(Socket socket) throws IOException {
        this.socket = socket;

        start();
    }

    public void run() {
        while (true) {
            try {
                objectInputStream = new ObjectInputStream(socket.getInputStream());
                Message message = (Message) objectInputStream.readObject();
                System.out.println(message.getContext());
                System.out.println("出价人为:" + message.getSender());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
