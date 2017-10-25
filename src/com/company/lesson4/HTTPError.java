package com.company.lesson4;

public enum HTTPError {
        BADREQUEST("Bad Request"),
        UNAUTHORIZED("Unauthorized"),
        PAYMENTREQUIRED("Payment Required"),
        FORBIDDEN("Forbidden"),
        NOTFOUND("NotFound"),
        METHODNOTALLOWED("Method Not Allowed"),
        NOTACCEPTABLE("Not Acceptable"),
        PROXYAUTHENTICATIONREQUIRED("Proxy Authentication Required"),
        REQUESTTIMEOUT("Request Timeout");

        private String errorName;

        HTTPError(String errorName){
            this.errorName = errorName;
        }

        public String getErrorName() {
            return this.errorName;
        }

}
