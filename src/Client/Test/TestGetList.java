package Client.Test;

import base.BaseVariable;
import base.DIYClass.Item;
import base.DIYClass.Message;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestGetList {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", BaseVariable.GET_LIST_PORT);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Item[] items;


            Message message = new Message();
            message.setFileCon(3);
            message.setContext("admin");
            oos.writeObject(message);
            items = (Item[]) ois.readObject();

            for (int i = 0; i < items.length; i++) {
//                if (items[i] == null) break;
                    System.out.println(items[i].getName());
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
