package HW2;

public class Worker implements Person {
    private String post;

    public Worker() {
    }

    public Worker(String post) {
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
