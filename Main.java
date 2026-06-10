public class Main {

    public static void main(String[] args) {

        try {

            RegularUser user1 =
                    new RegularUser(
                            "Ali",
                            "ali@gmail.com",
                            "pass123");

            BusinessUser business1 =
                    new BusinessUser(
                            "TechStore",
                            "tech@gmail.com",
                            "admin123");

            // Login Verification
            if (user1.verifyUser("pass123")) {
                System.out.println(
                        "Regular User Verified");
            }

            // Create Posts
            user1.createPost("My first post");
            user1.createPost("Learning Java OOP");
            user1.createPost("Post 3");
            user1.createPost("Post 4");
            user1.createPost("Post 5");

            // Exceeds limit
            user1.createPost("Post 6");

            user1.viewFeed();

            // Like and Comment
            Post p =
                new Post("Java is awesome!");

            user1.likePost(p);
            user1.commentPost(
                    p,
                    "Great post!");

            p.display();

            // Business User Promotion
            Post ad =
                new Post("50% Sale Today!");

            business1.promotePost(ad);

            // Save Users to File
            UserFileManager.saveUser(user1);
            UserFileManager.saveUser(business1);

        }
        catch (Exception e) {

            System.out.println(
                    "Unexpected Error: "
                    + e.getMessage());
        }
    }
}
