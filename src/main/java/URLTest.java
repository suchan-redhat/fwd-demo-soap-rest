
public class URLTest {
	public static void main(String[] args) {
		try{
			  System.out.println("Connecting to localhost");
			  java.net.URL url = new java.net.URL(args[1]);
			  java.net.HttpURLConnection conn = (java.net.HttpURLConnection) url.openConnection();
			  conn.setRequestMethod("GET");
			  //conn.setRequestProperty("Accept", "application/json");
			  if (conn.getResponseCode() != 200) {
			    System.out.println("ERROR");
			  }
			  java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(conn.getInputStream()));
			  String output;
			  String resultStr="";
			  System.out.println("Out put from Server ... ... ");
			  while ((output = br.readLine()) != null) {
			    System.out.println(output);
				resultStr += output;
			  }
			  conn.disconnect();
		}
		catch (Exception e){
		  System.out.println("Exception !!!! ");
		  e.printStackTrace();
		}
	}
}
