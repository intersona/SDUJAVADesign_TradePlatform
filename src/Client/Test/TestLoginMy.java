package Client.Test;

import base.DIYClass.Message;
import base.DIYClass.User;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class TestLoginMy {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String id = scanner.next();
        String pw = scanner.next();

        try {

            Socket socket = new Socket("127.0.0.1", 8787);

            OutputStream os = socket.getOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(os);
            User user = new User();
            user.setUserId(id);
            user.setPassword(pw);

            user.setName("lzh");
            user.setSex("male");
            user.setGrade("first");
            user.setMajor("SE");

            user.setAction(5);
            oos.writeObject(user);

            socket.shutdownOutput();

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Message message = (Message) ois.readObject();

            System.out.println("µÇÂ¼×´¿öÎª£º" + message.getContext());
            System.out.println("message number is:" + message.getFileLen());

            socket.shutdownInput();
            oos.close();
            os.close();
            ois.close();
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
