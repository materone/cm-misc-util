import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HttpCli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HttpCli cli = new HttpCli();
		cli.reqtest();
		cli.posttest();
	}
	
	private void reqtest() {
		// TODO Auto-generated method stub
		OkHttpClient client = new OkHttpClient();
		Request req = new Request.Builder().url("http://www.apache.org").build();
		try {
			Response resp = client.newCall(req).execute();
			System.out.println(resp.body().string());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void posttest() {
		// TODO Auto-generated method stub
		
	}

}
