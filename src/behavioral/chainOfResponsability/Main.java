package behavioral.chainOfResponsability;

import behavioral.chainOfResponsability.handler.AuthHandler;
import behavioral.chainOfResponsability.handler.AuthenticationHandler;
import behavioral.chainOfResponsability.handler.PermissionCheckHandler;
import behavioral.chainOfResponsability.handler.RoleCheckHandler;
import behavioral.chainOfResponsability.request.UserRequest;

public class Main {
    public static void main(String[] args) {
        AuthHandler authHandler = new AuthenticationHandler();
        AuthHandler roleHandler = new RoleCheckHandler();
        AuthHandler permissionHandler = new PermissionCheckHandler();

        authHandler.setNextHandler(roleHandler);
        roleHandler.setNextHandler(permissionHandler);
        UserRequest request = new UserRequest("user", "password", "ADMIN", "READ");
        authHandler.handleRequest(request);
    }
}
