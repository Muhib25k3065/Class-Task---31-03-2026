class Post {
    private String content;
    private int likes;

    public Post(String content) {
        this.content = content;
        this.likes = 0;
    }

    public void likePost() {
        likes++;
    }

    public void commentPost(String comment) {
        System.out.println("Comment Added: " + comment);
    }

    public void display() {
        System.out.println("-------------------");
        System.out.println("Post: " + content);
        System.out.println("Likes: " + likes);
    }

    public String getContent() {
        return content;
    }
}
