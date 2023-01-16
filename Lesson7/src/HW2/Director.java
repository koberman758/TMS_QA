package HW2;

public class Director implements Person {

    private String post;

    public Director() {
    }

    public Director(String post) {
        this.post = post;
    }

    @Override
    public void print() {
        System.out.println(post);
    }

    public String getPost() {
        return post;
    }
}
