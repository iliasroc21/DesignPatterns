package behavioral.mediator.mediator;

import behavioral.mediator.component.Button;
import behavioral.mediator.component.Checkbox;
import behavioral.mediator.component.Component;
import behavioral.mediator.component.Textbox;

public class FormMediator implements Mediator{
    private Checkbox modeSwitch;
    private Textbox usernameField;
    private Textbox passwordField;
    private Textbox emailField;
    private Button submitButton;

    public void setModeSwitch(Checkbox modeSwitch) {
        this.modeSwitch = modeSwitch;
    }

    public void setUsernameField(Textbox usernameField) {
        this.usernameField = usernameField;
    }

    public void setPasswordField(Textbox passwordField) {
        this.passwordField = passwordField;
    }

    public void setEmailField(Textbox emailField) {
        this.emailField = emailField;
    }

    public void setSubmitButton(Button submitButton) {
        this.submitButton = submitButton;
    }

    @Override
    public void notifyComponent(Component sender, String event) {
        if (sender == modeSwitch && event.equals("check")) {
            if (modeSwitch.isChecked()) {
                showLoginMode();
            } else {
                showRegisterMode();
            }
        } else if (sender == submitButton && event.equals("click")) {
            if (modeSwitch.isChecked()) {
                System.out.println("Logging in with username: " + usernameField.getText());
            } else {
                System.out.println("Registering with username: " + usernameField.getText() +
                        ", email: " + emailField.getText());
            }
        }
    }

    private void showLoginMode() {
        System.out.println("Switching to login mode...");
        emailField.setVisible(false , "emailField");
        usernameField.setVisible(true ,"usernameField");
        passwordField.setVisible(true , "passwordFiled");
    }

    private void showRegisterMode() {
        System.out.println("Switching to registration mode...");
        emailField.setVisible(true , "emailField");
        usernameField.setVisible(true , "usernameField");
        passwordField.setVisible(true , "passwordFiled");
    }
}
