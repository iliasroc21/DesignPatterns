package behavioral.mediator;

import behavioral.mediator.component.Button;
import behavioral.mediator.component.Checkbox;
import behavioral.mediator.component.Textbox;
import behavioral.mediator.mediator.FormMediator;

public class Main {
    public static void main(String[] args) {
        FormMediator mediator = new FormMediator();

        Checkbox modeSwitch = new Checkbox(mediator);
        Textbox usernameField = new Textbox(mediator);
        Textbox passwordField = new Textbox(mediator);
        Textbox emailField = new Textbox(mediator);
        Button submitButton = new Button(mediator);

        mediator.setModeSwitch(modeSwitch);
        mediator.setUsernameField(usernameField);
        mediator.setPasswordField(passwordField);
        mediator.setEmailField(emailField);
        mediator.setSubmitButton(submitButton);

        // Switch to registration mode
        modeSwitch.toggle(); // Checkbox is unchecked, registration mode
        usernameField.setText("new_user");
        passwordField.setText("password123");
        emailField.setText("new_user@example.com");
        submitButton.click(); // Register

        // Switch to login mode
        modeSwitch.toggle(); // Checkbox is checked, login mode
        usernameField.setText("existing_user");
        passwordField.setText("password456");
        submitButton.click(); // Log in
    }
}
