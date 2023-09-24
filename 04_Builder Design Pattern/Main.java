public class Main {
    public static void main(String[] args) {
        User user1 = new User
                .UserBuilder()
                .setUserName("fahad")
                .setUserId("123")
                .setEmailId("iamfahad@gmail.com")
                .build();

        System.out.println(user1);

//        2nd way
        User user2 = User.UserBuilder.builder()
                .setUserName("user2")
                .setUserId("456")
                .setEmailId("user2@gmail.com")
                .build();

        System.out.println(user2);
    }
}
