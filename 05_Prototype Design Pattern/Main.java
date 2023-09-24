public class Main {
    public static void main(String[] args) {
        NetworkConnection networkConnection1 = new NetworkConnection();
        networkConnection1.setIp("172.168.1.1");
        networkConnection1.loadVeryImportantData();
        System.out.println(networkConnection1);

        //using clone method to create object.

        try{
            NetworkConnection networkConnection2 = (NetworkConnection) networkConnection1.clone();
            System.out.println(networkConnection2);
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

    }
}
