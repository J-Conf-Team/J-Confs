import java.net.URL;

import io.github.oliviercailloux.y2018.jconfs.Conference;
import io.github.oliviercailloux.y2018.jconfs.ConferenceWriter;
public class TestConferenceWriter {
	public static void main (String [] args) throws Exception {
		Conference conferenceToWrite = new Conference(new URL("http://www.test.com"));
		conferenceToWrite.setTitle("coucou");
		conferenceToWrite.setCountry("America");
		conferenceToWrite.setCity("New_YorkS");
		conferenceToWrite.setEndDate("04/01/2018");
		conferenceToWrite.setStartDate("06/06/2017");
		conferenceToWrite.setFeeRegistration(12.5);
		ConferenceWriter.writeCalendarFiles(conferenceToWrite.getTitle(),conferenceToWrite);
		
		System.out.println("done");
	}

}
