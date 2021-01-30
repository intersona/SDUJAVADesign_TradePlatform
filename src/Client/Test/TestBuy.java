package Client.Test;

import base.BaseVariable;
import base.DIYClass.Message;
import base.DIYClass.Time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TestBuy {
     public static void main(String[] args) throws IOException, ClassNotFoundException {
//         Scanner scanner = new Scanner(System.in);
//         String item = scanner.next();
//         String buyer = scanner.next();
        Socket socket = null;
        try {
            socket = new Socket("127.0.0.1", BaseVariable.BUY_ITEM_PORT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

         Message message = new Message();
         message.setContext("asd");
         message.setGetter("test1");
         message.setSender("admin");
         message.setSendTime(new Time().getDetail());
         oos.writeObject(message);

         Message m2 = (Message) ois.readObject();

         System.out.println(m2.getContext());
    }
}
