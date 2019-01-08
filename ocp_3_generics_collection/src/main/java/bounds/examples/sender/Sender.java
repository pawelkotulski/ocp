package bounds.examples.sender;

public class Sender <T extends Request, R extends Response> {

    private T request;
    private R response;


    public R sendRequest(T request) {
        return response;
    }
}
