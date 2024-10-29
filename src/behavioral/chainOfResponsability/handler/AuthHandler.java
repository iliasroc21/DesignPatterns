package behavioral.chainOfResponsability.handler;

import behavioral.chainOfResponsability.request.UserRequest;

public abstract class AuthHandler {
    protected AuthHandler nextHandler;
    public void setNextHandler(AuthHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public void handleRequest(UserRequest userRequest){
        if(handle(userRequest) && nextHandler!=null){
            nextHandler.handleRequest(userRequest);
        }
    }
    public abstract boolean handle(UserRequest userRequest);
}
