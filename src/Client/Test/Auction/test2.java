package Client.Test.Auction;

import base.BaseVariable;
import base.DIYClass.Message;
import base.DIYClass.User;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Socket socket = new Socket("127.0.0.1", BaseVariable.AUCTION_PORT);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            User user = new User();
            user.setUserId(scanner.next());
            oos.writeObject(user);
            new getMsg(socket);
            while (true) {
                Message message = new Message();
                message.setContext(scanner.next());
                oos.writeObject(message);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
