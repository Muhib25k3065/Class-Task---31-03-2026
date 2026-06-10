class BusinessUser extends User {

    public BusinessUser(String username,
                        String email,
                        String password) {

        super(username, email, password);
    }

    @Override
    public void createPost(String content) {

        Post p = new Post(content);

        System.out.println(username +
                " created a business post.");

        p.display();
    }

    public void promotePost(Post post) {

        System.out.println(
                "Promoting post: "
                + post.getContent());

        System.out.println(
                "This post now reaches a larger audience.");
    }
}
