package behavioral.command.actions;

import behavioral.command.editor.TextEditor;

public class PasteCommand implements Command{
    private final TextEditor textEditor;

    public PasteCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.paste();
    }
}
