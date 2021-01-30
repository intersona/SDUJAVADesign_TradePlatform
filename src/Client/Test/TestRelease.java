package Client.Test;

import base.BaseVariable;
import base.DIYClass.Item;
import base.DIYClass.Message;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TestRelease {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        try {
            Socket socket = new Socket("127.0.0.1", BaseVariable.RELEASE_ITEM_PORT);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            Item item = new Item();
            item.setName(name);
            oos.writeObject(item);
            Message message = (Message) ois.readObject();
            System.out.println(message.getContext());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
