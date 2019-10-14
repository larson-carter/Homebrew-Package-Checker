import java.net.HttpURLConnection;

import java.net.URL;

class VerifyResponseCode {

	public static void main(String [] args) {

		try {

			URL url = new URL("https://repology.org/api/v1/projects/?inrepo=homebrew&outdated=1");
			//Parse URL into HttpURLConnection in order to open the connection in order to get the JSON data

			HttpURLConnection connector = (HttpURLConnection)url.openConnection();
			//Set the request to GET or POST as per the requirements

			connector.setRequestMethod("GET");
			//Use the connect method to create the connection bridge

			connector.connect();
			//Get the response status of the Rest API

			int responsecode = connector.getResponseCode();

			System.out.println("Response code is: " + responsecode);

    }

		catch(Exception e) {

			e.printStackTrace();

		}

  }
  
}
