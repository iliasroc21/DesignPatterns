package creational.builder;

public class Post {
    private String title ;
    private String text;
    private String category ;
    public Post(Builder builder ){
        this.title = builder.title ;
        this.category  = builder.category;
        this.text = builder.text;
    }
    public static class Builder{
        private String title ;
        private String text;
        private String category;
        public Builder title(String title){
            this.title = title ;
            return this;
        }
        public Builder text(String text){
            this.text = text;
            return this;
        }
        public Builder category(String category){
            this.category = category;
            return this;
        }
        public Post build(){
            return new Post(this);
        }
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
