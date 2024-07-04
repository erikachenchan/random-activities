package moochfi.exercises;

import java.util.ArrayList;

public class Message {
    private String name;

    public Message(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Message sms = new Message("SMS");
        Message mms = new Message("MMS");


        ArrayList<Message> messages = new ArrayList<>();
        if (!messages.contains(sms)) {
            System.out.println("TRUE -It does contain sms inside the Message ArrayList");
            messages.add(sms);
        } else {
            System.out.println(" FALSE -It does NOT contain sms inside the Message ArrayList ");
        }

        if (!messages.contains(sms)) {
            System.out.println("TRUE - It does contain sms inside the Message ArrayList");
            messages.add(sms);
        } else {
            System.out.println("FALSE - It does NOT contain sms inside the Message ArrayList ");
        }

        if (!messages.contains(new Message("SMS"))) {
            System.out.println("TRUE - It does contain SMS");
            messages.add(sms);
        } else {
            System.out.println("FALSE - It does NOT contain SMS");
        }

        System.out.println(messages.size());
    }
}
