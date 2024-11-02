package behavioral.command;

import behavioral.command.actions.Command;
import behavioral.command.actions.CopyCommand;
import behavioral.command.actions.PasteCommand;
import behavioral.command.actions.UndoCommand;
import behavioral.command.editor.TextEditor;
import behavioral.command.invoker.Button;
import behavioral.command.invoker.ShortCut;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        // Commands
        Command copyCommand = new CopyCommand(editor, "Hello, World!");
        Command pasteCommand = new PasteCommand(editor);
        Command undoCommand = new UndoCommand(editor);

        // Buttons
        Button copyButton = new Button(copyCommand);
        Button pasteButton = new Button(pasteCommand);
        Button undoButton = new Button(undoCommand);

        // Shortcuts
        ShortCut copyShortcut = new ShortCut(copyCommand);
        ShortCut pasteShortcut = new ShortCut(pasteCommand);
        ShortCut undoShortcut = new ShortCut(undoCommand);

        // Simulate button clicks
        copyButton.click();
        pasteButton.click();
        undoButton.click();

        // Simulate shortcut keys
        copyShortcut.press();
        pasteShortcut.press();
        undoShortcut.press();
    }
}
