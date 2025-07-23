package MethodClass;

public class MessageSender {
    //MessageSender() metodu yaz:
    //- MessageSender(String msg): mesajı bir dəfə çap et
    //- MessageSender(String msg, int repeat): mesajı istədiyin sayda təkrar çap et

    public void sendMessage(String message){
        System.out.println(message);
    }
    public  void  sendMessage(String message,int tekrar){
        for (int i = 0;i <= tekrar;i ++){
            System.out.println(message);
        }

    }
}
