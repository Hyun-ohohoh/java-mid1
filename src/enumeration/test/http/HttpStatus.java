package enumeration.test.http;

public enum HttpStatus {
    OK(200, "OK"), BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"), INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage(){
        return message;
    }

//    public static HttpStatus findByCode(int httpCodeInput){
//        HttpStatus status = new HttpStatus(httpCodeInput, );
//        if(httpCodeInput >= 200 && httpCodeInput <= 299){
//            status = OK;
//        } else if(httpCodeInput == 400){
//            status = BAD_REQUEST;
//        } else if(httpCodeInput == 404){
//            status = NOT_FOUND;
//        } else if(httpCodeInput == 500){
//            status = INTERNAL_SERVER_ERROR;
//        }
//        return status;
//    }

    public static HttpStatus findByCode(int code){
        HttpStatus[] values = values();
        for (HttpStatus status : values) {
            if(status.getCode() == code){
                return status;
            }
        }
        return null;
    }



    public boolean isSuccess(){
        return code >= 200 && code <= 299;
    }



}
