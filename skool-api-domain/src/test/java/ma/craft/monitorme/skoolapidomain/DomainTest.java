package ma.craft.monitorme.skoolapidomain;


import ma.craft.monitorme.skoolapidomain.entity.Skooler;
import ma.craft.monitorme.skoolapidomain.entity.SkoolerFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class DomainTest {


    @Test
    public void shouldCreateASkooler(){
        Skooler skooler = SkoolerFactory.create().createSkooler("1",
                "name",
                "position",
                "mail"
                );
        Assert.assertNotNull(skooler);

    }

}
