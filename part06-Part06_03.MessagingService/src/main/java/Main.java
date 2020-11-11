
public class Main {

    public static void main(String[] args) {

        
        // Try out your class here
        
        MessagingService service = new MessagingService();
        
        
        
        Message myMsg = new Message("Steve", "Hello world");
        
        service.add(myMsg);
        
        service.getMessages().forEach((msg) -> {
            System.out.println(msg);
        });
    }
}
