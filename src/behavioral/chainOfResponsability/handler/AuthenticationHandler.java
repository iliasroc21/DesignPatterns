package behavioral.chainOfResponsability.handler;

import behavioral.chainOfResponsability.request.UserRequest;

public class AuthenticationHandler extends AuthHandler{
    @Override
    public boolean handle(UserRequest userRequest) {
        if ("user".equals(userRequest.getUsername()) && "password".equals(userRequest.getPassword())) {
            System.out.println("Authentication successful.");
            return true;
        }
        System.out.println("Authentication failed.");
        return false;
    }
}
