package creational.builder;

public class Main {
    public static void main(String[] args) {
        Post post = new Post.Builder()
                .title("Camera")
                .category("Horror")
                .text("Hey Ho").build();
        System.out.println("Title of Post is : "+post.getTitle());
        System.out.println("Cateogory of Post is : "+post.getCategory());
        System.out.println("Text of Post is : "+post.getText());

    }
}
