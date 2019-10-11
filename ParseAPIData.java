import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

class parseAPIData {

  public static void main(String[] args) {

    try {

      URL website = new URL("https://repology.org/api/v1/projects/?inrepo=homebrew&outdated=1");
      ReadableByteChannel rbc = Channels.newChannel(website.openStream());
      FileOutputStream fos = new FileOutputStream("data.txt");
      fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);

    } catch (IOException e) {

      e.printStackTrace();

    } finally {

      System.out.println("Done Running!");

    }

  }

}
