import java.security.MessageDigest;

abstract class User {

    protected String username;
    protected String email;
    protected String passwordHash;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.passwordHash = hashPassword(password);
    }

    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            byte[] hashBytes = md.digest(password.getBytes());

            StringBuilder sb = new StringBuilder();

            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }

            return sb.toString();

        } catch (Exception e) {
            System.out.println("Hashing Error: " + e.getMessage());
            return null;
        }
    }

    public boolean verifyUser(String password) {
        return passwordHash.equals(hashPassword(password));
    }

    public void likePost(Post post) {
        post.likePost();
    }

    public void commentPost(Post post, String comment) {
        post.commentPost(comment);
    }

    public abstract void createPost(String content);

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }
}
