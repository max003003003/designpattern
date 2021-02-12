package obsserver_pattern;

import obsserver_pattern.normal.Observer;
import obsserver_pattern.normal.WeatherData;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;

import static org.mockito.Mockito.*;

public class WeatherDataTest {
    @Captor
    ArgumentCaptor<Observer> captor = ArgumentCaptor.forClass(Observer.class);

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void shouldRegisterObserver() throws Exception {
        WeatherData spySubject = spy(WeatherData.class);
        Observer mockObserver = mock(Observer.class);

        spySubject.registerObserver(mockObserver);
        verify(spySubject).registerObserver(mockObserver);
    }

    @Test
    public void shouldRemoveObserver() throws Exception {
        WeatherData spySubject = spy(WeatherData.class);
        Observer mockObserver1 = mock(Observer.class);
        spySubject.removeObserver(mockObserver1);
        verify(spySubject).removeObserver(mockObserver1);
    }

    @Test
    public void observerShouldGetUpdateWhenSubjectUpdateValue() throws Exception {
        WeatherData spySubject = spy(WeatherData.class);
        Observer mockObserver1 = mock(Observer.class);
        spySubject.registerObserver(mockObserver1);
        spySubject.notifyObserver();
        verify(mockObserver1).update(any(Float.class), any(Float.class), any(Float.class));
    }

    @Test
    public void shouldNotifyObserverWhenMeasureWeather() throws Exception {
        WeatherData spySubject = spy(WeatherData.class);
        Observer mockObserver1 = mock(Observer.class);
        spySubject.measurementsChange();
        verify(spySubject).notifyObserver();
    }

    @Test
    public void shouldNotifyObserverWhenSetMeasureWeather() throws Exception {
        WeatherData spySubject = spy(WeatherData.class);
        Observer mockObserver1 = mock(Observer.class);
        spySubject.setMeasurements(1.0f,2.0f,3.0f);
        verify(spySubject).measurementsChange();
    }

    @Test
    public void shouldUpdateValueToObserverWhenSetMeasure() throws Exception {
        WeatherData spySubject = spy(WeatherData.class);
        Observer mockObserver1 = mock(Observer.class);
        spySubject.registerObserver(mockObserver1);
        spySubject.setMeasurements(1.0f,2.0f,3.0f);
        verify(spySubject).measurementsChange();
        verify(spySubject).notifyObserver();
        verify(mockObserver1).update(1.0f,2.0f, 3.0f);
    }

    @Test
    public void shouldRemoveObservers() throws Exception {
        WeatherData spySubject = spy(WeatherData.class);
        Observer mockObserver1 = mock(Observer.class);
        Observer mockObserver2 = mock(Observer.class);
        spySubject.registerObserver(mockObserver1);
        spySubject.registerObserver(mockObserver2);
        spySubject.removeObserver(mockObserver2);
        spySubject.setMeasurements(1.0f,2.0f,3.0f);
        verify(spySubject).measurementsChange();
        verify(spySubject).notifyObserver();
        verify(mockObserver1).update(1.0f,2.0f, 3.0f);
    }

}
