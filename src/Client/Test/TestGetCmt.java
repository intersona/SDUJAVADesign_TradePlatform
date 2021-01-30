package Client.Test;

import base.BaseVariable;
import base.DIYClass.Comment;
import base.DIYClass.Item;
import base.DIYClass.Message;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestGetCmt {
    public static void main (String[] args){
        try {
            Socket socket = new Socket("127.0.0.1", BaseVariable.GET_COMMENT_PORT);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            Message message = new Message();
            message.setFileCon(0);// 测试时需要更改
            message.setContext("test1");
            message.setFileLen(3);
            oos.writeObject(message);

            Comment[] comments;
            comments = (Comment[]) ois.readObject();
//
//            Message[] msg = (Message[]) ois.readObject();

//            for (int i = 0; i < msg.length; i ++) {
//                System.out.println(msg[i].getContext() + " 时间为：" + msg[i].getSendTime());
//            }
            for(int i = 0; i <comments.length; i ++){
                System.out.println(comments[i].getComment());
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
