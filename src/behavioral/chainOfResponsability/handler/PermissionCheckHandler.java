package behavioral.chainOfResponsability.handler;

import behavioral.chainOfResponsability.request.UserRequest;

public class PermissionCheckHandler extends AuthHandler {
    @Override
    public boolean handle(UserRequest userRequest) {
        if ("READ".equals(userRequest.getPermission())) {
            System.out.println("Permission check successful.");
            return true;
        }
        System.out.println("Permission check failed.");
        return false;
    }
}
