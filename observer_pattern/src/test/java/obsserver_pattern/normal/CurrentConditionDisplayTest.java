package obsserver_pattern.normal;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class CurrentConditionDisplayTest {
    @Test
    public void shouldReceiveUpdateStateFromSubjects() {
        WeatherData mockSubject = spy(WeatherData.class);
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(mockSubject);

        verify(mockSubject).registerObserver(currentConditionDisplay);
    }

    @Test
    public void shouldPrintToStreamWhenSubjectPublishNewValue() {
        WeatherData spySubject = spy(WeatherData.class);
        PrintStream outMock =  mock(PrintStream.class);
        System.setOut(outMock);
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(spySubject);
        spySubject.setMeasurements(1.0f,1.0f, 3.0f);
        verify(spySubject).registerObserver(currentConditionDisplay);
        verify(outMock).println(anyString());
    }


}
