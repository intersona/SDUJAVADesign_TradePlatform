package Client.Test;

import base.BaseVariable;
import base.DIYClass.Item;
import base.DIYClass.Message;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class testFavorite {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            socket = new Socket("127.0.0.1", BaseVariable.FAVORITE_PORT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            Message message = new Message();
//≤‚ ‘ÃÌº”
            message.setFileCon(0);
            message.setContext("asd");
            message.setFileName("test4");
//≤‚ ‘ªÒ»°
//            message.setFileCon(1);
//            message.setContext("asd");
//            message.setFileName("test1");

            oos.writeObject(message);

            Message res = (Message) ois.readObject();

//            Item[] fs = (Item[]) ois.readObject();

            System.out.println(res.getContext());
//            for (int i = 0; i < fs.length; i++) {
//                System.out.println(fs[i].getName());
//            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
