class RegularUser extends User {

    private static final int MAX_POSTS = 5;
    private static final int MAX_FEED_SIZE = 10;

    private int postCount;

    private Post[] feed;
    private int feedSize;

    public RegularUser(String username,
                       String email,
                       String password) {

        super(username, email, password);

        feed = new Post[MAX_FEED_SIZE];
        feedSize = 0;
        postCount = 0;
    }

    @Override
    public void createPost(String content) {

        if (postCount >= MAX_POSTS) {
            System.out.println("Post limit reached!");
            return;
        }

        Post p = new Post(content);

        addToFeed(p);

        postCount++;

        System.out.println(username +
                " posted successfully.");
    }

    public void addToFeed(Post post) {

        if (feedSize < MAX_FEED_SIZE) {
            feed[feedSize++] = post;
        }
        else {
            System.out.println("Feed is full.");
        }
    }

    public void viewFeed() {

        System.out.println("\nFeed of " + username);

        for (int i = 0; i < feedSize; i++) {
            feed[i].display();
        }
    }
}
