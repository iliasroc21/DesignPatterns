package behavioral.command.actions;

import behavioral.command.editor.TextEditor;

public class CopyCommand implements Command {
    private final TextEditor textEditor;
    private final String text;

    public CopyCommand(TextEditor textEditor , String text) {
        this.textEditor = textEditor;
        this.text = text;
    }

    @Override
    public void execute() {
        textEditor.copy(text);
    }
}
