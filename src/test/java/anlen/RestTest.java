package anlen;

import anlen.controller.GreetingController;
import anlen.domain.Greeting;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@WebMvcTest(GreetingController.class)
public class RestTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void checkPojo(){
        Greeting gr1 = new Greeting(10,"Andrey");
        Greeting gr2 = new Greeting(10,"Andrey");
        System.out.println("toString:" + gr1.toString());
        assertThat(gr1.equals(gr2)).isTrue();
        assertThat(gr1.getId()).isEqualTo(10);

        System.out.println("hashCode:" + gr1.hashCode());
    }

    @Test
    public void chechRest() throws Exception{
        mvc.perform(get("/greeting/?name=12").contentType(MediaType.ALL))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", is(1)));
    }

}
