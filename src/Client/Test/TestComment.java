package Client.Test;

import base.BaseVariable;
import base.DIYClass.Comment;
import base.DIYClass.Item;
import base.DIYClass.Message;
import base.DIYClass.Time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TestComment {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String item= scanner.next();
        try {
            Socket socket = new Socket("127.0.0.1", BaseVariable.RELEASE_COMMENT_PORT);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            Comment comment = new Comment();

            Time time = new Time();
            System.out.println(time.getDetail());

            comment.setItem(item);
            comment.setComment("บÜบร");
            comment.setSender("admin");
            comment.setTime(time);

            oos.writeObject(comment);

            Message message = (Message) ois.readObject();
            System.out.println(message.getContext());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//        catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
