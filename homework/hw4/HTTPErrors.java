package homework.hw4;

public class HTTPErrors {

	private enum HTTPError {
		BadRequest, AuthorizationRequired, Forbidden, NotFound, RequestTimeOut, Gone
	}

	private int errorNumber;

	public int getErrorNumber() {
		return errorNumber;
	}

	public void setErrorNumber(int errorNumber) {
		this.errorNumber = errorNumber;
	}

	public HTTPErrors() {
	}

	public HTTPErrors(int errorNumber) {
		this.errorNumber = errorNumber;
	}

	public void errorList() {
		HTTPError error;
		switch (this.errorNumber) {
		case 400:
			error = HTTPError.BadRequest;
			System.out.println(error);
			break;
		case 401:
			error = HTTPError.AuthorizationRequired;
			System.out.println(error);
			break;
		case 403:
			error = HTTPError.Forbidden;
			System.out.println(error);
			break;
		case 404:
			error = HTTPError.NotFound;
			System.out.println(error);
			break;
		case 408:
			error = HTTPError.RequestTimeOut;
			System.out.println(error);
			break;
		case 410:
			error = HTTPError.Gone;
			System.out.println(error);
			break;
		default:
			System.out.println("Wrong number");
			break;
		}
	}

}
