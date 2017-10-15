package HW4;

public class HTTPErrors {
		private enum TypeErrors{
			BadRequest, Unauthorized, PaymentRequired, Forbidden, NotFound, MethodNotAllowed, NotAcceptable, ProxyAuthenticationRequired, RequestTimeout, Conflict, Gone
		}
		private int numb;
		public HTTPErrors(){
	
		}
		public HTTPErrors(int numb){
			this.numb=numb;
		}
		public int getNumb() {
			return numb;
		}
		public void setNumb(int numb) {
			this.numb = numb;
		}
		
		public void readError(){
			TypeErrors error;
			switch (this.numb){
			case 400: error=TypeErrors.BadRequest;
					System.out.println(this.numb+": "+error);
					break;
			case 401: error=TypeErrors.Unauthorized;
					System.out.println(this.numb+": "+error);
					break;
			case 402: error=TypeErrors.PaymentRequired;
					System.out.println(this.numb+": "+error);
					break;
			case 403: error=TypeErrors.Forbidden;
					System.out.println(this.numb+": "+error);
					break;
			case 404: error=TypeErrors.NotFound;
					System.out.println(this.numb+": "+error);
					break;
			case 405: error=TypeErrors.MethodNotAllowed;
					System.out.println(this.numb+": "+error);
					break;
			case 406: error=TypeErrors.NotAcceptable;
					System.out.println(this.numb+": "+error);
					break;
			case 407: error=TypeErrors.ProxyAuthenticationRequired;
					System.out.println(this.numb+": "+error);
					break;
			case 408: error=TypeErrors.RequestTimeout;
					System.out.println(this.numb+": "+error);
					break;
			case 409: error=TypeErrors.Conflict;
					System.out.println(this.numb+": "+error);
					break;
			case 410: error=TypeErrors.Gone;
					System.out.println(this.numb+": "+error);
					break;
			default:
					System.out.println("No this error");
					break;
			
			}
		}
		
		
		
}
