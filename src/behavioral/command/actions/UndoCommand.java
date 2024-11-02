package behavioral.command.actions;

import behavioral.command.editor.TextEditor;

public class UndoCommand implements Command{
    private final TextEditor textEditor ;

    public UndoCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.undo();
    }
}
