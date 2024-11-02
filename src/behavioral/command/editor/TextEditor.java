package behavioral.command.editor;

public class TextEditor {
    private String clipboard ;
    public void copy(String text) {
        this.clipboard = text;
        System.out.println("Text copied to clipboard: " + text);
    }

    public void paste() {
        if (clipboard != null) {
            System.out.println("Text pasted from clipboard: " + clipboard);
        } else {
            System.out.println("Clipboard is empty.");
        }
    }
    public void undo() {
        System.out.println("Last action undone");
    }
}
