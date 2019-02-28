package problem02;

public class MyService extends BaseService {
 
	@Override
	public void service(String state) {
		
		
		String result = state.equals("낮") ? day() : state.equals("오후") ? afternoon() : night();
		System.out.println(result);
	}
	@Override
	public String day() {
		
		return super.day()+"서비스 시작";
	}
	public String afternoon() {
		return "오후서비스시작";
	}
	@Override
	public String night() {
		// TODO Auto-generated method stub
		return super.night()+"서비스시작";
	}
	
}
