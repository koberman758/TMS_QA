package HW2;

public class Accountant implements Person {
    private String post;

    public Accountant() {

    }

    public Accountant(String post) {
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
