package obsserver_pattern.normal;

import com.google.common.util.concurrent.AsyncCallable;
import com.sun.org.apache.xalan.internal.xsltc.runtime.ErrorMessages_zh_CN;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
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
    public void shouldSubscribe() throws Exception {
        Observer mockObserver = mock(CurrentConditionDisplay.class);

        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(mockObserver);



    }
}
