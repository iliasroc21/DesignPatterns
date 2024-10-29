package behavioral.chainOfResponsability.handler;

import behavioral.chainOfResponsability.request.UserRequest;

public class RoleCheckHandler extends AuthHandler{
    @Override
    public boolean handle(UserRequest userRequest) {
        if ("ADMIN".equals(userRequest.getRole())) {
            System.out.println("Role check successful.");
            return true;
        }
        System.out.println("Role check failed.");
        return false;
    }
}
