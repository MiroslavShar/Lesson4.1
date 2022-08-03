public class Main {
    public  static void main(String[] args) {

    }
    public void aktive(Messenger messenger) {
        Messenger start = new Messenger() {
            @Override
            public void sendMessenger() {
                System.out.println("Send");

            }

            @Override
            public void getMessenger() {
                System.out.println("Get");

            }
        };
    }
}
